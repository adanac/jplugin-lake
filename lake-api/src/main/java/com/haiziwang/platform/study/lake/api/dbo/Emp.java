package com.haiziwang.platform.study.lake.api.dbo;

import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String loginAccount;
	private String loginPwd;
	private String phone;
	private String remark;
	private String realName;
	// 0不用，1可用
	private Integer status;
	// 0：否，1：是
	private Integer isAdmin;
	private Date createTime;
	private Date updateTime;

	public Emp() {
		super();
	}

	public Emp(String loginAccount, String loginPwd, String phone, String remark, String realName, Integer status, Date createTime) {
		
		this.loginAccount = loginAccount;
		this.loginPwd = loginPwd;
		this.phone = phone;
		this.remark = remark;
		this.realName = realName;
		this.status = status;
		this.createTime = createTime;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginAccount() {
		return loginAccount;
	}

	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
