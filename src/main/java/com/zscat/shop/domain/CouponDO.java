package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;



/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
public class CouponDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//coupon_amount
	private BigDecimal couponAmount;
	//coupon_begin_time
	private Date couponBeginTime;
	//coupon_count
	private Integer couponCount;
	//coupon_end_time
	private Date couponEndTime;
	//coupon_name
	private String couponName;
	//coupon_order_amount
	private BigDecimal couponOrderAmount;
	//coupon_acc_id
	private Long couponAccId;

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
	 * 设置：coupon_amount
	 */
	public void setCouponAmount(BigDecimal couponAmount) {
		this.couponAmount = couponAmount;
	}
	/**
	 * 获取：coupon_amount
	 */
	public BigDecimal getCouponAmount() {
		return couponAmount;
	}
	/**
	 * 设置：coupon_begin_time
	 */
	public void setCouponBeginTime(Date couponBeginTime) {
		this.couponBeginTime = couponBeginTime;
	}
	/**
	 * 获取：coupon_begin_time
	 */
	public Date getCouponBeginTime() {
		return couponBeginTime;
	}
	/**
	 * 设置：coupon_count
	 */
	public void setCouponCount(Integer couponCount) {
		this.couponCount = couponCount;
	}
	/**
	 * 获取：coupon_count
	 */
	public Integer getCouponCount() {
		return couponCount;
	}
	/**
	 * 设置：coupon_end_time
	 */
	public void setCouponEndTime(Date couponEndTime) {
		this.couponEndTime = couponEndTime;
	}
	/**
	 * 获取：coupon_end_time
	 */
	public Date getCouponEndTime() {
		return couponEndTime;
	}
	/**
	 * 设置：coupon_name
	 */
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	/**
	 * 获取：coupon_name
	 */
	public String getCouponName() {
		return couponName;
	}
	/**
	 * 设置：coupon_order_amount
	 */
	public void setCouponOrderAmount(BigDecimal couponOrderAmount) {
		this.couponOrderAmount = couponOrderAmount;
	}
	/**
	 * 获取：coupon_order_amount
	 */
	public BigDecimal getCouponOrderAmount() {
		return couponOrderAmount;
	}
	/**
	 * 设置：coupon_acc_id
	 */
	public void setCouponAccId(Long couponAccId) {
		this.couponAccId = couponAccId;
	}
	/**
	 * 获取：coupon_acc_id
	 */
	public Long getCouponAccId() {
		return couponAccId;
	}
}
