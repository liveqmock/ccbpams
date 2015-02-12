package pams.service.sms;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pams.repository.dao.MaActiMainMapper;
import pams.repository.dao.MaSmsJrnlMapper;
import pams.repository.dao.MaSmsTplMapper;
import pams.repository.dao.sms.SmsMaMapper;
import pams.repository.model.MaSmsJrnl;
import pams.repository.model.MaSmsJrnlExample;
import pams.repository.model.MaSmsTpl;
import pams.repository.model.MaSmsTplExample;
import pams.repository.model.custlist.CustMngParam;
import pams.repository.model.sms.SmsCustInfo;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Created by zhanrui on 2015/2/9.
 * SMSӪ�����ͻ�����  ���ŷ���
 */
@Service
public class SmsMaService {
    @Autowired
    private SmsMaMapper smsMaMapper;
    @Autowired
    private MaSmsTplMapper smsTplMapper;
    @Autowired
    private MaSmsJrnlMapper smsJrnlMapper;

    public  List<SmsCustInfo> selectCustInfoForMarketingActivity(CustMngParam param) {
        if (StringUtils.isNotEmpty(param.getRptType())) {
            String[] list = param.getRptType().split("\\|");
            param.setMa_rpttype(list[0]);
            param.setMa_rptno(list[1]);
        }
        return smsMaMapper.selectCustInfoForMarketingActivity(param);
    }

    public  List<SmsCustInfo> selectCustInfoForSendSms(CustMngParam param) {
        if (StringUtils.isNotEmpty(param.getRptType())) {
            String[] list = param.getRptType().split("\\|");
            param.setMa_rpttype(list[0]);
            param.setMa_rptno(list[1]);
        }
        return smsMaMapper.selectCustInfoForSendSms(param);
    }

    public List<MaSmsTpl> selectSmsTplList(){
        MaSmsTplExample example = new MaSmsTplExample();
        example.createCriteria().andInvalidflagEqualTo("0");
        return smsTplMapper.selectByExample(example);
    }

    public  MaSmsTpl selectSmsTpl(String smsTplId){
        return  smsTplMapper.selectByPrimaryKey(smsTplId);
    }

    public void sendSms(SmsCustInfo custInfo){
        try {
            //����绰����
            String custPhone = custInfo.getContactInfo1();
            if (StringUtils.isEmpty(custPhone)) {
                //TODO
                custInfo.setStatus("F");
                custInfo.setRemark("�绰����Ϊ��");
                custInfo.setCustPhone("�޺���");
            } else {
                custPhone = custPhone.trim();
                if (custPhone.startsWith("0")) {
                    custPhone = custPhone.substring(1);
                }
                custInfo.setCustPhone(custPhone);

                if (custPhone.trim().length() == 11) {
                    //����
                    String response = sendOneSmsMsg(custInfo);

                    custInfo.setStatus("S"); //���ͳɹ�
                    custInfo.setSmsReqsn("");
                    custInfo.setSmsRespCode("000");
                    custInfo.setSmsRespMsg("SUC");
                }else{
                    //TODO
                    custInfo.setStatus("F");
                    custInfo.setRemark("�绰���벻��׼");
                    custInfo.setCustPhone(custPhone);
                }
            }

            //������ŷ�����־��
            MaSmsJrnl maSmsJrnl = new MaSmsJrnl();
            BeanUtils.copyProperties(maSmsJrnl, custInfo);

            smsJrnlMapper.insert(maSmsJrnl);
        } catch (Exception e) {
            throw new RuntimeException("���Ŵ���ʧ��", e);
        }
    }

    //===========
    private String sendOneSmsMsg(SmsCustInfo custInfo){
        return null;
    }
}
