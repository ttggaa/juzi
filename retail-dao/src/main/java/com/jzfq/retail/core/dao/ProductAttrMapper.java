package com.jzfq.retail.core.dao;

import com.jzfq.retail.bean.domain.ProductAttr;
import com.jzfq.retail.bean.domain.ProductAttrQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductAttrMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attr
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int countByExample(ProductAttrQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attr
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int deleteByExample(ProductAttrQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attr
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attr
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int insert(ProductAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attr
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int insertSelective(ProductAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attr
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    List<ProductAttr> selectByExample(ProductAttrQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attr
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    ProductAttr selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attr
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int updateByExampleSelective(@Param("record") ProductAttr record, @Param("example") ProductAttrQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attr
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int updateByExample(@Param("record") ProductAttr record, @Param("example") ProductAttrQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attr
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int updateByPrimaryKeySelective(ProductAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_attr
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int updateByPrimaryKey(ProductAttr record);
}