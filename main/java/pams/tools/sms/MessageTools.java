package pams.tools.sms;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by suntengfei on 15-1-15.
 */
public class MessageTools {

    /**
     * Created by suntengfei on 15-1-15.
     * ���ɵ��ʶ��ŷ��ͱ���
     * <p/>
     * ��������������¸�ʽ������������"|"�ָ�ұ��밴������˳�򣩣�
     * ����ϵͳ���|��Ϣ�����ʺ�|���ţ����У�ID|�ͻ������ն˵�ַ|��Ϣ����|����ϵͳ����|�������ͱ���|���Ѻ���|�ֻ�����|����Ϣ������|�ͻ��ţ�֤���ţ�|�ͻ�����|
     * �˻���Ϣ���ʺţ�|�˻��䶯֪ͨ��־|ǩԼ�ͻ����ڵ������������|Ӫ�������ύ�˵�9λ����Ա����|Ӫ����������˵�9λ����Ա����
     * <p/>
     * ���ز�����ΪҪ���͵ı���
     */
    public String getSingleMessage(String messageArry) {
        String[] messages = messageArry.split("\\|");
        String messageBody = "";
        for (int i = 4; i < messages.length; i++) {
            String checkNessage = checkSingleMessageBody(messages[i], i);
            if (checkNessage.indexOf("false") >= 0) {
                return checkNessage;
            } else {
                messageBody = messageBody + checkNessage;
            }
        }
        return getMessage(messages[0], messages[1], messages[2], messages[3], messageBody, "001");
    }


    /**
     * Created by suntengfei on 15-1-15.
     * �����������ŷ��ͱ���
     * <p/>
     * �������Ϊ����˳������飺
     * ����Ա��|����ϵͳ���|��Ϣ�����ʺ�|���ţ����У�ID|�ͻ������ն˵�ַ|��Ϣ����|���ȼ�|ҵ��ϵͳ���|�ļ�����|�ļ���С|��������
     * <p/>
     * ���ز�����ΪҪ���͵ı���
     */
    public String getBatchOfMessage(String[] messages) {
        // String[] messages = messageArry.split("\\|");
        String messageBody = "";
        for (int i = 5; i < messages.length; i++) {
            String checkNessage = checkBatchBody(messages[i], i);
            if (checkNessage.indexOf("false") >= 0) {
                return checkNessage;
            } else {
                messageBody = messageBody + checkNessage;
            }
        }
        return getMessage(messages[1], messages[2], messages[3], messages[4], messageBody, "002");
    }

