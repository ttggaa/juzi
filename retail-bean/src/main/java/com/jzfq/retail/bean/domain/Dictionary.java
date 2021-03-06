package com.jzfq.retail.bean.domain;

import java.io.Serializable;
import java.util.Date;

public class Dictionary implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary.id
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary.dict_code
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    private String dictCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary.dict_type
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    private String dictType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary.dict_name
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    private String dictName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary.dict_val
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    private String dictVal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary.description
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary.create_id
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    private Integer createId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary.update_id
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    private Integer updateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary.create_user
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary.update_user
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    private String updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary.create_time
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary.update_time
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dictionary
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary.id
     *
     * @return the value of dictionary.id
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary.id
     *
     * @param id the value for dictionary.id
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary.dict_code
     *
     * @return the value of dictionary.dict_code
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public String getDictCode() {
        return dictCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary.dict_code
     *
     * @param dictCode the value for dictionary.dict_code
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public void setDictCode(String dictCode) {
        this.dictCode = dictCode == null ? null : dictCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary.dict_type
     *
     * @return the value of dictionary.dict_type
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public String getDictType() {
        return dictType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary.dict_type
     *
     * @param dictType the value for dictionary.dict_type
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary.dict_name
     *
     * @return the value of dictionary.dict_name
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public String getDictName() {
        return dictName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary.dict_name
     *
     * @param dictName the value for dictionary.dict_name
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public void setDictName(String dictName) {
        this.dictName = dictName == null ? null : dictName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary.dict_val
     *
     * @return the value of dictionary.dict_val
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public String getDictVal() {
        return dictVal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary.dict_val
     *
     * @param dictVal the value for dictionary.dict_val
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public void setDictVal(String dictVal) {
        this.dictVal = dictVal == null ? null : dictVal.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary.description
     *
     * @return the value of dictionary.description
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary.description
     *
     * @param description the value for dictionary.description
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary.create_id
     *
     * @return the value of dictionary.create_id
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public Integer getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary.create_id
     *
     * @param createId the value for dictionary.create_id
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary.update_id
     *
     * @return the value of dictionary.update_id
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public Integer getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary.update_id
     *
     * @param updateId the value for dictionary.update_id
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary.create_user
     *
     * @return the value of dictionary.create_user
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary.create_user
     *
     * @param createUser the value for dictionary.create_user
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary.update_user
     *
     * @return the value of dictionary.update_user
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary.update_user
     *
     * @param updateUser the value for dictionary.update_user
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary.create_time
     *
     * @return the value of dictionary.create_time
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary.create_time
     *
     * @param createTime the value for dictionary.create_time
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary.update_time
     *
     * @return the value of dictionary.update_time
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary.update_time
     *
     * @param updateTime the value for dictionary.update_time
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
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
        Dictionary other = (Dictionary) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getDictCode() == null ? other.getDictCode() == null : this.getDictCode().equals(other.getDictCode()))
                && (this.getDictType() == null ? other.getDictType() == null : this.getDictType().equals(other.getDictType()))
                && (this.getDictName() == null ? other.getDictName() == null : this.getDictName().equals(other.getDictName()))
                && (this.getDictVal() == null ? other.getDictVal() == null : this.getDictVal().equals(other.getDictVal()))
                && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
                && (this.getCreateId() == null ? other.getCreateId() == null : this.getCreateId().equals(other.getCreateId()))
                && (this.getUpdateId() == null ? other.getUpdateId() == null : this.getUpdateId().equals(other.getUpdateId()))
                && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
                && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary
     *
     * @mbggenerated Sun Jul 15 11:01:06 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDictCode() == null) ? 0 : getDictCode().hashCode());
        result = prime * result + ((getDictType() == null) ? 0 : getDictType().hashCode());
        result = prime * result + ((getDictName() == null) ? 0 : getDictName().hashCode());
        result = prime * result + ((getDictVal() == null) ? 0 : getDictVal().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getCreateId() == null) ? 0 : getCreateId().hashCode());
        result = prime * result + ((getUpdateId() == null) ? 0 : getUpdateId().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}