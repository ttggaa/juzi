package com.jzfq.retail.bean.domain;

import java.io.Serializable;
import java.util.Date;

public class OrdersUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.id
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.order_id
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private Integer orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.order_sn
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private String orderSn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.buyer_message
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private String buyerMessage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.invitation_code
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private String invitationCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.user_status
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private String userStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.id_card
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private String idCard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.show_city
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private String showCity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.registe_code
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private String registeCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.address_id
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private Integer addressId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.ip
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.remark
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.codconfirm_name
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private String codconfirmName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.name
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.province_id
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private Integer provinceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.city_id
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private Integer cityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.area_id
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private Integer areaId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.address_all
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private String addressAll;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.address_info
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private String addressInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.mobile
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.email
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.zip_code
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private String zipCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.token
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private String token;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.update_time
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.cancel_reason
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private String cancelReason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_user.user_source
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private Integer userSource;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orders_user
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.id
     *
     * @return the value of orders_user.id
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.id
     *
     * @param id the value for orders_user.id
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.order_id
     *
     * @return the value of orders_user.order_id
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.order_id
     *
     * @param orderId the value for orders_user.order_id
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.order_sn
     *
     * @return the value of orders_user.order_sn
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.order_sn
     *
     * @param orderSn the value for orders_user.order_sn
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.buyer_message
     *
     * @return the value of orders_user.buyer_message
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public String getBuyerMessage() {
        return buyerMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.buyer_message
     *
     * @param buyerMessage the value for orders_user.buyer_message
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage == null ? null : buyerMessage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.invitation_code
     *
     * @return the value of orders_user.invitation_code
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public String getInvitationCode() {
        return invitationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.invitation_code
     *
     * @param invitationCode the value for orders_user.invitation_code
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode == null ? null : invitationCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.user_status
     *
     * @return the value of orders_user.user_status
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.user_status
     *
     * @param userStatus the value for orders_user.user_status
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.id_card
     *
     * @return the value of orders_user.id_card
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.id_card
     *
     * @param idCard the value for orders_user.id_card
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.show_city
     *
     * @return the value of orders_user.show_city
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public String getShowCity() {
        return showCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.show_city
     *
     * @param showCity the value for orders_user.show_city
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setShowCity(String showCity) {
        this.showCity = showCity == null ? null : showCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.registe_code
     *
     * @return the value of orders_user.registe_code
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public String getRegisteCode() {
        return registeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.registe_code
     *
     * @param registeCode the value for orders_user.registe_code
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setRegisteCode(String registeCode) {
        this.registeCode = registeCode == null ? null : registeCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.address_id
     *
     * @return the value of orders_user.address_id
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public Integer getAddressId() {
        return addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.address_id
     *
     * @param addressId the value for orders_user.address_id
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.ip
     *
     * @return the value of orders_user.ip
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.ip
     *
     * @param ip the value for orders_user.ip
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.remark
     *
     * @return the value of orders_user.remark
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.remark
     *
     * @param remark the value for orders_user.remark
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.codconfirm_name
     *
     * @return the value of orders_user.codconfirm_name
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public String getCodconfirmName() {
        return codconfirmName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.codconfirm_name
     *
     * @param codconfirmName the value for orders_user.codconfirm_name
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setCodconfirmName(String codconfirmName) {
        this.codconfirmName = codconfirmName == null ? null : codconfirmName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.name
     *
     * @return the value of orders_user.name
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.name
     *
     * @param name the value for orders_user.name
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.province_id
     *
     * @return the value of orders_user.province_id
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.province_id
     *
     * @param provinceId the value for orders_user.province_id
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.city_id
     *
     * @return the value of orders_user.city_id
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.city_id
     *
     * @param cityId the value for orders_user.city_id
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.area_id
     *
     * @return the value of orders_user.area_id
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public Integer getAreaId() {
        return areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.area_id
     *
     * @param areaId the value for orders_user.area_id
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.address_all
     *
     * @return the value of orders_user.address_all
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public String getAddressAll() {
        return addressAll;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.address_all
     *
     * @param addressAll the value for orders_user.address_all
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setAddressAll(String addressAll) {
        this.addressAll = addressAll == null ? null : addressAll.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.address_info
     *
     * @return the value of orders_user.address_info
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public String getAddressInfo() {
        return addressInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.address_info
     *
     * @param addressInfo the value for orders_user.address_info
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setAddressInfo(String addressInfo) {
        this.addressInfo = addressInfo == null ? null : addressInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.mobile
     *
     * @return the value of orders_user.mobile
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.mobile
     *
     * @param mobile the value for orders_user.mobile
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.email
     *
     * @return the value of orders_user.email
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.email
     *
     * @param email the value for orders_user.email
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.zip_code
     *
     * @return the value of orders_user.zip_code
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.zip_code
     *
     * @param zipCode the value for orders_user.zip_code
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.token
     *
     * @return the value of orders_user.token
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.token
     *
     * @param token the value for orders_user.token
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.update_time
     *
     * @return the value of orders_user.update_time
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.update_time
     *
     * @param updateTime the value for orders_user.update_time
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.cancel_reason
     *
     * @return the value of orders_user.cancel_reason
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.cancel_reason
     *
     * @param cancelReason the value for orders_user.cancel_reason
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason == null ? null : cancelReason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_user.user_source
     *
     * @return the value of orders_user.user_source
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public Integer getUserSource() {
        return userSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_user.user_source
     *
     * @param userSource the value for orders_user.user_source
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    public void setUserSource(Integer userSource) {
        this.userSource = userSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_user
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
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
        OrdersUser other = (OrdersUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOrderSn() == null ? other.getOrderSn() == null : this.getOrderSn().equals(other.getOrderSn()))
            && (this.getBuyerMessage() == null ? other.getBuyerMessage() == null : this.getBuyerMessage().equals(other.getBuyerMessage()))
            && (this.getInvitationCode() == null ? other.getInvitationCode() == null : this.getInvitationCode().equals(other.getInvitationCode()))
            && (this.getUserStatus() == null ? other.getUserStatus() == null : this.getUserStatus().equals(other.getUserStatus()))
            && (this.getIdCard() == null ? other.getIdCard() == null : this.getIdCard().equals(other.getIdCard()))
            && (this.getShowCity() == null ? other.getShowCity() == null : this.getShowCity().equals(other.getShowCity()))
            && (this.getRegisteCode() == null ? other.getRegisteCode() == null : this.getRegisteCode().equals(other.getRegisteCode()))
            && (this.getAddressId() == null ? other.getAddressId() == null : this.getAddressId().equals(other.getAddressId()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCodconfirmName() == null ? other.getCodconfirmName() == null : this.getCodconfirmName().equals(other.getCodconfirmName()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getProvinceId() == null ? other.getProvinceId() == null : this.getProvinceId().equals(other.getProvinceId()))
            && (this.getCityId() == null ? other.getCityId() == null : this.getCityId().equals(other.getCityId()))
            && (this.getAreaId() == null ? other.getAreaId() == null : this.getAreaId().equals(other.getAreaId()))
            && (this.getAddressAll() == null ? other.getAddressAll() == null : this.getAddressAll().equals(other.getAddressAll()))
            && (this.getAddressInfo() == null ? other.getAddressInfo() == null : this.getAddressInfo().equals(other.getAddressInfo()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getZipCode() == null ? other.getZipCode() == null : this.getZipCode().equals(other.getZipCode()))
            && (this.getToken() == null ? other.getToken() == null : this.getToken().equals(other.getToken()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCancelReason() == null ? other.getCancelReason() == null : this.getCancelReason().equals(other.getCancelReason()))
            && (this.getUserSource() == null ? other.getUserSource() == null : this.getUserSource().equals(other.getUserSource()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_user
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOrderSn() == null) ? 0 : getOrderSn().hashCode());
        result = prime * result + ((getBuyerMessage() == null) ? 0 : getBuyerMessage().hashCode());
        result = prime * result + ((getInvitationCode() == null) ? 0 : getInvitationCode().hashCode());
        result = prime * result + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        result = prime * result + ((getIdCard() == null) ? 0 : getIdCard().hashCode());
        result = prime * result + ((getShowCity() == null) ? 0 : getShowCity().hashCode());
        result = prime * result + ((getRegisteCode() == null) ? 0 : getRegisteCode().hashCode());
        result = prime * result + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCodconfirmName() == null) ? 0 : getCodconfirmName().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getProvinceId() == null) ? 0 : getProvinceId().hashCode());
        result = prime * result + ((getCityId() == null) ? 0 : getCityId().hashCode());
        result = prime * result + ((getAreaId() == null) ? 0 : getAreaId().hashCode());
        result = prime * result + ((getAddressAll() == null) ? 0 : getAddressAll().hashCode());
        result = prime * result + ((getAddressInfo() == null) ? 0 : getAddressInfo().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getZipCode() == null) ? 0 : getZipCode().hashCode());
        result = prime * result + ((getToken() == null) ? 0 : getToken().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCancelReason() == null) ? 0 : getCancelReason().hashCode());
        result = prime * result + ((getUserSource() == null) ? 0 : getUserSource().hashCode());
        return result;
    }
}