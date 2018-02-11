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
public class RefundLogDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//refund
	private BigDecimal refund;
	//refund_id
	private String refundId;
	//refund_log
	private String refundLog;
	//refund_type
	private String refundType;
	//of_id
	private Long ofId;
	//refund_user_id
	private Long refundUserId;

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
	 * 设置：refund
	 */
	public void setRefund(BigDecimal refund) {
		this.refund = refund;
	}
	/**
	 * 获取：refund
	 */
	public BigDecimal getRefund() {
		return refund;
	}
	/**
	 * 设置：refund_id
	 */
	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}
	/**
	 * 获取：refund_id
	 */
	public String getRefundId() {
		return refundId;
	}
	/**
	 * 设置：refund_log
	 */
	public void setRefundLog(String refundLog) {
		this.refundLog = refundLog;
	}
	/**
	 * 获取：refund_log
	 */
	public String getRefundLog() {
		return refundLog;
	}
	/**
	 * 设置：refund_type
	 */
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}
	/**
	 * 获取：refund_type
	 */
	public String getRefundType() {
		return refundType;
	}
	/**
	 * 设置：of_id
	 */
	public void setOfId(Long ofId) {
		this.ofId = ofId;
	}
	/**
	 * 获取：of_id
	 */
	public Long getOfId() {
		return ofId;
	}
	/**
	 * 设置：refund_user_id
	 */
	public void setRefundUserId(Long refundUserId) {
		this.refundUserId = refundUserId;
	}
	/**
	 * 获取：refund_user_id
	 */
	public Long getRefundUserId() {
		return refundUserId;
	}
}
