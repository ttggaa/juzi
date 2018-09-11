package com.jzfq.retail.core.dao;

import com.jzfq.retail.bean.domain.SellerStore;
import com.jzfq.retail.bean.domain.SellerStoreQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SellerStoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_store
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int countByExample(SellerStoreQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_store
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int deleteByExample(SellerStoreQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_store
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_store
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int insert(SellerStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_store
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int insertSelective(SellerStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_store
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    List<SellerStore> selectByExample(SellerStoreQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_store
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    SellerStore selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_store
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int updateByExampleSelective(@Param("record") SellerStore record, @Param("example") SellerStoreQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_store
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int updateByExample(@Param("record") SellerStore record, @Param("example") SellerStoreQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_store
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int updateByPrimaryKeySelective(SellerStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_store
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int updateByPrimaryKey(SellerStore record);
}