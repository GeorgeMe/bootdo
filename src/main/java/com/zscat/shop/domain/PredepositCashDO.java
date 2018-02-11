package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;



/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public class PredepositCashDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//cash_account
	private String cashAccount;
	//cash_admin_info
	private String cashAdminInfo;
	//cash_amount
	private BigDecimal cashAmount;
	//cash_bank
	private String cashBank;
	//cash_info
	private String cashInfo;
	//cash_pay_status
	private Integer cashPayStatus;
	//cash_payment
	private String cashPayment;
	//cash_sn
	private String cashSn;
	//cash_status
	private Integer cashStatus;
	//cash_userName
	private String cashUsername;
	//cash_admin_id
	private Long cashAdminId;
	//cash_user_id
	private Long cashUserId;

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
	 * 设置：cash_account
	 */
	public void setCashAccount(String cashAccount) {
		this.cashAccount = cashAccount;
	}
	/**
	 * 获取：cash_account
	 */
	public String getCashAccount() {
		return cashAccount;
	}
	/**
	 * 设置：cash_admin_info
	 */
	public void setCashAdminInfo(String cashAdminInfo) {
		this.cashAdminInfo = cashAdminInfo;
	}
	/**
	 * 获取：cash_admin_info
	 */
	public String getCashAdminInfo() {
		return cashAdminInfo;
	}
	/**
	 * 设置：cash_amount
	 */
	public void setCashAmount(BigDecimal cashAmount) {
		this.cashAmount = cashAmount;
	}
	/**
	 * 获取：cash_amount
	 */
	public BigDecimal getCashAmount() {
		return cashAmount;
	}
	/**
	 * 设置：cash_bank
	 */
	public void setCashBank(String cashBank) {
		this.cashBank = cashBank;
	}
	/**
	 * 获取：cash_bank
	 */
	public String getCashBank() {
		return cashBank;
	}
	/**
	 * 设置：cash_info
	 */
	public void setCashInfo(String cashInfo) {
		this.cashInfo = cashInfo;
	}
	/**
	 * 获取：cash_info
	 */
	public String getCashInfo() {
		return cashInfo;
	}
	/**
	 * 设置：cash_pay_status
	 */
	public void setCashPayStatus(Integer cashPayStatus) {
		this.cashPayStatus = cashPayStatus;
	}
	/**
	 * 获取：cash_pay_status
	 */
	public Integer getCashPayStatus() {
		return cashPayStatus;
	}
	/**
	 * 设置：cash_payment
	 */
	public void setCashPayment(String cashPayment) {
		this.cashPayment = cashPayment;
	}
	/**
	 * 获取：cash_payment
	 */
	public String getCashPayment() {
		return cashPayment;
	}
	/**
	 * 设置：cash_sn
	 */
	public void setCashSn(String cashSn) {
		this.cashSn = cashSn;
	}
	/**
	 * 获取：cash_sn
	 */
	public String getCashSn() {
		return cashSn;
	}
	/**
	 * 设置：cash_status
	 */
	public void setCashStatus(Integer cashStatus) {
		this.cashStatus = cashStatus;
	}
	/**
	 * 获取：cash_status
	 */
	public Integer getCashStatus() {
		return cashStatus;
	}
	/**
	 * 设置：cash_userName
	 */
	public void setCashUsername(String cashUsername) {
		this.cashUsername = cashUsername;
	}
	/**
	 * 获取：cash_userName
	 */
	public String getCashUsername() {
		return cashUsername;
	}
	/**
	 * 设置：cash_admin_id
	 */
	public void setCashAdminId(Long cashAdminId) {
		this.cashAdminId = cashAdminId;
	}
	/**
	 * 获取：cash_admin_id
	 */
	public Long getCashAdminId() {
		return cashAdminId;
	}
	/**
	 * 设置：cash_user_id
	 */
	public void setCashUserId(Long cashUserId) {
		this.cashUserId = cashUserId;
	}
	/**
	 * 获取：cash_user_id
	 */
	public Long getCashUserId() {
		return cashUserId;
	}
}
