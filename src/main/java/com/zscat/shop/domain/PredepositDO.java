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
public class PredepositDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//pd_admin_info
	private String pdAdminInfo;
	//pd_amount
	private BigDecimal pdAmount;
	//pd_pay_status
	private Integer pdPayStatus;
	//pd_payment
	private String pdPayment;
	//pd_remittance_bank
	private String pdRemittanceBank;
	//pd_remittance_info
	private String pdRemittanceInfo;
	//pd_remittance_time
	private Date pdRemittanceTime;
	//pd_remittance_user
	private String pdRemittanceUser;
	//pd_sn
	private String pdSn;
	//pd_status
	private Integer pdStatus;
	//pd_admin_id
	private Long pdAdminId;
	//pd_user_id
	private Long pdUserId;

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
	 * 设置：pd_admin_info
	 */
	public void setPdAdminInfo(String pdAdminInfo) {
		this.pdAdminInfo = pdAdminInfo;
	}
	/**
	 * 获取：pd_admin_info
	 */
	public String getPdAdminInfo() {
		return pdAdminInfo;
	}
	/**
	 * 设置：pd_amount
	 */
	public void setPdAmount(BigDecimal pdAmount) {
		this.pdAmount = pdAmount;
	}
	/**
	 * 获取：pd_amount
	 */
	public BigDecimal getPdAmount() {
		return pdAmount;
	}
	/**
	 * 设置：pd_pay_status
	 */
	public void setPdPayStatus(Integer pdPayStatus) {
		this.pdPayStatus = pdPayStatus;
	}
	/**
	 * 获取：pd_pay_status
	 */
	public Integer getPdPayStatus() {
		return pdPayStatus;
	}
	/**
	 * 设置：pd_payment
	 */
	public void setPdPayment(String pdPayment) {
		this.pdPayment = pdPayment;
	}
	/**
	 * 获取：pd_payment
	 */
	public String getPdPayment() {
		return pdPayment;
	}
	/**
	 * 设置：pd_remittance_bank
	 */
	public void setPdRemittanceBank(String pdRemittanceBank) {
		this.pdRemittanceBank = pdRemittanceBank;
	}
	/**
	 * 获取：pd_remittance_bank
	 */
	public String getPdRemittanceBank() {
		return pdRemittanceBank;
	}
	/**
	 * 设置：pd_remittance_info
	 */
	public void setPdRemittanceInfo(String pdRemittanceInfo) {
		this.pdRemittanceInfo = pdRemittanceInfo;
	}
	/**
	 * 获取：pd_remittance_info
	 */
	public String getPdRemittanceInfo() {
		return pdRemittanceInfo;
	}
	/**
	 * 设置：pd_remittance_time
	 */
	public void setPdRemittanceTime(Date pdRemittanceTime) {
		this.pdRemittanceTime = pdRemittanceTime;
	}
	/**
	 * 获取：pd_remittance_time
	 */
	public Date getPdRemittanceTime() {
		return pdRemittanceTime;
	}
	/**
	 * 设置：pd_remittance_user
	 */
	public void setPdRemittanceUser(String pdRemittanceUser) {
		this.pdRemittanceUser = pdRemittanceUser;
	}
	/**
	 * 获取：pd_remittance_user
	 */
	public String getPdRemittanceUser() {
		return pdRemittanceUser;
	}
	/**
	 * 设置：pd_sn
	 */
	public void setPdSn(String pdSn) {
		this.pdSn = pdSn;
	}
	/**
	 * 获取：pd_sn
	 */
	public String getPdSn() {
		return pdSn;
	}
	/**
	 * 设置：pd_status
	 */
	public void setPdStatus(Integer pdStatus) {
		this.pdStatus = pdStatus;
	}
	/**
	 * 获取：pd_status
	 */
	public Integer getPdStatus() {
		return pdStatus;
	}
	/**
	 * 设置：pd_admin_id
	 */
	public void setPdAdminId(Long pdAdminId) {
		this.pdAdminId = pdAdminId;
	}
	/**
	 * 获取：pd_admin_id
	 */
	public Long getPdAdminId() {
		return pdAdminId;
	}
	/**
	 * 设置：pd_user_id
	 */
	public void setPdUserId(Long pdUserId) {
		this.pdUserId = pdUserId;
	}
	/**
	 * 获取：pd_user_id
	 */
	public Long getPdUserId() {
		return pdUserId;
	}
}
