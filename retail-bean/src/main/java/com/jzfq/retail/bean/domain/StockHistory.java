package com.jzfq.retail.bean.domain;

import java.io.Serializable;
import java.util.Date;

public class StockHistory implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.id
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.goods_stock_info_id
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private Integer goodsStockInfoId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.sn
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private String sn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.into_code
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private String intoCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.type
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.update_time
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.product_id
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private Integer productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.product_name
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private String productName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.product_goods_id
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private Integer productGoodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.sku_name
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private String skuName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.sku
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private String sku;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.stock_status
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private String stockStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.stock_address_id
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private Integer stockAddressId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.stock_address_name
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private String stockAddressName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.stock_address_code
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private String stockAddressCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.stock_site_id
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private Integer stockSiteId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.stock_site_name
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private String stockSiteName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.count
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private Integer count;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.before_count
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private Integer beforeCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.unit
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private String unit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.member_name
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private String memberName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.take_flag
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private Integer takeFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_history.availability_date
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private Date availabilityDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stock_history
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.id
     *
     * @return the value of stock_history.id
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.id
     *
     * @param id the value for stock_history.id
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.goods_stock_info_id
     *
     * @return the value of stock_history.goods_stock_info_id
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public Integer getGoodsStockInfoId() {
        return goodsStockInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.goods_stock_info_id
     *
     * @param goodsStockInfoId the value for stock_history.goods_stock_info_id
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setGoodsStockInfoId(Integer goodsStockInfoId) {
        this.goodsStockInfoId = goodsStockInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.sn
     *
     * @return the value of stock_history.sn
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public String getSn() {
        return sn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.sn
     *
     * @param sn the value for stock_history.sn
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.into_code
     *
     * @return the value of stock_history.into_code
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public String getIntoCode() {
        return intoCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.into_code
     *
     * @param intoCode the value for stock_history.into_code
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setIntoCode(String intoCode) {
        this.intoCode = intoCode == null ? null : intoCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.type
     *
     * @return the value of stock_history.type
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.type
     *
     * @param type the value for stock_history.type
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.update_time
     *
     * @return the value of stock_history.update_time
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.update_time
     *
     * @param updateTime the value for stock_history.update_time
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.product_id
     *
     * @return the value of stock_history.product_id
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.product_id
     *
     * @param productId the value for stock_history.product_id
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.product_name
     *
     * @return the value of stock_history.product_name
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.product_name
     *
     * @param productName the value for stock_history.product_name
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.product_goods_id
     *
     * @return the value of stock_history.product_goods_id
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public Integer getProductGoodsId() {
        return productGoodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.product_goods_id
     *
     * @param productGoodsId the value for stock_history.product_goods_id
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setProductGoodsId(Integer productGoodsId) {
        this.productGoodsId = productGoodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.sku_name
     *
     * @return the value of stock_history.sku_name
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public String getSkuName() {
        return skuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.sku_name
     *
     * @param skuName the value for stock_history.sku_name
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setSkuName(String skuName) {
        this.skuName = skuName == null ? null : skuName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.sku
     *
     * @return the value of stock_history.sku
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public String getSku() {
        return sku;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.sku
     *
     * @param sku the value for stock_history.sku
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.stock_status
     *
     * @return the value of stock_history.stock_status
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public String getStockStatus() {
        return stockStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.stock_status
     *
     * @param stockStatus the value for stock_history.stock_status
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus == null ? null : stockStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.stock_address_id
     *
     * @return the value of stock_history.stock_address_id
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public Integer getStockAddressId() {
        return stockAddressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.stock_address_id
     *
     * @param stockAddressId the value for stock_history.stock_address_id
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setStockAddressId(Integer stockAddressId) {
        this.stockAddressId = stockAddressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.stock_address_name
     *
     * @return the value of stock_history.stock_address_name
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public String getStockAddressName() {
        return stockAddressName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.stock_address_name
     *
     * @param stockAddressName the value for stock_history.stock_address_name
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setStockAddressName(String stockAddressName) {
        this.stockAddressName = stockAddressName == null ? null : stockAddressName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.stock_address_code
     *
     * @return the value of stock_history.stock_address_code
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public String getStockAddressCode() {
        return stockAddressCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.stock_address_code
     *
     * @param stockAddressCode the value for stock_history.stock_address_code
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setStockAddressCode(String stockAddressCode) {
        this.stockAddressCode = stockAddressCode == null ? null : stockAddressCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.stock_site_id
     *
     * @return the value of stock_history.stock_site_id
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public Integer getStockSiteId() {
        return stockSiteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.stock_site_id
     *
     * @param stockSiteId the value for stock_history.stock_site_id
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setStockSiteId(Integer stockSiteId) {
        this.stockSiteId = stockSiteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.stock_site_name
     *
     * @return the value of stock_history.stock_site_name
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public String getStockSiteName() {
        return stockSiteName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.stock_site_name
     *
     * @param stockSiteName the value for stock_history.stock_site_name
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setStockSiteName(String stockSiteName) {
        this.stockSiteName = stockSiteName == null ? null : stockSiteName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.count
     *
     * @return the value of stock_history.count
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.count
     *
     * @param count the value for stock_history.count
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.before_count
     *
     * @return the value of stock_history.before_count
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public Integer getBeforeCount() {
        return beforeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.before_count
     *
     * @param beforeCount the value for stock_history.before_count
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setBeforeCount(Integer beforeCount) {
        this.beforeCount = beforeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.unit
     *
     * @return the value of stock_history.unit
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.unit
     *
     * @param unit the value for stock_history.unit
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.member_name
     *
     * @return the value of stock_history.member_name
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.member_name
     *
     * @param memberName the value for stock_history.member_name
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.take_flag
     *
     * @return the value of stock_history.take_flag
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public Integer getTakeFlag() {
        return takeFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.take_flag
     *
     * @param takeFlag the value for stock_history.take_flag
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setTakeFlag(Integer takeFlag) {
        this.takeFlag = takeFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_history.availability_date
     *
     * @return the value of stock_history.availability_date
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public Date getAvailabilityDate() {
        return availabilityDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_history.availability_date
     *
     * @param availabilityDate the value for stock_history.availability_date
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    public void setAvailabilityDate(Date availabilityDate) {
        this.availabilityDate = availabilityDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_history
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
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
        StockHistory other = (StockHistory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodsStockInfoId() == null ? other.getGoodsStockInfoId() == null : this.getGoodsStockInfoId().equals(other.getGoodsStockInfoId()))
            && (this.getSn() == null ? other.getSn() == null : this.getSn().equals(other.getSn()))
            && (this.getIntoCode() == null ? other.getIntoCode() == null : this.getIntoCode().equals(other.getIntoCode()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getProductGoodsId() == null ? other.getProductGoodsId() == null : this.getProductGoodsId().equals(other.getProductGoodsId()))
            && (this.getSkuName() == null ? other.getSkuName() == null : this.getSkuName().equals(other.getSkuName()))
            && (this.getSku() == null ? other.getSku() == null : this.getSku().equals(other.getSku()))
            && (this.getStockStatus() == null ? other.getStockStatus() == null : this.getStockStatus().equals(other.getStockStatus()))
            && (this.getStockAddressId() == null ? other.getStockAddressId() == null : this.getStockAddressId().equals(other.getStockAddressId()))
            && (this.getStockAddressName() == null ? other.getStockAddressName() == null : this.getStockAddressName().equals(other.getStockAddressName()))
            && (this.getStockAddressCode() == null ? other.getStockAddressCode() == null : this.getStockAddressCode().equals(other.getStockAddressCode()))
            && (this.getStockSiteId() == null ? other.getStockSiteId() == null : this.getStockSiteId().equals(other.getStockSiteId()))
            && (this.getStockSiteName() == null ? other.getStockSiteName() == null : this.getStockSiteName().equals(other.getStockSiteName()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getBeforeCount() == null ? other.getBeforeCount() == null : this.getBeforeCount().equals(other.getBeforeCount()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getMemberName() == null ? other.getMemberName() == null : this.getMemberName().equals(other.getMemberName()))
            && (this.getTakeFlag() == null ? other.getTakeFlag() == null : this.getTakeFlag().equals(other.getTakeFlag()))
            && (this.getAvailabilityDate() == null ? other.getAvailabilityDate() == null : this.getAvailabilityDate().equals(other.getAvailabilityDate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_history
     *
     * @mbggenerated Thu Aug 09 17:29:57 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGoodsStockInfoId() == null) ? 0 : getGoodsStockInfoId().hashCode());
        result = prime * result + ((getSn() == null) ? 0 : getSn().hashCode());
        result = prime * result + ((getIntoCode() == null) ? 0 : getIntoCode().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getProductGoodsId() == null) ? 0 : getProductGoodsId().hashCode());
        result = prime * result + ((getSkuName() == null) ? 0 : getSkuName().hashCode());
        result = prime * result + ((getSku() == null) ? 0 : getSku().hashCode());
        result = prime * result + ((getStockStatus() == null) ? 0 : getStockStatus().hashCode());
        result = prime * result + ((getStockAddressId() == null) ? 0 : getStockAddressId().hashCode());
        result = prime * result + ((getStockAddressName() == null) ? 0 : getStockAddressName().hashCode());
        result = prime * result + ((getStockAddressCode() == null) ? 0 : getStockAddressCode().hashCode());
        result = prime * result + ((getStockSiteId() == null) ? 0 : getStockSiteId().hashCode());
        result = prime * result + ((getStockSiteName() == null) ? 0 : getStockSiteName().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getBeforeCount() == null) ? 0 : getBeforeCount().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getMemberName() == null) ? 0 : getMemberName().hashCode());
        result = prime * result + ((getTakeFlag() == null) ? 0 : getTakeFlag().hashCode());
        result = prime * result + ((getAvailabilityDate() == null) ? 0 : getAvailabilityDate().hashCode());
        return result;
    }
}