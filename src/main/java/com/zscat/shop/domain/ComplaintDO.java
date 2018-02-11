package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public class ComplaintDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//appeal_time
	private Date appealTime;
	//from_user_content
	private String fromUserContent;
	//handle_content
	private String handleContent;
	//handle_time
	private Date handleTime;
	//status
	private Integer status;
	//talk_content
	private String talkContent;
	//to_user_content
	private String toUserContent;
	//type
	private String type;
	//cs_id
	private Long csId;
	//from_acc1_id
	private Long fromAcc1Id;
	//from_acc2_id
	private Long fromAcc2Id;
	//from_acc3_id
	private Long fromAcc3Id;
	//from_user_id
	private Long fromUserId;
	//handle_user_id
	private Long handleUserId;
	//of_id
	private Long ofId;
	//to_acc1_id
	private Long toAcc1Id;
	//to_acc2_id
	private Long toAcc2Id;
	//to_acc3_id
	private Long toAcc3Id;
	//to_user_id
	private Long toUserId;

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
	 * 设置：appeal_time
	 */
	public void setAppealTime(Date appealTime) {
		this.appealTime = appealTime;
	}
	/**
	 * 获取：appeal_time
	 */
	public Date getAppealTime() {
		return appealTime;
	}
	/**
	 * 设置：from_user_content
	 */
	public void setFromUserContent(String fromUserContent) {
		this.fromUserContent = fromUserContent;
	}
	/**
	 * 获取：from_user_content
	 */
	public String getFromUserContent() {
		return fromUserContent;
	}
	/**
	 * 设置：handle_content
	 */
	public void setHandleContent(String handleContent) {
		this.handleContent = handleContent;
	}
	/**
	 * 获取：handle_content
	 */
	public String getHandleContent() {
		return handleContent;
	}
	/**
	 * 设置：handle_time
	 */
	public void setHandleTime(Date handleTime) {
		this.handleTime = handleTime;
	}
	/**
	 * 获取：handle_time
	 */
	public Date getHandleTime() {
		return handleTime;
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
	 * 设置：talk_content
	 */
	public void setTalkContent(String talkContent) {
		this.talkContent = talkContent;
	}
	/**
	 * 获取：talk_content
	 */
	public String getTalkContent() {
		return talkContent;
	}
	/**
	 * 设置：to_user_content
	 */
	public void setToUserContent(String toUserContent) {
		this.toUserContent = toUserContent;
	}
	/**
	 * 获取：to_user_content
	 */
	public String getToUserContent() {
		return toUserContent;
	}
	/**
	 * 设置：type
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：type
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：cs_id
	 */
	public void setCsId(Long csId) {
		this.csId = csId;
	}
	/**
	 * 获取：cs_id
	 */
	public Long getCsId() {
		return csId;
	}
	/**
	 * 设置：from_acc1_id
	 */
	public void setFromAcc1Id(Long fromAcc1Id) {
		this.fromAcc1Id = fromAcc1Id;
	}
	/**
	 * 获取：from_acc1_id
	 */
	public Long getFromAcc1Id() {
		return fromAcc1Id;
	}
	/**
	 * 设置：from_acc2_id
	 */
	public void setFromAcc2Id(Long fromAcc2Id) {
		this.fromAcc2Id = fromAcc2Id;
	}
	/**
	 * 获取：from_acc2_id
	 */
	public Long getFromAcc2Id() {
		return fromAcc2Id;
	}
	/**
	 * 设置：from_acc3_id
	 */
	public void setFromAcc3Id(Long fromAcc3Id) {
		this.fromAcc3Id = fromAcc3Id;
	}
	/**
	 * 获取：from_acc3_id
	 */
	public Long getFromAcc3Id() {
		return fromAcc3Id;
	}
	/**
	 * 设置：from_user_id
	 */
	public void setFromUserId(Long fromUserId) {
		this.fromUserId = fromUserId;
	}
	/**
	 * 获取：from_user_id
	 */
	public Long getFromUserId() {
		return fromUserId;
	}
	/**
	 * 设置：handle_user_id
	 */
	public void setHandleUserId(Long handleUserId) {
		this.handleUserId = handleUserId;
	}
	/**
	 * 获取：handle_user_id
	 */
	public Long getHandleUserId() {
		return handleUserId;
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
	 * 设置：to_acc1_id
	 */
	public void setToAcc1Id(Long toAcc1Id) {
		this.toAcc1Id = toAcc1Id;
	}
	/**
	 * 获取：to_acc1_id
	 */
	public Long getToAcc1Id() {
		return toAcc1Id;
	}
	/**
	 * 设置：to_acc2_id
	 */
	public void setToAcc2Id(Long toAcc2Id) {
		this.toAcc2Id = toAcc2Id;
	}
	/**
	 * 获取：to_acc2_id
	 */
	public Long getToAcc2Id() {
		return toAcc2Id;
	}
	/**
	 * 设置：to_acc3_id
	 */
	public void setToAcc3Id(Long toAcc3Id) {
		this.toAcc3Id = toAcc3Id;
	}
	/**
	 * 获取：to_acc3_id
	 */
	public Long getToAcc3Id() {
		return toAcc3Id;
	}
	/**
	 * 设置：to_user_id
	 */
	public void setToUserId(Long toUserId) {
		this.toUserId = toUserId;
	}
	/**
	 * 获取：to_user_id
	 */
	public Long getToUserId() {
		return toUserId;
	}
}
