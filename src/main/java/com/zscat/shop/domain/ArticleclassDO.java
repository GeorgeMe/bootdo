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
public class ArticleclassDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//className
	private String classname;
	//level
	private Integer level;
	//mark
	private String mark;
	//sequence
	private Integer sequence;
	//sysClass
	private Boolean sysclass;
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
	 * 设置：className
	 */
	public void setClassname(String classname) {
		this.classname = classname;
	}
	/**
	 * 获取：className
	 */
	public String getClassname() {
		return classname;
	}
	/**
	 * 设置：level
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}
	/**
	 * 获取：level
	 */
	public Integer getLevel() {
		return level;
	}
	/**
	 * 设置：mark
	 */
	public void setMark(String mark) {
		this.mark = mark;
	}
	/**
	 * 获取：mark
	 */
	public String getMark() {
		return mark;
	}
	/**
	 * 设置：sequence
	 */
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
	/**
	 * 获取：sequence
	 */
	public Integer getSequence() {
		return sequence;
	}
	/**
	 * 设置：sysClass
	 */
	public void setSysclass(Boolean sysclass) {
		this.sysclass = sysclass;
	}
	/**
	 * 获取：sysClass
	 */
	public Boolean getSysclass() {
		return sysclass;
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
