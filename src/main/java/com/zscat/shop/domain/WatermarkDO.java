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
public class WatermarkDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//wm_image_alpha
	private Float wmImageAlpha;
	//wm_image_open
	private Boolean wmImageOpen;
	//wm_image_pos
	private Integer wmImagePos;
	//wm_text
	private String wmText;
	//wm_text_color
	private String wmTextColor;
	//wm_text_font
	private String wmTextFont;
	//wm_text_font_size
	private Integer wmTextFontSize;
	//wm_text_open
	private Boolean wmTextOpen;
	//wm_text_pos
	private Integer wmTextPos;
	//store_id
	private Long storeId;
	//wm_image_id
	private Long wmImageId;

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
	 * 设置：wm_image_alpha
	 */
	public void setWmImageAlpha(Float wmImageAlpha) {
		this.wmImageAlpha = wmImageAlpha;
	}
	/**
	 * 获取：wm_image_alpha
	 */
	public Float getWmImageAlpha() {
		return wmImageAlpha;
	}
	/**
	 * 设置：wm_image_open
	 */
	public void setWmImageOpen(Boolean wmImageOpen) {
		this.wmImageOpen = wmImageOpen;
	}
	/**
	 * 获取：wm_image_open
	 */
	public Boolean getWmImageOpen() {
		return wmImageOpen;
	}
	/**
	 * 设置：wm_image_pos
	 */
	public void setWmImagePos(Integer wmImagePos) {
		this.wmImagePos = wmImagePos;
	}
	/**
	 * 获取：wm_image_pos
	 */
	public Integer getWmImagePos() {
		return wmImagePos;
	}
	/**
	 * 设置：wm_text
	 */
	public void setWmText(String wmText) {
		this.wmText = wmText;
	}
	/**
	 * 获取：wm_text
	 */
	public String getWmText() {
		return wmText;
	}
	/**
	 * 设置：wm_text_color
	 */
	public void setWmTextColor(String wmTextColor) {
		this.wmTextColor = wmTextColor;
	}
	/**
	 * 获取：wm_text_color
	 */
	public String getWmTextColor() {
		return wmTextColor;
	}
	/**
	 * 设置：wm_text_font
	 */
	public void setWmTextFont(String wmTextFont) {
		this.wmTextFont = wmTextFont;
	}
	/**
	 * 获取：wm_text_font
	 */
	public String getWmTextFont() {
		return wmTextFont;
	}
	/**
	 * 设置：wm_text_font_size
	 */
	public void setWmTextFontSize(Integer wmTextFontSize) {
		this.wmTextFontSize = wmTextFontSize;
	}
	/**
	 * 获取：wm_text_font_size
	 */
	public Integer getWmTextFontSize() {
		return wmTextFontSize;
	}
	/**
	 * 设置：wm_text_open
	 */
	public void setWmTextOpen(Boolean wmTextOpen) {
		this.wmTextOpen = wmTextOpen;
	}
	/**
	 * 获取：wm_text_open
	 */
	public Boolean getWmTextOpen() {
		return wmTextOpen;
	}
	/**
	 * 设置：wm_text_pos
	 */
	public void setWmTextPos(Integer wmTextPos) {
		this.wmTextPos = wmTextPos;
	}
	/**
	 * 获取：wm_text_pos
	 */
	public Integer getWmTextPos() {
		return wmTextPos;
	}
	/**
	 * 设置：store_id
	 */
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	/**
	 * 获取：store_id
	 */
	public Long getStoreId() {
		return storeId;
	}
	/**
	 * 设置：wm_image_id
	 */
	public void setWmImageId(Long wmImageId) {
		this.wmImageId = wmImageId;
	}
	/**
	 * 获取：wm_image_id
	 */
	public Long getWmImageId() {
		return wmImageId;
	}
}
