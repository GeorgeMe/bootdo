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
public class GoldLogDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//gl_admin_content
	private String glAdminContent;
	//gl_admin_time
	private Date glAdminTime;
	//gl_content
	private String glContent;
	//gl_count
	private Integer glCount;
	//gl_money
	private Integer glMoney;
	//gl_payment
	private String glPayment;
	//gl_type
	private Integer glType;
	//gl_admin_id
	private Long glAdminId;
	//gl_user_id
	private Long glUserId;
	//gr_id
	private Long grId;

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
	 * 设置：gl_admin_content
	 */
	public void setGlAdminContent(String glAdminContent) {
		this.glAdminContent = glAdminContent;
	}
	/**
	 * 获取：gl_admin_content
	 */
	public String getGlAdminContent() {
		return glAdminContent;
	}
	/**
	 * 设置：gl_admin_time
	 */
	public void setGlAdminTime(Date glAdminTime) {
		this.glAdminTime = glAdminTime;
	}
	/**
	 * 获取：gl_admin_time
	 */
	public Date getGlAdminTime() {
		return glAdminTime;
	}
	/**
	 * 设置：gl_content
	 */
	public void setGlContent(String glContent) {
		this.glContent = glContent;
	}
	/**
	 * 获取：gl_content
	 */
	public String getGlContent() {
		return glContent;
	}
	/**
	 * 设置：gl_count
	 */
	public void setGlCount(Integer glCount) {
		this.glCount = glCount;
	}
	/**
	 * 获取：gl_count
	 */
	public Integer getGlCount() {
		return glCount;
	}
	/**
	 * 设置：gl_money
	 */
	public void setGlMoney(Integer glMoney) {
		this.glMoney = glMoney;
	}
	/**
	 * 获取：gl_money
	 */
	public Integer getGlMoney() {
		return glMoney;
	}
	/**
	 * 设置：gl_payment
	 */
	public void setGlPayment(String glPayment) {
		this.glPayment = glPayment;
	}
	/**
	 * 获取：gl_payment
	 */
	public String getGlPayment() {
		return glPayment;
	}
	/**
	 * 设置：gl_type
	 */
	public void setGlType(Integer glType) {
		this.glType = glType;
	}
	/**
	 * 获取：gl_type
	 */
	public Integer getGlType() {
		return glType;
	}
	/**
	 * 设置：gl_admin_id
	 */
	public void setGlAdminId(Long glAdminId) {
		this.glAdminId = glAdminId;
	}
	/**
	 * 获取：gl_admin_id
	 */
	public Long getGlAdminId() {
		return glAdminId;
	}
	/**
	 * 设置：gl_user_id
	 */
	public void setGlUserId(Long glUserId) {
		this.glUserId = glUserId;
	}
	/**
	 * 获取：gl_user_id
	 */
	public Long getGlUserId() {
		return glUserId;
	}
	/**
	 * 设置：gr_id
	 */
	public void setGrId(Long grId) {
		this.grId = grId;
	}
	/**
	 * 获取：gr_id
	 */
	public Long getGrId() {
		return grId;
	}
}
