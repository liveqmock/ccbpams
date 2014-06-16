package pams.repository.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import pams.repository.model.SvintvinfDel;
import pams.repository.model.SvintvinfDelExample;

import java.util.List;

@Component
public interface SvintvinfDelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVINTVINF_DEL
     *
     * @mbggenerated Fri Apr 29 10:31:02 CST 2011
     */
    int countByExample(SvintvinfDelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVINTVINF_DEL
     *
     * @mbggenerated Fri Apr 29 10:31:02 CST 2011
     */
    int deleteByExample(SvintvinfDelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVINTVINF_DEL
     *
     * @mbggenerated Fri Apr 29 10:31:02 CST 2011
     */
    int deleteByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVINTVINF_DEL
     *
     * @mbggenerated Fri Apr 29 10:31:02 CST 2011
     */
    int insert(SvintvinfDel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVINTVINF_DEL
     *
     * @mbggenerated Fri Apr 29 10:31:02 CST 2011
     */
    int insertSelective(SvintvinfDel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVINTVINF_DEL
     *
     * @mbggenerated Fri Apr 29 10:31:02 CST 2011
     */
    List<SvintvinfDel> selectByExample(SvintvinfDelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVINTVINF_DEL
     *
     * @mbggenerated Fri Apr 29 10:31:02 CST 2011
     */
    SvintvinfDel selectByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVINTVINF_DEL
     *
     * @mbggenerated Fri Apr 29 10:31:02 CST 2011
     */
    int updateByExampleSelective(@Param("record") SvintvinfDel record, @Param("example") SvintvinfDelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVINTVINF_DEL
     *
     * @mbggenerated Fri Apr 29 10:31:02 CST 2011
     */
    int updateByExample(@Param("record") SvintvinfDel record, @Param("example") SvintvinfDelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVINTVINF_DEL
     *
     * @mbggenerated Fri Apr 29 10:31:02 CST 2011
     */
    int updateByPrimaryKeySelective(SvintvinfDel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVINTVINF_DEL
     *
     * @mbggenerated Fri Apr 29 10:31:02 CST 2011
     */
    int updateByPrimaryKey(SvintvinfDel record);
}