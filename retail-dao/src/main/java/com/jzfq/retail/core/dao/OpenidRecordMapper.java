package com.jzfq.retail.core.dao;

import com.jzfq.retail.bean.domain.OpenidRecord;
import com.jzfq.retail.bean.domain.OpenidRecordQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OpenidRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openid_record
     *
     * @mbggenerated Tue Aug 21 14:33:57 CST 2018
     */
    int countByExample(OpenidRecordQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openid_record
     *
     * @mbggenerated Tue Aug 21 14:33:57 CST 2018
     */
    int deleteByExample(OpenidRecordQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openid_record
     *
     * @mbggenerated Tue Aug 21 14:33:57 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openid_record
     *
     * @mbggenerated Tue Aug 21 14:33:57 CST 2018
     */
    int insert(OpenidRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openid_record
     *
     * @mbggenerated Tue Aug 21 14:33:57 CST 2018
     */
    int insertSelective(OpenidRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openid_record
     *
     * @mbggenerated Tue Aug 21 14:33:57 CST 2018
     */
    List<OpenidRecord> selectByExample(OpenidRecordQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openid_record
     *
     * @mbggenerated Tue Aug 21 14:33:57 CST 2018
     */
    OpenidRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openid_record
     *
     * @mbggenerated Tue Aug 21 14:33:57 CST 2018
     */
    int updateByExampleSelective(@Param("record") OpenidRecord record, @Param("example") OpenidRecordQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openid_record
     *
     * @mbggenerated Tue Aug 21 14:33:57 CST 2018
     */
    int updateByExample(@Param("record") OpenidRecord record, @Param("example") OpenidRecordQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openid_record
     *
     * @mbggenerated Tue Aug 21 14:33:57 CST 2018
     */
    int updateByPrimaryKeySelective(OpenidRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openid_record
     *
     * @mbggenerated Tue Aug 21 14:33:57 CST 2018
     */
    int updateByPrimaryKey(OpenidRecord record);
}