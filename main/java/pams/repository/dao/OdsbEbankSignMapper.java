package pams.repository.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pams.repository.model.OdsbEbankSign;
import pams.repository.model.OdsbEbankSignExample;

public interface OdsbEbankSignMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_EBANK_SIGN
     *
     * @mbggenerated Wed Feb 04 20:09:57 CST 2015
     */
    int countByExample(OdsbEbankSignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_EBANK_SIGN
     *
     * @mbggenerated Wed Feb 04 20:09:57 CST 2015
     */
    int deleteByExample(OdsbEbankSignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_EBANK_SIGN
     *
     * @mbggenerated Wed Feb 04 20:09:57 CST 2015
     */
    int insert(OdsbEbankSign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_EBANK_SIGN
     *
     * @mbggenerated Wed Feb 04 20:09:57 CST 2015
     */
    int insertSelective(OdsbEbankSign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_EBANK_SIGN
     *
     * @mbggenerated Wed Feb 04 20:09:57 CST 2015
     */
    List<OdsbEbankSign> selectByExample(OdsbEbankSignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_EBANK_SIGN
     *
     * @mbggenerated Wed Feb 04 20:09:57 CST 2015
     */
    int updateByExampleSelective(@Param("record") OdsbEbankSign record, @Param("example") OdsbEbankSignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_EBANK_SIGN
     *
     * @mbggenerated Wed Feb 04 20:09:57 CST 2015
     */
    int updateByExample(@Param("record") OdsbEbankSign record, @Param("example") OdsbEbankSignExample example);
}