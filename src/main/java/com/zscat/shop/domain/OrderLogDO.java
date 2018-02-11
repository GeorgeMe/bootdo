package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public class OrderLogDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//log_info
	private String logInfo;
	//state_info
	private String stateInfo;
	//log_user_id
	private Long logUserId;
	//of_id
	private Long ofId;

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
	 * 设置：log_info
	 */
	public void setLogInfo(String logInfo) {
		this.logInfo = logInfo;
	}
	/**
	 * 获取：log_info
	 */
	public String getLogInfo() {
		return logInfo;
	}
	/**
	 * 设置：state_info
	 */
	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
	/**
	 * 获取：state_info
	 */
	public String getStateInfo() {
		return stateInfo;
	}
	/**
	 * 设置：log_user_id
	 */
	public void setLogUserId(Long logUserId) {
		this.logUserId = logUserId;
	}
	/**
	 * 获取：log_user_id
	 */
	public Long getLogUserId() {
		return logUserId;
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
}
