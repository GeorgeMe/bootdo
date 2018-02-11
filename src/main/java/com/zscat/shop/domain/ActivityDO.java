package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;



/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public class ActivityDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//ac_begin_time
	private Date acBeginTime;
	//ac_content
	private String acContent;
	//ac_end_time
	private Date acEndTime;
	//ac_sequence
	private Integer acSequence;
	//ac_status
	private Integer acStatus;
	//ac_title
	private String acTitle;
	//ac_acc_id
	private Long acAccId;
	//ac_rebate
	private BigDecimal acRebate;

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
	 * 设置：ac_begin_time
	 */
	public void setAcBeginTime(Date acBeginTime) {
		this.acBeginTime = acBeginTime;
	}
	/**
	 * 获取：ac_begin_time
	 */
	public Date getAcBeginTime() {
		return acBeginTime;
	}
	/**
	 * 设置：ac_content
	 */
	public void setAcContent(String acContent) {
		this.acContent = acContent;
	}
	/**
	 * 获取：ac_content
	 */
	public String getAcContent() {
		return acContent;
	}
	/**
	 * 设置：ac_end_time
	 */
	public void setAcEndTime(Date acEndTime) {
		this.acEndTime = acEndTime;
	}
	/**
	 * 获取：ac_end_time
	 */
	public Date getAcEndTime() {
		return acEndTime;
	}
	/**
	 * 设置：ac_sequence
	 */
	public void setAcSequence(Integer acSequence) {
		this.acSequence = acSequence;
	}
	/**
	 * 获取：ac_sequence
	 */
	public Integer getAcSequence() {
		return acSequence;
	}
	/**
	 * 设置：ac_status
	 */
	public void setAcStatus(Integer acStatus) {
		this.acStatus = acStatus;
	}
	/**
	 * 获取：ac_status
	 */
	public Integer getAcStatus() {
		return acStatus;
	}
	/**
	 * 设置：ac_title
	 */
	public void setAcTitle(String acTitle) {
		this.acTitle = acTitle;
	}
	/**
	 * 获取：ac_title
	 */
	public String getAcTitle() {
		return acTitle;
	}
	/**
	 * 设置：ac_acc_id
	 */
	public void setAcAccId(Long acAccId) {
		this.acAccId = acAccId;
	}
	/**
	 * 获取：ac_acc_id
	 */
	public Long getAcAccId() {
		return acAccId;
	}
	/**
	 * 设置：ac_rebate
	 */
	public void setAcRebate(BigDecimal acRebate) {
		this.acRebate = acRebate;
	}
	/**
	 * 获取：ac_rebate
	 */
	public BigDecimal getAcRebate() {
		return acRebate;
	}
}
