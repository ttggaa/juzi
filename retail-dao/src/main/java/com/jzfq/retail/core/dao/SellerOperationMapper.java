package com.jzfq.retail.core.dao;

import com.jzfq.retail.bean.domain.SellerOperation;
import com.jzfq.retail.bean.domain.SellerOperationQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SellerOperationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_operation
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int countByExample(SellerOperationQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_operation
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int deleteByExample(SellerOperationQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_operation
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_operation
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int insert(SellerOperation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_operation
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int insertSelective(SellerOperation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_operation
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    List<SellerOperation> selectByExample(SellerOperationQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_operation
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    SellerOperation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_operation
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int updateByExampleSelective(@Param("record") SellerOperation record, @Param("example") SellerOperationQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_operation
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int updateByExample(@Param("record") SellerOperation record, @Param("example") SellerOperationQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_operation
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int updateByPrimaryKeySelective(SellerOperation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_operation
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int updateByPrimaryKey(SellerOperation record);
}