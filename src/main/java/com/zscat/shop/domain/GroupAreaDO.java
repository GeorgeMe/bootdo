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
public class GroupAreaDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//ga_level
	private Integer gaLevel;
	//ga_name
	private String gaName;
	//ga_sequence
	private Integer gaSequence;
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
	 * 设置：ga_level
	 */
	public void setGaLevel(Integer gaLevel) {
		this.gaLevel = gaLevel;
	}
	/**
	 * 获取：ga_level
	 */
	public Integer getGaLevel() {
		return gaLevel;
	}
	/**
	 * 设置：ga_name
	 */
	public void setGaName(String gaName) {
		this.gaName = gaName;
	}
	/**
	 * 获取：ga_name
	 */
	public String getGaName() {
		return gaName;
	}
	/**
	 * 设置：ga_sequence
	 */
	public void setGaSequence(Integer gaSequence) {
		this.gaSequence = gaSequence;
	}
	/**
	 * 获取：ga_sequence
	 */
	public Integer getGaSequence() {
		return gaSequence;
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
