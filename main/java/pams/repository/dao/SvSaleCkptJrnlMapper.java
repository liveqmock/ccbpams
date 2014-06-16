package pams.repository.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import pams.repository.model.SvSaleCkptJrnl;
import pams.repository.model.SvSaleCkptJrnlExample;

import java.util.List;

@Component
public interface SvSaleCkptJrnlMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SV_SALE_CKPT_JRNL
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    int countByExample(SvSaleCkptJrnlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SV_SALE_CKPT_JRNL
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    int deleteByExample(SvSaleCkptJrnlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SV_SALE_CKPT_JRNL
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    int deleteByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SV_SALE_CKPT_JRNL
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    int insert(SvSaleCkptJrnl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SV_SALE_CKPT_JRNL
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    int insertSelective(SvSaleCkptJrnl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SV_SALE_CKPT_JRNL
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    List<SvSaleCkptJrnl> selectByExample(SvSaleCkptJrnlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SV_SALE_CKPT_JRNL
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    SvSaleCkptJrnl selectByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SV_SALE_CKPT_JRNL
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    int updateByExampleSelective(@Param("record") SvSaleCkptJrnl record, @Param("example") SvSaleCkptJrnlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SV_SALE_CKPT_JRNL
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    int updateByExample(@Param("record") SvSaleCkptJrnl record, @Param("example") SvSaleCkptJrnlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SV_SALE_CKPT_JRNL
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    int updateByPrimaryKeySelective(SvSaleCkptJrnl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SV_SALE_CKPT_JRNL
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    int updateByPrimaryKey(SvSaleCkptJrnl record);
}