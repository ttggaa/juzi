package com.jzfq.retail.bean.domain;

import java.io.Serializable;

public class SysRole implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.id
     *
     * @mbggenerated Thu Aug 09 09:58:05 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.code
     *
     * @mbggenerated Thu Aug 09 09:58:05 CST 2018
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.name
     *
     * @mbggenerated Thu Aug 09 09:58:05 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.resource_ids
     *
     * @mbggenerated Thu Aug 09 09:58:05 CST 2018
     */
    private String resourceIds;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.project
     *
     * @mbggenerated Thu Aug 09 09:58:05 CST 2018
     */
    private String project;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_role
     *
     * @mbggenerated Thu Aug 09 09:58:05 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.id
     *
     * @return the value of sys_role.id
     *
     * @mbggenerated Thu Aug 09 09:58:05 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.id
     *
     * @param id the value for sys_role.id
     *
     * @mbggenerated Thu Aug 09 09:58:05 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.code
     *
     * @return the value of sys_role.code
     *
     * @mbggenerated Thu Aug 09 09:58:05 CST 2018
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.code
     *
     * @param code the value for sys_role.code
     *
     * @mbggenerated Thu Aug 09 09:58:05 CST 2018
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.name
     *
     * @return the value of sys_role.name
     *
     * @mbggenerated Thu Aug 09 09:58:05 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.name
     *
     * @param name the value for sys_role.name
     *
     * @mbggenerated Thu Aug 09 09:58:05 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.resource_ids
     *
     * @return the value of sys_role.resource_ids
     *
     * @mbggenerated Thu Aug 09 09:58:05 CST 2018
     */
    public String getResourceIds() {
        return resourceIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.resource_ids
     *
     * @param resourceIds the value for sys_role.resource_ids
     *
     * @mbggenerated Thu Aug 09 09:58:05 CST 2018
     */
    public void setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds == null ? null : resourceIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.project
     *
     * @return the value of sys_role.project
     *
     * @mbggenerated Thu Aug 09 09:58:05 CST 2018
     */
    public String getProject() {
        return project;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.project
     *
     * @param project the value for sys_role.project
     *
     * @mbggenerated Thu Aug 09 09:58:05 CST 2018
     */
    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     *
     * @mbggenerated Thu Aug 09 09:58:05 CST 2018
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
        SysRole other = (SysRole) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getResourceIds() == null ? other.getResourceIds() == null : this.getResourceIds().equals(other.getResourceIds()))
            && (this.getProject() == null ? other.getProject() == null : this.getProject().equals(other.getProject()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     *
     * @mbggenerated Thu Aug 09 09:58:05 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        result = prime * result + ((getProject() == null) ? 0 : getProject().hashCode());
        return result;
    }
}