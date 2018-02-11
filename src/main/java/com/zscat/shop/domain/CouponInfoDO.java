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
public class CouponInfoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//coupon_sn
	private String couponSn;
	//status
	private Integer status;
	//coupon_id
	private Long couponId;
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
	 * 设置：coupon_sn
	 */
	public void setCouponSn(String couponSn) {
		this.couponSn = couponSn;
	}
	/**
	 * 获取：coupon_sn
	 */
	public String getCouponSn() {
		return couponSn;
	}
	/**
	 * 设置：status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：coupon_id
	 */
	public void setCouponId(Long couponId) {
		this.couponId = couponId;
	}
	/**
	 * 获取：coupon_id
	 */
	public Long getCouponId() {
		return couponId;
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
