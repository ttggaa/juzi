package com.jzfq.retail.bean.domain;

import java.io.Serializable;
import java.util.Date;

public class ProductImage implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_image.id
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_image.product_id
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    private Integer productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_image.type
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_image.url
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_image.remark
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_image.sort
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_image.status
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_image.create_time
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_image.update_time
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_image
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_image.id
     *
     * @return the value of product_image.id
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_image.id
     *
     * @param id the value for product_image.id
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_image.product_id
     *
     * @return the value of product_image.product_id
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_image.product_id
     *
     * @param productId the value for product_image.product_id
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_image.type
     *
     * @return the value of product_image.type
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_image.type
     *
     * @param type the value for product_image.type
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_image.url
     *
     * @return the value of product_image.url
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_image.url
     *
     * @param url the value for product_image.url
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_image.remark
     *
     * @return the value of product_image.remark
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_image.remark
     *
     * @param remark the value for product_image.remark
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_image.sort
     *
     * @return the value of product_image.sort
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_image.sort
     *
     * @param sort the value for product_image.sort
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_image.status
     *
     * @return the value of product_image.status
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_image.status
     *
     * @param status the value for product_image.status
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_image.create_time
     *
     * @return the value of product_image.create_time
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_image.create_time
     *
     * @param createTime the value for product_image.create_time
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_image.update_time
     *
     * @return the value of product_image.update_time
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_image.update_time
     *
     * @param updateTime the value for product_image.update_time
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
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
        ProductImage other = (ProductImage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}