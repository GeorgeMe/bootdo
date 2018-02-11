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
public class AccessoryDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//ext
	private String ext;
	//height
	private Integer height;
	//info
	private String info;
	//name
	private String name;
	//path
	private String path;
	//size
	private Float size;
	//width
	private Integer width;
	//album_id
	private Long albumId;
	//user_id
	private Long userId;
	//config_id
	private Long configId;

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
	 * 设置：ext
	 */
	public void setExt(String ext) {
		this.ext = ext;
	}
	/**
	 * 获取：ext
	 */
	public String getExt() {
		return ext;
	}
	/**
	 * 设置：height
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}
	/**
	 * 获取：height
	 */
	public Integer getHeight() {
		return height;
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
	 * 设置：name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：name
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：path
	 */
	public void setPath(String path) {
		this.path = path;
	}
	/**
	 * 获取：path
	 */
	public String getPath() {
		return path;
	}
	/**
	 * 设置：size
	 */
	public void setSize(Float size) {
		this.size = size;
	}
	/**
	 * 获取：size
	 */
	public Float getSize() {
		return size;
	}
	/**
	 * 设置：width
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}
	/**
	 * 获取：width
	 */
	public Integer getWidth() {
		return width;
	}
	/**
	 * 设置：album_id
	 */
	public void setAlbumId(Long albumId) {
		this.albumId = albumId;
	}
	/**
	 * 获取：album_id
	 */
	public Long getAlbumId() {
		return albumId;
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
	 * 设置：config_id
	 */
	public void setConfigId(Long configId) {
		this.configId = configId;
	}
	/**
	 * 获取：config_id
	 */
	public Long getConfigId() {
		return configId;
	}
}
