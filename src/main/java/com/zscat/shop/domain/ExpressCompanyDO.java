package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
public class ExpressCompanyDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//company_mark
	private String companyMark;
	//company_name
	private String companyName;
	//company_status
	private Integer companyStatus;
	//company_sequence
	private Integer companySequence;
	//company_type
	private String companyType;

	/**
	 * 设置：id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：addTime
	 */
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	/**
	 * 获取：addTime
	 */
	public Date getAddtime() {
		return addtime;
	}
	/**
	 * 设置：deleteStatus
	 */
	public void setDeletestatus(Boolean deletestatus) {
		this.deletestatus = deletestatus;
	}
	/**
	 * 获取：deleteStatus
	 */
	public Boolean getDeletestatus() {
		return deletestatus;
	}
	/**
	 * 设置：company_mark
	 */
	public void setCompanyMark(String companyMark) {
		this.companyMark = companyMark;
	}
	/**
	 * 获取：company_mark
	 */
	public String getCompanyMark() {
		return companyMark;
	}
	/**
	 * 设置：company_name
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * 获取：company_name
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * 设置：company_status
	 */
	public void setCompanyStatus(Integer companyStatus) {
		this.companyStatus = companyStatus;
	}
	/**
	 * 获取：company_status
	 */
	public Integer getCompanyStatus() {
		return companyStatus;
	}
	/**
	 * 设置：company_sequence
	 */
	public void setCompanySequence(Integer companySequence) {
		this.companySequence = companySequence;
	}
	/**
	 * 获取：company_sequence
	 */
	public Integer getCompanySequence() {
		return companySequence;
	}
	/**
	 * 设置：company_type
	 */
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	/**
	 * 获取：company_type
	 */
	public String getCompanyType() {
		return companyType;
	}
}
