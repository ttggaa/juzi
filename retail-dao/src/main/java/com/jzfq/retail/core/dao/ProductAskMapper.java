package com.jzfq.retail.core.dao;

import com.jzfq.retail.bean.domain.ProductAsk;
import com.jzfq.retail.bean.domain.ProductAskQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductAskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_ask
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int countByExample(ProductAskQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_ask
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int deleteByExample(ProductAskQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_ask
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_ask
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int insert(ProductAsk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_ask
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int insertSelective(ProductAsk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_ask
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    List<ProductAsk> selectByExample(ProductAskQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_ask
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    ProductAsk selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_ask
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int updateByExampleSelective(@Param("record") ProductAsk record, @Param("example") ProductAskQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_ask
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int updateByExample(@Param("record") ProductAsk record, @Param("example") ProductAskQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_ask
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int updateByPrimaryKeySelective(ProductAsk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_ask
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int updateByPrimaryKey(ProductAsk record);
}