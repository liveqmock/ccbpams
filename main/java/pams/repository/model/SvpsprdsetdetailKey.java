package pams.repository.model;

public class SvpsprdsetdetailKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SVPSPRDSETDETAIL.PRDID
     *
     * @mbggenerated Mon Apr 18 17:36:25 CST 2011
     */
    private String prdid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SVPSPRDSETDETAIL.PRDSETID
     *
     * @mbggenerated Mon Apr 18 17:36:25 CST 2011
     */
    private String prdsetid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SVPSPRDSETDETAIL.PRDID
     *
     * @return the value of SVPSPRDSETDETAIL.PRDID
     *
     * @mbggenerated Mon Apr 18 17:36:25 CST 2011
     */
    public String getPrdid() {
        return prdid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SVPSPRDSETDETAIL.PRDID
     *
     * @param prdid the value for SVPSPRDSETDETAIL.PRDID
     *
     * @mbggenerated Mon Apr 18 17:36:25 CST 2011
     */
    public void setPrdid(String prdid) {
        this.prdid = prdid == null ? null : prdid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SVPSPRDSETDETAIL.PRDSETID
     *
     * @return the value of SVPSPRDSETDETAIL.PRDSETID
     *
     * @mbggenerated Mon Apr 18 17:36:25 CST 2011
     */
    public String getPrdsetid() {
        return prdsetid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SVPSPRDSETDETAIL.PRDSETID
     *
     * @param prdsetid the value for SVPSPRDSETDETAIL.PRDSETID
     *
     * @mbggenerated Mon Apr 18 17:36:25 CST 2011
     */
    public void setPrdsetid(String prdsetid) {
        this.prdsetid = prdsetid == null ? null : prdsetid.trim();
    }
}