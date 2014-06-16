package pams.datachkserver.chkapps.saleevent.checkpoint.saving;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import pams.datachkserver.api.checkpoint.CheckPointException;
import pams.datachkserver.api.checkpoint.sep.SepCheckPoint;
import pams.datachkserver.api.checkpoint.sep.SepCheckPointRequest;
import pams.datachkserver.api.checkpoint.sep.SepCheckPointResponse;

import java.io.IOException;

/**
 * ���ڴ�����ȼ��
 * User: zhanrui
 * Date: 13-8-3
 * Time: ����7:47
 */
@Component("saving.CurrentDepCheck")
public class CurrentDepCheck extends SepCheckPoint {
    private static final Logger logger = LoggerFactory.getLogger(CurrentDepCheck.class);

    @Override
    public void doCheck(SepCheckPointRequest req, SepCheckPointResponse resp) throws CheckPointException, IOException {
        String dcc_custno = generateDccCustnoByCertInfo(req.getCertType(), req.getCertNo());
        if (dcc_custno == null) {
            resp.setRtnCode("2000");
            resp.setRtnMsg("δ�ҵ���Ӧ��DCC�ͻ���,���ܽ��м�˴���.");
            return;
        }

        String sql = "select count(*) from bf_evt_dep_sap where cust_no=? and sa_tx_dt=? and camount=?";
        int count = jdbcTemplate.queryForInt(sql, dcc_custno, req.getTxnDate(), req.getSalesAmt1());
        if (count == 0) {
            resp.setRtnCode("2001");
            resp.setRtnMsg("δ�ҵ���Ӧ�Ĵ���¼.");
        }else{
            resp.setRtnCode("0000");
            resp.setRtnMsg("���ҵ���Ӧ�Ĵ���¼.");
        }
    }
}