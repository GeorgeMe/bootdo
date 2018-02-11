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
public class MessageDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//content
	private String content;
	//status
	private Integer status;
	//title
	private String title;
	//type
	private Integer type;
	//fromUser_id
	private Long fromuserId;
	//parent_id
	private Long parentId;
	//toUser_id
	private Long touserId;
	//reply_status
	private Integer replyStatus;

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
	 * 设置：content
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：content
	 */
	public String getContent() {
		return content;
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
	 * 设置：title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：type
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	/**
	 * 获取：type
	 */
	public Integer getType() {
		return type;
	}
	/**
	 * 设置：fromUser_id
	 */
	public void setFromuserId(Long fromuserId) {
		this.fromuserId = fromuserId;
	}
	/**
	 * 获取：fromUser_id
	 */
	public Long getFromuserId() {
		return fromuserId;
	}
	/**
	 * 设置：parent_id
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：parent_id
	 */
	public Long getParentId() {
		return parentId;
	}
	/**
	 * 设置：toUser_id
	 */
	public void setTouserId(Long touserId) {
		this.touserId = touserId;
	}
	/**
	 * 获取：toUser_id
	 */
	public Long getTouserId() {
		return touserId;
	}
	/**
	 * 设置：reply_status
	 */
	public void setReplyStatus(Integer replyStatus) {
		this.replyStatus = replyStatus;
	}
	/**
	 * 获取：reply_status
	 */
	public Integer getReplyStatus() {
		return replyStatus;
	}
}
