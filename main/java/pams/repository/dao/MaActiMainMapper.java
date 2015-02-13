package pams.repository.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pams.repository.model.MaActiMain;
import pams.repository.model.MaActiMainExample;

public interface MaActiMainMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MA_ACTI_MAIN
     *
     * @mbggenerated Thu Feb 12 17:18:25 CST 2015
     */
    int countByExample(MaActiMainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MA_ACTI_MAIN
     *
     * @mbggenerated Thu Feb 12 17:18:25 CST 2015
     */
    int deleteByExample(MaActiMainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MA_ACTI_MAIN
     *
     * @mbggenerated Thu Feb 12 17:18:25 CST 2015
     */
    int deleteByPrimaryKey(String actino);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MA_ACTI_MAIN
     *
     * @mbggenerated Thu Feb 12 17:18:25 CST 2015
     */
    int insert(MaActiMain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MA_ACTI_MAIN
     *
     * @mbggenerated Thu Feb 12 17:18:25 CST 2015
     */
    int insertSelective(MaActiMain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MA_ACTI_MAIN
     *
     * @mbggenerated Thu Feb 12 17:18:25 CST 2015
     */
    List<MaActiMain> selectByExample(MaActiMainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MA_ACTI_MAIN
     *
     * @mbggenerated Thu Feb 12 17:18:25 CST 2015
     */
    MaActiMain selectByPrimaryKey(String actino);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MA_ACTI_MAIN
     *
     * @mbggenerated Thu Feb 12 17:18:25 CST 2015
     */
    int updateByExampleSelective(@Param("record") MaActiMain record, @Param("example") MaActiMainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MA_ACTI_MAIN
     *
     * @mbggenerated Thu Feb 12 17:18:25 CST 2015
     */
    int updateByExample(@Param("record") MaActiMain record, @Param("example") MaActiMainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MA_ACTI_MAIN
     *
     * @mbggenerated Thu Feb 12 17:18:25 CST 2015
     */
    int updateByPrimaryKeySelective(MaActiMain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MA_ACTI_MAIN
     *
     * @mbggenerated Thu Feb 12 17:18:25 CST 2015
     */
    int updateByPrimaryKey(MaActiMain record);
}