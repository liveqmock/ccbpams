package pams.repository.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pams.repository.model.OdsbPldfBatch;
import pams.repository.model.OdsbPldfBatchExample;
import pams.repository.model.OdsbPldfBatchKey;

public interface OdsbPldfBatchMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_PLDF_BATCH
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    int countByExample(OdsbPldfBatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_PLDF_BATCH
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    int deleteByExample(OdsbPldfBatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_PLDF_BATCH
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    int deleteByPrimaryKey(OdsbPldfBatchKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_PLDF_BATCH
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    int insert(OdsbPldfBatch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_PLDF_BATCH
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    int insertSelective(OdsbPldfBatch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_PLDF_BATCH
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    List<OdsbPldfBatch> selectByExample(OdsbPldfBatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_PLDF_BATCH
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    OdsbPldfBatch selectByPrimaryKey(OdsbPldfBatchKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_PLDF_BATCH
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    int updateByExampleSelective(@Param("record") OdsbPldfBatch record, @Param("example") OdsbPldfBatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_PLDF_BATCH
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    int updateByExample(@Param("record") OdsbPldfBatch record, @Param("example") OdsbPldfBatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_PLDF_BATCH
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    int updateByPrimaryKeySelective(OdsbPldfBatch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_PLDF_BATCH
     *
     * @mbggenerated Sun Mar 01 19:22:27 CST 2015
     */
    int updateByPrimaryKey(OdsbPldfBatch record);
}