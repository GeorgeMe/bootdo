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
public class GoldRecordDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//gold_admin_info
	private String goldAdminInfo;
	//gold_admin_time
	private Date goldAdminTime;
	//gold_count
	private Integer goldCount;
	//gold_exchange_info
	private String goldExchangeInfo;
	//gold_money
	private Integer goldMoney;
	//gold_pay_status
	private Integer goldPayStatus;
	//gold_payment
	private String goldPayment;
	//gold_sn
	private String goldSn;
	//gold_status
	private Integer goldStatus;
	//gold_admin_id
	private Long goldAdminId;
	//gold_user_id
	private Long goldUserId;

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
	 * 设置：gold_admin_info
	 */
	public void setGoldAdminInfo(String goldAdminInfo) {
		this.goldAdminInfo = goldAdminInfo;
	}
	/**
	 * 获取：gold_admin_info
	 */
	public String getGoldAdminInfo() {
		return goldAdminInfo;
	}
	/**
	 * 设置：gold_admin_time
	 */
	public void setGoldAdminTime(Date goldAdminTime) {
		this.goldAdminTime = goldAdminTime;
	}
	/**
	 * 获取：gold_admin_time
	 */
	public Date getGoldAdminTime() {
		return goldAdminTime;
	}
	/**
	 * 设置：gold_count
	 */
	public void setGoldCount(Integer goldCount) {
		this.goldCount = goldCount;
	}
	/**
	 * 获取：gold_count
	 */
	public Integer getGoldCount() {
		return goldCount;
	}
	/**
	 * 设置：gold_exchange_info
	 */
	public void setGoldExchangeInfo(String goldExchangeInfo) {
		this.goldExchangeInfo = goldExchangeInfo;
	}
	/**
	 * 获取：gold_exchange_info
	 */
	public String getGoldExchangeInfo() {
		return goldExchangeInfo;
	}
	/**
	 * 设置：gold_money
	 */
	public void setGoldMoney(Integer goldMoney) {
		this.goldMoney = goldMoney;
	}
	/**
	 * 获取：gold_money
	 */
	public Integer getGoldMoney() {
		return goldMoney;
	}
	/**
	 * 设置：gold_pay_status
	 */
	public void setGoldPayStatus(Integer goldPayStatus) {
		this.goldPayStatus = goldPayStatus;
	}
	/**
	 * 获取：gold_pay_status
	 */
	public Integer getGoldPayStatus() {
		return goldPayStatus;
	}
	/**
	 * 设置：gold_payment
	 */
	public void setGoldPayment(String goldPayment) {
		this.goldPayment = goldPayment;
	}
	/**
	 * 获取：gold_payment
	 */
	public String getGoldPayment() {
		return goldPayment;
	}
	/**
	 * 设置：gold_sn
	 */
	public void setGoldSn(String goldSn) {
		this.goldSn = goldSn;
	}
	/**
	 * 获取：gold_sn
	 */
	public String getGoldSn() {
		return goldSn;
	}
	/**
	 * 设置：gold_status
	 */
	public void setGoldStatus(Integer goldStatus) {
		this.goldStatus = goldStatus;
	}
	/**
	 * 获取：gold_status
	 */
	public Integer getGoldStatus() {
		return goldStatus;
	}
	/**
	 * 设置：gold_admin_id
	 */
	public void setGoldAdminId(Long goldAdminId) {
		this.goldAdminId = goldAdminId;
	}
	/**
	 * 获取：gold_admin_id
	 */
	public Long getGoldAdminId() {
		return goldAdminId;
	}
	/**
	 * 设置：gold_user_id
	 */
	public void setGoldUserId(Long goldUserId) {
		this.goldUserId = goldUserId;
	}
	/**
	 * 获取：gold_user_id
	 */
	public Long getGoldUserId() {
		return goldUserId;
	}
}
