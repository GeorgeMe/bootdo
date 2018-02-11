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
public class ChattinglogDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//content
	private String content;
	//User_id
	private Long userId;
	//chatting_id
	private Long chattingId;
	//mark
	private Integer mark;

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
	 * 设置：User_id
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：User_id
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：chatting_id
	 */
	public void setChattingId(Long chattingId) {
		this.chattingId = chattingId;
	}
	/**
	 * 获取：chatting_id
	 */
	public Long getChattingId() {
		return chattingId;
	}
	/**
	 * 设置：mark
	 */
	public void setMark(Integer mark) {
		this.mark = mark;
	}
	/**
	 * 获取：mark
	 */
	public Integer getMark() {
		return mark;
	}
}
