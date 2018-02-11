package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public class SpareGoodsfloorDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//adver_id
	private String adverId;
	//sequence
	private Integer sequence;
	//title
	private String title;
	//visable
	private Integer visable;
	//sgc_id
	private Long sgcId;
	//adver_type
	private Integer adverType;
	//advert_url
	private String advertUrl;
	//advert_id
	private Long advertId;
	//advert_img_id
	private Long advertImgId;
	//display
	private Boolean display;
	//adp_id
	private Long adpId;

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
	 * 设置：adver_id
	 */
	public void setAdverId(String adverId) {
		this.adverId = adverId;
	}
	/**
	 * 获取：adver_id
	 */
	public String getAdverId() {
		return adverId;
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
	 * 设置：visable
	 */
	public void setVisable(Integer visable) {
		this.visable = visable;
	}
	/**
	 * 获取：visable
	 */
	public Integer getVisable() {
		return visable;
	}
	/**
	 * 设置：sgc_id
	 */
	public void setSgcId(Long sgcId) {
		this.sgcId = sgcId;
	}
	/**
	 * 获取：sgc_id
	 */
	public Long getSgcId() {
		return sgcId;
	}
	/**
	 * 设置：adver_type
	 */
	public void setAdverType(Integer adverType) {
		this.adverType = adverType;
	}
	/**
	 * 获取：adver_type
	 */
	public Integer getAdverType() {
		return adverType;
	}
	/**
	 * 设置：advert_url
	 */
	public void setAdvertUrl(String advertUrl) {
		this.advertUrl = advertUrl;
	}
	/**
	 * 获取：advert_url
	 */
	public String getAdvertUrl() {
		return advertUrl;
	}
	/**
	 * 设置：advert_id
	 */
	public void setAdvertId(Long advertId) {
		this.advertId = advertId;
	}
	/**
	 * 获取：advert_id
	 */
	public Long getAdvertId() {
		return advertId;
	}
	/**
	 * 设置：advert_img_id
	 */
	public void setAdvertImgId(Long advertImgId) {
		this.advertImgId = advertImgId;
	}
	/**
	 * 获取：advert_img_id
	 */
	public Long getAdvertImgId() {
		return advertImgId;
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
	 * 设置：adp_id
	 */
	public void setAdpId(Long adpId) {
		this.adpId = adpId;
	}
	/**
	 * 获取：adp_id
	 */
	public Long getAdpId() {
		return adpId;
	}
}
