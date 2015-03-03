package pams.repository.model;

import java.math.BigDecimal;

public class OdsbPldfDtl extends OdsbPldfDtlKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ODSB_PLDF_DTL.ACCT_NO
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    private String acctNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ODSB_PLDF_DTL.ACCT_NAME
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    private String acctName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ODSB_PLDF_DTL.AG_BSC_EXP
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    private BigDecimal agBscExp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ODSB_PLDF_DTL.FAIL_REASON
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    private String failReason;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ODSB_PLDF_DTL.ACCT_NO
     *
     * @return the value of ODSB_PLDF_DTL.ACCT_NO
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    public String getAcctNo() {
        return acctNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ODSB_PLDF_DTL.ACCT_NO
     *
     * @param acctNo the value for ODSB_PLDF_DTL.ACCT_NO
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo == null ? null : acctNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ODSB_PLDF_DTL.ACCT_NAME
     *
     * @return the value of ODSB_PLDF_DTL.ACCT_NAME
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ODSB_PLDF_DTL.ACCT_NAME
     *
     * @param acctName the value for ODSB_PLDF_DTL.ACCT_NAME
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    public void setAcctName(String acctName) {
        this.acctName = acctName == null ? null : acctName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ODSB_PLDF_DTL.AG_BSC_EXP
     *
     * @return the value of ODSB_PLDF_DTL.AG_BSC_EXP
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    public BigDecimal getAgBscExp() {
        return agBscExp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ODSB_PLDF_DTL.AG_BSC_EXP
     *
     * @param agBscExp the value for ODSB_PLDF_DTL.AG_BSC_EXP
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    public void setAgBscExp(BigDecimal agBscExp) {
        this.agBscExp = agBscExp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ODSB_PLDF_DTL.FAIL_REASON
     *
     * @return the value of ODSB_PLDF_DTL.FAIL_REASON
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    public String getFailReason() {
        return failReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ODSB_PLDF_DTL.FAIL_REASON
     *
     * @param failReason the value for ODSB_PLDF_DTL.FAIL_REASON
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }
}