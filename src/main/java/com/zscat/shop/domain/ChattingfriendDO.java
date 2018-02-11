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
public class ChattingfriendDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//type
	private Integer type;
	//friend_id
	private Long friendId;
	//user_id
	private Long userId;
	//friendUser_id
	private Long frienduserId;

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
	 * 设置：friend_id
	 */
	public void setFriendId(Long friendId) {
		this.friendId = friendId;
	}
	/**
	 * 获取：friend_id
	 */
	public Long getFriendId() {
		return friendId;
	}
	/**
	 * 设置：user_id
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：user_id
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：friendUser_id
	 */
	public void setFrienduserId(Long frienduserId) {
		this.frienduserId = frienduserId;
	}
	/**
	 * 获取：friendUser_id
	 */
	public Long getFrienduserId() {
		return frienduserId;
	}
}
