package client;

import cn.itcast.mybatis.domain.SysCodeB;
import cn.itcast.mybatis.domain.SysCodeBExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCodeBMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_CODE_B
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    int countByExample(SysCodeBExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_CODE_B
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    int deleteByExample(SysCodeBExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_CODE_B
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    int deleteByPrimaryKey(String sysCodeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_CODE_B
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    int insert(SysCodeB record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_CODE_B
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    int insertSelective(SysCodeB record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_CODE_B
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    List<SysCodeB> selectByExample(SysCodeBExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_CODE_B
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    SysCodeB selectByPrimaryKey(String sysCodeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_CODE_B
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    int updateByExampleSelective(@Param("record") SysCodeB record, @Param("example") SysCodeBExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_CODE_B
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    int updateByExample(@Param("record") SysCodeB record, @Param("example") SysCodeBExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_CODE_B
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    int updateByPrimaryKeySelective(SysCodeB record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_CODE_B
     *
     * @mbggenerated Tue Aug 12 17:03:38 CST 2014
     */
    int updateByPrimaryKey(SysCodeB record);
}