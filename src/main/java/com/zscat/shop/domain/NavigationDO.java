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
public class NavigationDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//display
	private Boolean display;
	//location
	private Integer location;
	//new_win
	private Integer newWin;
	//sequence
	private Integer sequence;
	//sysNav
	private Boolean sysnav;
	//title
	private String title;
	//type
	private String type;
	//type_id
	private Long typeId;
	//url
	private String url;
	//original_url
	private String originalUrl;

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
	 * 设置：display
	 */
	public void setDisplay(Boolean display) {
		this.display = display;
	}
	/**
	 * 获取：display
	 */
	public Boolean getDisplay() {
		return display;
	}
	/**
	 * 设置：location
	 */
	public void setLocation(Integer location) {
		this.location = location;
	}
	/**
	 * 获取：location
	 */
	public Integer getLocation() {
		return location;
	}
	/**
	 * 设置：new_win
	 */
	public void setNewWin(Integer newWin) {
		this.newWin = newWin;
	}
	/**
	 * 获取：new_win
	 */
	public Integer getNewWin() {
		return newWin;
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
	 * 设置：sysNav
	 */
	public void setSysnav(Boolean sysnav) {
		this.sysnav = sysnav;
	}
	/**
	 * 获取：sysNav
	 */
	public Boolean getSysnav() {
		return sysnav;
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
	/**
	 * 设置：type_id
	 */
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	/**
	 * 获取：type_id
	 */
	public Long getTypeId() {
		return typeId;
	}
	/**
	 * 设置：url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * 设置：original_url
	 */
	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
	}
	/**
	 * 获取：original_url
	 */
	public String getOriginalUrl() {
		return originalUrl;
	}
}
