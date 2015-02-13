package pams.repository.dao.sms;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import pams.repository.model.custlist.CustMngParam;
import pams.repository.model.sms.SmsCustInfo;

import java.util.List;

/**
 * User: zhanrui
 * Date: 2014-02-10
 * Time: ����8:22
 */
@Component
public interface SmsMaMapper {

    //�ͻ�����
    List<SmsCustInfo> selectCustInfoForMarketingActivity(CustMngParam bean);


    //���տͻ�����ͱ����Ų�ѯ�������ż�¼
    List<SmsCustInfo> selectCustInfoForSendSms(CustMngParam bean);
    //���տͻ�����ͱ����Ų�ѯ���ն��ŷ��ͼ�¼
    List<SmsCustInfo> selectCustInfoForSendSmsTodayHistory(CustMngParam bean);

    @Select("select rptname from  CLS_UD_TBLINFO t where t.rptno = #{rptno}")
    String selectUserdefRptName(String rptno);
}
