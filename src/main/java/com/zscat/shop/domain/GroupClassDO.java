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
public class GroupClassDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//gc_level
	private Integer gcLevel;
	//gc_name
	private String gcName;
	//gc_sequence
	private Integer gcSequence;
	//parent_id
	private Long parentId;

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
	 * 设置：gc_level
	 */
	public void setGcLevel(Integer gcLevel) {
		this.gcLevel = gcLevel;
	}
	/**
	 * 获取：gc_level
	 */
	public Integer getGcLevel() {
		return gcLevel;
	}
	/**
	 * 设置：gc_name
	 */
	public void setGcName(String gcName) {
		this.gcName = gcName;
	}
	/**
	 * 获取：gc_name
	 */
	public String getGcName() {
		return gcName;
	}
	/**
	 * 设置：gc_sequence
	 */
	public void setGcSequence(Integer gcSequence) {
		this.gcSequence = gcSequence;
	}
	/**
	 * 获取：gc_sequence
	 */
	public Integer getGcSequence() {
		return gcSequence;
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
}
