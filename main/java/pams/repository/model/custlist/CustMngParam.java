package pams.repository.model.custlist;

import pams.repository.model.SvCmsCustbase;

/**
 * �ͻ�������Ϣά�� �ͻ�������ɵ�.
 * User: zhanrui
 * Date: 12-12-24
 * Time: ����1:56
 */
public class CustMngParam extends SvCmsCustbase {

    //�Ƿ���ʾ�ѷ��ɿͻ�����ļ�¼ false-����ʾ  true-��ʾ
    private boolean hideDispatchedFlag;

    //Ӫ���SMS ����
    private  String ma_rpttype;
    private  String ma_rptno;
    private  String actiNo;

    private int offset;
    private int pagesize;
    private String  sortField;
    private String  sortOrder;

    String[] custNameList;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }


    public boolean isHideDispatchedFlag() {
        return hideDispatchedFlag;
    }

    public void setHideDispatchedFlag(boolean hideDispatchedFlag) {
        this.hideDispatchedFlag = hideDispatchedFlag;
    }

    public String[] getCustNameList() {
        return custNameList;
    }

    public void setCustNameList(String[] custNameList) {
        this.custNameList = custNameList;
    }

    public String getMa_rpttype() {
        return ma_rpttype;
    }

    public void setMa_rpttype(String ma_rpttype) {
        this.ma_rpttype = ma_rpttype;
    }

    public String getMa_rptno() {
        return ma_rptno;
    }

    public void setMa_rptno(String ma_rptno) {
        this.ma_rptno = ma_rptno;
    }

    public String getActiNo() {
        return actiNo;
    }

    public void setActiNo(String actiNo) {
        this.actiNo = actiNo;
    }
}
