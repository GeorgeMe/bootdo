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
public class PredepositLogDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//pd_log_amount
	private BigDecimal pdLogAmount;
	//pd_log_info
	private String pdLogInfo;
	//pd_op_type
	private String pdOpType;
	//pd_type
	private String pdType;
	//pd_log_admin_id
	private Long pdLogAdminId;
	//pd_log_user_id
	private Long pdLogUserId;
	//predeposit_id
	private Long predepositId;

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
	 * 设置：pd_log_amount
	 */
	public void setPdLogAmount(BigDecimal pdLogAmount) {
		this.pdLogAmount = pdLogAmount;
	}
	/**
	 * 获取：pd_log_amount
	 */
	public BigDecimal getPdLogAmount() {
		return pdLogAmount;
	}
	/**
	 * 设置：pd_log_info
	 */
	public void setPdLogInfo(String pdLogInfo) {
		this.pdLogInfo = pdLogInfo;
	}
	/**
	 * 获取：pd_log_info
	 */
	public String getPdLogInfo() {
		return pdLogInfo;
	}
	/**
	 * 设置：pd_op_type
	 */
	public void setPdOpType(String pdOpType) {
		this.pdOpType = pdOpType;
	}
	/**
	 * 获取：pd_op_type
	 */
	public String getPdOpType() {
		return pdOpType;
	}
	/**
	 * 设置：pd_type
	 */
	public void setPdType(String pdType) {
		this.pdType = pdType;
	}
	/**
	 * 获取：pd_type
	 */
	public String getPdType() {
		return pdType;
	}
	/**
	 * 设置：pd_log_admin_id
	 */
	public void setPdLogAdminId(Long pdLogAdminId) {
		this.pdLogAdminId = pdLogAdminId;
	}
	/**
	 * 获取：pd_log_admin_id
	 */
	public Long getPdLogAdminId() {
		return pdLogAdminId;
	}
	/**
	 * 设置：pd_log_user_id
	 */
	public void setPdLogUserId(Long pdLogUserId) {
		this.pdLogUserId = pdLogUserId;
	}
	/**
	 * 获取：pd_log_user_id
	 */
	public Long getPdLogUserId() {
		return pdLogUserId;
	}
	/**
	 * 设置：predeposit_id
	 */
	public void setPredepositId(Long predepositId) {
		this.predepositId = predepositId;
	}
	/**
	 * 获取：predeposit_id
	 */
	public Long getPredepositId() {
		return predepositId;
	}
}
