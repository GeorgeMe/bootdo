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
public class UserAttentionDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//fromUser_id
	private Long fromuserId;
	//toUser_id
	private Long touserId;

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
}