    /**
     * Created by suntengfei on 15-1-15.
     * �������ر��ģ����ʣ�����ͨ�ã�
     * <p/>
     * �������Ϊ���صı��ģ����������Ŀ�ͷ�ı��ĳ����ֶΣ����뵽�õ��ķ��ر��ĵľ����ֶε����
     * <p/>
     * ���ز�����Ϊ���ر��ĵ���Ӧ�ֶ���Ϣ�����ֶ�֮����"|"�ָ˳��Ϊ������ֶ���ŵ�˳��
     * <p/>
     * ����Ϊ���ر��ĵ��ֶκ���Ŷ�Ӧ��
     * <p/>
     * ��Ϣ�����ʺ�           1
     * ���ţ����У�ID         2
     * ϵͳ��������           3
     * ϵͳ����ʱ��           4
     * ����ϵͳ��ˮ��         5
     * �������ʱ��           6
     * �ͻ������ն˵�ַ       7
     * ���״���               8
     * ����״̬               9
     * ��Ӧ ��                10
     * ��Ӧ��Ϣ               11
     */
    public String getResponse(String message, int... responseNo) {
        return getResponseProduct(message, responseNo);
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Created by suntengfei on 15-1-15.
     * ��鵥�ʶ��ű�����ÿ���ֶγ����Ƿ����Ҫ��
     */
    private String checkSingleMessageBody(String message, int i) {
        switch (i) {
            case 4:
                if (message.length() != 3) {
                    return "\"��Ϣ����\"���Ȳ�����Ҫ��false" + message;
                } else {
                    return message;
                }
            case 5:
                if (message.length() != 6) {
                    return "\"����ϵͳ����\"���Ȳ�����Ҫ��false";
                } else {
                    return message;
                }
            case 6:
                if (message.length() > 20) {
                    return "\"�������ͱ���\"���ȳ���ϵͳҪ��false";
                } else {
                    return stringFormatR(message, 20);
                }
            case 7:
                if (message.length() > 15) {
                    return "\"���Ѻ���\"���ȳ���ϵͳҪ��false";
                } else {
                    return stringFormatR(message, 15);
                }
            case 8:
                if (message.length() > 13) {
                    return "\"�ֻ�����\"���ȳ���ϵͳҪ��false";
                } else {
                    return stringFormatR(message, 13);
                }
            case 9:
                return String.format("%04d", message.getBytes().length) + message;
            case 10:
                if (message.length() > 32) {
                    return "\"�ͻ��ţ�֤���ţ�\"���ȳ���ϵͳҪ��false";
                } else {
                    return stringFormatR(message, 32);
                }
            case 11:
                if (message.length() > 20) {
                    return "\"�ͻ�����\"���ȳ���ϵͳҪ��false";
                } else {
                    return stringFormatR(message, 20);
                }
            case 12:
                if (message.length() > 40) {
                    return "\"�˻���Ϣ���ʺţ�\"���ȳ���ϵͳҪ��false";
                } else {
                    return stringFormatR(message, 40);
                }
            case 13:
                if (message.length() > 6) {
                    return "\"�˻��䶯֪ͨ��־\"���ȳ���ϵͳҪ��false";
                } else {
                    return stringFormatR(message, 6);
                }
            case 14:
                if (message.length() > 9) {
                    return "\"ǩԼ�ͻ����ڵ������������\"���ȳ���ϵͳҪ��false";
                } else {
                    return stringFormatR(message, 9);
                }
            case 15:
                if (message.length() > 9) {
                    return "\"Ӫ�������ύ�˵�9λ����Ա����\"���ȳ���ϵͳҪ��false";
                } else {
                    return stringFormatR(message, 9);
                }
            case 16:
                if (message.length() > 9) {
                    return "\"Ӫ����������˵�9λ����Ա����\"���ȳ���ϵͳҪ��false";
                } else {
                    return stringFormatR(message, 9);
                }

        }
        return null;
    }

    /**
     * Created by suntengfei on 15-1-15.
     * ����������ű�����ÿ���ֶγ����Ƿ����Ҫ��
     */
    private String checkBatchBody(String message, int i) {
        switch (i) {
            case 5:
                if (message.length() != 3) {
                    return "\"��Ϣ����\"���Ȳ�����Ҫ��false";
                } else {
                    return message;
                }
            case 6:
                if (message.length() > 2) {
                    return "\"���ȼ�\"���Ȳ�����Ҫ��false";
                } else {
                    return stringFormatR(message, 2);
                }
            case 7:
                if (message.length() > 6) {
                    return "\"ҵ��ϵͳ���\"���ȳ���ϵͳҪ��false";
                } else {
                    return stringFormatR(message, 6);
                }
            case 8:
                if (message.length() > 64) {
                    return "\"�ļ�����\"���ȳ���ϵͳҪ��false";
                } else {
                    return stringFormatR(message, 64);
                }
            case 9:
                if (message.length() > 6) {
                    return "\"�ļ���С\"���ȳ���ϵͳҪ��false";
                } else {
                    return stringFormatR(message, 6);
                }
            case 10:
                if (message.length() > 5) {
                    return "\"��������\"���ȳ���ϵͳҪ��false";
                } else {
                    return stringFormatL(message, 5);
                }

        }
        return null;
    }

    /**
     * Created by suntengfei on 15-1-15.
     * �õ����ձ���
     */
    private String getMessage(String ReqSysNoString, String svrNo, String branch_id, String ip, String messageBody, String flag) {
        ReqSysNoString = stringFormatR(ReqSysNoString, 4);

        if (svrNo.length() > 15) {
            return "\"��Ϣ�����ʺ�\"���Ȳ�����Ҫ��";
        } else {
            svrNo = stringFormatR(svrNo, 15);
        }
        if (branch_id.length() > 11) {
            return "\"���ţ����У�ID\"���Ȳ�����Ҫ��";
        } else {
            branch_id = stringFormatR(branch_id, 11);
        }
        if (ip.length() > 16) {
            return "\"�ͻ������ն˵�ַ\"���Ȳ�����Ҫ��";
        } else {
            ip = stringFormatR(ip, 16);
        }
        /*message=message + svrNo + branch_id + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) +
                flag + GenerateSequenceUtil.generateSequenceNo() + ip + "M00" + flag + messageBody;*/
        String message = "M00" + flag + ReqSysNoString + svrNo + branch_id + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) +
                flag + GenerateSequenceUtil.generateSequenceNo() + ip + messageBody;
        return String.format("%04d", message.getBytes().length) + message;
    }

    /**
     * Created by suntengfei on 15-1-15.
     * �������ر���
     */
    private String getResponseProduct(String message, int[] responseNo) {
        int messageL = message.length();
        if (messageL < 150) {
            return message;
        }
        String messageResponses = "";
        for (int i = 0; i < responseNo.length; i++) {
            switch (responseNo[i]) {
                case 1:
                    messageResponses = messageResponses + message.substring(0, 15).trim() + "|";
                    break;
                case 2:
                    messageResponses = messageResponses + message.substring(15, 26).trim() + "|";
                    break;
                case 3:
                    messageResponses = messageResponses + message.substring(26, 34).trim() + "|";
                    break;
                case 4:
                    messageResponses = messageResponses + message.substring(34, 40).trim() + "|";
                    break;
                case 5:
                    messageResponses = messageResponses + message.substring(40, 60).trim() + "|";
                    break;
                case 6:
                    messageResponses = messageResponses + message.substring(60, 94).trim() + "|";
                    break;
                case 7:
                    messageResponses = messageResponses + message.substring(94, 126).trim() + "|";
                    break;
                case 8:
                    messageResponses = messageResponses + message.substring(126, 132).trim() + "|";
                    break;
                case 9:
                    messageResponses = messageResponses + message.substring(132, 142).trim() + "|";
                    break;
                case 10:
                    messageResponses = messageResponses + message.substring(142, 154).trim() + "|";
                    break;
                case 11:
                    messageResponses = messageResponses + message.substring(154, messageL).trim() + "|";
                    break;
            }
        }

        return messageResponses.substring(0, messageResponses.length() - 1);
    }

