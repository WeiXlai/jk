//package client;
//
//import cn.itcast.mybatis.domain.ExtCproductC;
//import cn.itcast.mybatis.domain.ExtCproductCExample;
//import org.apache.ibatis.annotations.Param;
//
//import java.util.List;
//
//public interface ExtCproductCMapper {
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table EXT_CPRODUCT_C
//     *
//     * @mbggenerated Tue Aug 12 16:03:15 CST 2014
//     */
//    int countByExample(ExtCproductCExample example);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table EXT_CPRODUCT_C
//     *
//     * @mbggenerated Tue Aug 12 16:03:15 CST 2014
//     */
//    int deleteByExample(ExtCproductCExample example);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table EXT_CPRODUCT_C
//     *
//     * @mbggenerated Tue Aug 12 16:03:15 CST 2014
//     */
//    int deleteByPrimaryKey(String extCproductId);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table EXT_CPRODUCT_C
//     *
//     * @mbggenerated Tue Aug 12 16:03:15 CST 2014
//     */
//    int insert(ExtCproductC record);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table EXT_CPRODUCT_C
//     *
//     * @mbggenerated Tue Aug 12 16:03:15 CST 2014
//     */
//    int insertSelective(ExtCproductC record);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table EXT_CPRODUCT_C
//     *
//     * @mbggenerated Tue Aug 12 16:03:15 CST 2014
//     */
//    List<ExtCproductC> selectByExample(ExtCproductCExample example);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table EXT_CPRODUCT_C
//     *
//     * @mbggenerated Tue Aug 12 16:03:15 CST 2014
//     */
//    ExtCproductC selectByPrimaryKey(String extCproductId);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table EXT_CPRODUCT_C
//     *
//     * @mbggenerated Tue Aug 12 16:03:15 CST 2014
//     */
//    int updateByExampleSelective(@Param("record") ExtCproductC record, @Param("example") ExtCproductCExample example);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table EXT_CPRODUCT_C
//     *
//     * @mbggenerated Tue Aug 12 16:03:15 CST 2014
//     */
//    int updateByExample(@Param("record") ExtCproductC record, @Param("example") ExtCproductCExample example);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table EXT_CPRODUCT_C
//     *
//     * @mbggenerated Tue Aug 12 16:03:15 CST 2014
//     */
//    int updateByPrimaryKeySelective(ExtCproductC record);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table EXT_CPRODUCT_C
//     *
//     * @mbggenerated Tue Aug 12 16:03:15 CST 2014
//     */
//    int updateByPrimaryKey(ExtCproductC record);
//}