package com.jzfq.retail.core.dao;

import com.jzfq.retail.bean.domain.SupplierBanks;
import com.jzfq.retail.bean.domain.SupplierBanksQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupplierBanksMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_banks
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    int countByExample(SupplierBanksQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_banks
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    int deleteByExample(SupplierBanksQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_banks
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_banks
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    int insert(SupplierBanks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_banks
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    int insertSelective(SupplierBanks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_banks
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    List<SupplierBanks> selectByExampleWithBLOBs(SupplierBanksQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_banks
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    List<SupplierBanks> selectByExample(SupplierBanksQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_banks
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    SupplierBanks selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_banks
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    int updateByExampleSelective(@Param("record") SupplierBanks record, @Param("example") SupplierBanksQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_banks
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") SupplierBanks record, @Param("example") SupplierBanksQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_banks
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    int updateByExample(@Param("record") SupplierBanks record, @Param("example") SupplierBanksQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_banks
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    int updateByPrimaryKeySelective(SupplierBanks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_banks
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(SupplierBanks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_banks
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    int updateByPrimaryKey(SupplierBanks record);
}