    private String stringFormatR(String str, int lenth) {
        int strL = str.getBytes().length;
        for (int i = 0; i < lenth - strL; i++) {
            str = str + " ";
        }
        return str;
    }

    private String stringFormatL(String str, int lenth) {
        int strL = str.getBytes().length;
        for (int i = 0; i < lenth - strL; i++) {
            str = " " + str;
        }
        return str;
    }
   /* public static void main(String[] args){
        // ��Ϣ�����ʺ�|���ţ����У�ID|�ͻ������ն˵�ַ|��Ϣ����|����ϵͳ����|�������ͱ���|���Ѻ���|�ֻ�����|����Ϣ������|�ͻ��ţ�֤���ţ�|�ͻ�����|
        // �˻���Ϣ���ʺţ�|�˻��䶯֪ͨ��־|ǩԼ�ͻ����ڵ������������|Ӫ�������ύ�˵�9λ����Ա����|Ӫ����������˵�9λ����Ա����
        String fasongdanbicanshu = "15wxiaoxifuwuzh|11bumenfhid|16kehuqudaodizhi|3lx|6wjrhm|20duanxinleixingbama|15weifufeihaoma|" +
                "13shoujihaoma|xinxineirongduochangdouxing|32wei11111111kehuhaozhengjianhao|20wei111kehuxingming|40zhanghuxinxizhanghao|" +
                "6zhbdb|9wwangdbm|9cazuoybm|9sczybnma";

        // ��Ϣ�����ʺ�|���ţ����У�ID|�ͻ������ն˵�ַ|��Ϣ����|���ȼ�|ҵ��ϵͳ���|�ļ�����|�ļ���С|��������
        String fasongpiliangcanshu = "15wxiaoxifuwuzh|11bumenfhid|16kehuqudaodizhi|3lx|2b|6ywxtb|64wenjianmingchenghenchangde|" +
                "6wejdx|5dxsl";

        // ��Ϣ�����ʺ�15���ţ����У�ID11 ϵͳ��������8ϵͳ����ʱ��6����ϵͳ��ˮ��20�ͻ������ն˵�ַ16 ���״���6��Ϣ�����ʺ�15
        //���ţ����У�ID11 ϵͳ��������8 ϵͳ����ʱ��6 ����ϵͳ��ˮ��20�������ʱ��34�ͻ������ն˵�ַ32 ���״���6����״̬10 ��Ӧ ��12��Ӧ��Ϣ
        String fanhuibaowen = "15xiaoxifuwuzh,11bumenfhi,201501191550502012345678987654321,16kehuqudaodizh,6jyda," +
                "15xiaoxifuwuzh,11bumenfhi,201501191550502012345678987654321,34chuliwanchengshijianzenmezhemec," +
                "32kehuqudaozhongduandizhiyechan,6jyda,10jiaoyzt,12xiangying,xiangyingxinxi,,,,,,,,";*/


    //System.out.println("���ʶ��ŷ��ͱ��ģ�" + getSingleMessage(fasongdanbicanshu));
        /*
        ���ʶ��ŷ��ͱ��ģ�0295
        15wxiaoxifuwuzh
        11bumenfhid
        20150119
        162140
        00101191621405930000
        16kehuqudaodizhi
        M00001
        3lx
        6wjrhm
        20duanxinleixingbama
        15weifufeihaoma
        13shoujihaoma
          27
        xinxineirongduochangdouxing
        32wei11111111kehuhaozhengjianhao
        20wei111kehuxingming
        40zhanghuxinxizhanghao
        6zhbdb
        9wwangdbm
        9cazuoybm
        9sczybnma
        */

    //System.out.println("�������ŷ��ͱ��ģ�" + getBatchOfMessage(fasongpiliangcanshu));
        /*
        0168
        15wxiaoxifuwuzh
        11bumenfhid
        20150119
        162659
        00201191626599530000
        16kehuqudaodizhi
        M00002
        3lx
        2b
        6ywxtb
        64wenjianmingchenghenchangde
        6wejdx
        5dxsl
        */
    //System.out.println("�õ����������" + getResponse(fanhuibaowen,2,16,17,18));
    //}

}
