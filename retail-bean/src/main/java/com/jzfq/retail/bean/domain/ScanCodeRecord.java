package com.jzfq.retail.bean.domain;

import java.io.Serializable;
import java.util.Date;

public class ScanCodeRecord implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scan_code_record.id
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scan_code_record.latitude
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    private Double latitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scan_code_record.longitude
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    private Double longitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scan_code_record.order_sn
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    private String orderSn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scan_code_record.wx_code
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    private String wxCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scan_code_record.open_id
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    private String openId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scan_code_record.create_time
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scan_code_record.remark
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table scan_code_record
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scan_code_record.id
     *
     * @return the value of scan_code_record.id
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scan_code_record.id
     *
     * @param id the value for scan_code_record.id
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scan_code_record.latitude
     *
     * @return the value of scan_code_record.latitude
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scan_code_record.latitude
     *
     * @param latitude the value for scan_code_record.latitude
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scan_code_record.longitude
     *
     * @return the value of scan_code_record.longitude
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scan_code_record.longitude
     *
     * @param longitude the value for scan_code_record.longitude
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scan_code_record.order_sn
     *
     * @return the value of scan_code_record.order_sn
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scan_code_record.order_sn
     *
     * @param orderSn the value for scan_code_record.order_sn
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scan_code_record.wx_code
     *
     * @return the value of scan_code_record.wx_code
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    public String getWxCode() {
        return wxCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scan_code_record.wx_code
     *
     * @param wxCode the value for scan_code_record.wx_code
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    public void setWxCode(String wxCode) {
        this.wxCode = wxCode == null ? null : wxCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scan_code_record.open_id
     *
     * @return the value of scan_code_record.open_id
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scan_code_record.open_id
     *
     * @param openId the value for scan_code_record.open_id
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scan_code_record.create_time
     *
     * @return the value of scan_code_record.create_time
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scan_code_record.create_time
     *
     * @param createTime the value for scan_code_record.create_time
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scan_code_record.remark
     *
     * @return the value of scan_code_record.remark
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scan_code_record.remark
     *
     * @param remark the value for scan_code_record.remark
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_code_record
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ScanCodeRecord other = (ScanCodeRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getOrderSn() == null ? other.getOrderSn() == null : this.getOrderSn().equals(other.getOrderSn()))
            && (this.getWxCode() == null ? other.getWxCode() == null : this.getWxCode().equals(other.getWxCode()))
            && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_code_record
     *
     * @mbggenerated Mon Jul 23 15:21:41 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getOrderSn() == null) ? 0 : getOrderSn().hashCode());
        result = prime * result + ((getWxCode() == null) ? 0 : getWxCode().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}