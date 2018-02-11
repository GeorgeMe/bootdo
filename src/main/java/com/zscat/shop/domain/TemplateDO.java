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
public class TemplateDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//content
	private String content;
	//info
	private String info;
	//mark
	private String mark;
	//open
	private Boolean open;
	//title
	private String title;
	//type
	private String type;

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
	 * 设置：info
	 */
	public void setInfo(String info) {
		this.info = info;
	}
	/**
	 * 获取：info
	 */
	public String getInfo() {
		return info;
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
	 * 设置：open
	 */
	public void setOpen(Boolean open) {
		this.open = open;
	}
	/**
	 * 获取：open
	 */
	public Boolean getOpen() {
		return open;
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
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：type
	 */
	public String getType() {
		return type;
	}
}
