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
public class ChattingDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//type
	private Integer type;
	//user1_id
	private Long user1Id;
	//user2_id
	private Long user2Id;

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
	 * 设置：user1_id
	 */
	public void setUser1Id(Long user1Id) {
		this.user1Id = user1Id;
	}
	/**
	 * 获取：user1_id
	 */
	public Long getUser1Id() {
		return user1Id;
	}
	/**
	 * 设置：user2_id
	 */
	public void setUser2Id(Long user2Id) {
		this.user2Id = user2Id;
	}
	/**
	 * 获取：user2_id
	 */
	public Long getUser2Id() {
		return user2Id;
	}
}
