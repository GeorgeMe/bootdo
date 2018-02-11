package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public class AddressDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//area_info
	private String areaInfo;
	//mobile
	private String mobile;
	//telephone
	private String telephone;
	//trueName
	private String truename;
	//zip
	private String zip;
	//area_id
	private Long areaId;
	//user_id
	private Long userId;

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
	 * 设置：area_info
	 */
	public void setAreaInfo(String areaInfo) {
		this.areaInfo = areaInfo;
	}
	/**
	 * 获取：area_info
	 */
	public String getAreaInfo() {
		return areaInfo;
	}
	/**
	 * 设置：mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 获取：mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * 设置：telephone
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * 获取：telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * 设置：trueName
	 */
	public void setTruename(String truename) {
		this.truename = truename;
	}
	/**
	 * 获取：trueName
	 */
	public String getTruename() {
		return truename;
	}
	/**
	 * 设置：zip
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	/**
	 * 获取：zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * 设置：area_id
	 */
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	/**
	 * 获取：area_id
	 */
	public Long getAreaId() {
		return areaId;
	}
	/**
	 * 设置：user_id
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：user_id
	 */
	public Long getUserId() {
		return userId;
	}
}
