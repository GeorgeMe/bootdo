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
public class AlbumDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//alblum_info
	private String alblumInfo;
	//album_default
	private Boolean albumDefault;
	//album_name
	private String albumName;
	//album_sequence
	private Integer albumSequence;
	//album_cover_id
	private Long albumCoverId;
	//user_id
	private Long userId;

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
	 * 设置：alblum_info
	 */
	public void setAlblumInfo(String alblumInfo) {
		this.alblumInfo = alblumInfo;
	}
	/**
	 * 获取：alblum_info
	 */
	public String getAlblumInfo() {
		return alblumInfo;
	}
	/**
	 * 设置：album_default
	 */
	public void setAlbumDefault(Boolean albumDefault) {
		this.albumDefault = albumDefault;
	}
	/**
	 * 获取：album_default
	 */
	public Boolean getAlbumDefault() {
		return albumDefault;
	}
	/**
	 * 设置：album_name
	 */
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	/**
	 * 获取：album_name
	 */
	public String getAlbumName() {
		return albumName;
	}
	/**
	 * 设置：album_sequence
	 */
	public void setAlbumSequence(Integer albumSequence) {
		this.albumSequence = albumSequence;
	}
	/**
	 * 获取：album_sequence
	 */
	public Integer getAlbumSequence() {
		return albumSequence;
	}
	/**
	 * 设置：album_cover_id
	 */
	public void setAlbumCoverId(Long albumCoverId) {
		this.albumCoverId = albumCoverId;
	}
	/**
	 * 获取：album_cover_id
	 */
	public Long getAlbumCoverId() {
		return albumCoverId;
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
}
