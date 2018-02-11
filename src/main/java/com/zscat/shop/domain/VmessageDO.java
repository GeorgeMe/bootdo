package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
public class VmessageDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//content
	private String content;
	//store_id
	private Long storeId;
	//FromUserName
	private String fromusername;
	//MsgType
	private String msgtype;
	//json_map
	private String jsonMap;
	//reply
	private String reply;
	//status
	private Integer status;

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
	 * 设置：store_id
	 */
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	/**
	 * 获取：store_id
	 */
	public Long getStoreId() {
		return storeId;
	}
	/**
	 * 设置：FromUserName
	 */
	public void setFromusername(String fromusername) {
		this.fromusername = fromusername;
	}
	/**
	 * 获取：FromUserName
	 */
	public String getFromusername() {
		return fromusername;
	}
	/**
	 * 设置：MsgType
	 */
	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}
	/**
	 * 获取：MsgType
	 */
	public String getMsgtype() {
		return msgtype;
	}
	/**
	 * 设置：json_map
	 */
	public void setJsonMap(String jsonMap) {
		this.jsonMap = jsonMap;
	}
	/**
	 * 获取：json_map
	 */
	public String getJsonMap() {
		return jsonMap;
	}
	/**
	 * 设置：reply
	 */
	public void setReply(String reply) {
		this.reply = reply;
	}
	/**
	 * 获取：reply
	 */
	public String getReply() {
		return reply;
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
}
