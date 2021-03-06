package pams.repository.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pams.repository.model.OdsbStlcrdBal;
import pams.repository.model.OdsbStlcrdBalExample;

public interface OdsbStlcrdBalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_STLCRD_BAL
     *
     * @mbggenerated Sat Apr 12 21:10:38 CST 2014
     */
    int countByExample(OdsbStlcrdBalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_STLCRD_BAL
     *
     * @mbggenerated Sat Apr 12 21:10:38 CST 2014
     */
    int deleteByExample(OdsbStlcrdBalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_STLCRD_BAL
     *
     * @mbggenerated Sat Apr 12 21:10:38 CST 2014
     */
    int deleteByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_STLCRD_BAL
     *
     * @mbggenerated Sat Apr 12 21:10:38 CST 2014
     */
    int insert(OdsbStlcrdBal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_STLCRD_BAL
     *
     * @mbggenerated Sat Apr 12 21:10:38 CST 2014
     */
    int insertSelective(OdsbStlcrdBal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_STLCRD_BAL
     *
     * @mbggenerated Sat Apr 12 21:10:38 CST 2014
     */
    List<OdsbStlcrdBal> selectByExample(OdsbStlcrdBalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_STLCRD_BAL
     *
     * @mbggenerated Sat Apr 12 21:10:38 CST 2014
     */
    OdsbStlcrdBal selectByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_STLCRD_BAL
     *
     * @mbggenerated Sat Apr 12 21:10:38 CST 2014
     */
    int updateByExampleSelective(@Param("record") OdsbStlcrdBal record, @Param("example") OdsbStlcrdBalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_STLCRD_BAL
     *
     * @mbggenerated Sat Apr 12 21:10:38 CST 2014
     */
    int updateByExample(@Param("record") OdsbStlcrdBal record, @Param("example") OdsbStlcrdBalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_STLCRD_BAL
     *
     * @mbggenerated Sat Apr 12 21:10:38 CST 2014
     */
    int updateByPrimaryKeySelective(OdsbStlcrdBal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_STLCRD_BAL
     *
     * @mbggenerated Sat Apr 12 21:10:38 CST 2014
     */
    int updateByPrimaryKey(OdsbStlcrdBal record);
}