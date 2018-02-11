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
public class AdvertDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//ad_begin_time
	private Date adBeginTime;
	//ad_click_num
	private Integer adClickNum;
	//ad_end_time
	private Date adEndTime;
	//ad_gold
	private Integer adGold;
	//ad_slide_sequence
	private Integer adSlideSequence;
	//ad_status
	private Integer adStatus;
	//ad_text
	private String adText;
	//ad_title
	private String adTitle;
	//ad_url
	private String adUrl;
	//ad_acc_id
	private Long adAccId;
	//ad_ap_id
	private Long adApId;
	//ad_user_id
	private Long adUserId;

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
	 * 设置：ad_begin_time
	 */
	public void setAdBeginTime(Date adBeginTime) {
		this.adBeginTime = adBeginTime;
	}
	/**
	 * 获取：ad_begin_time
	 */
	public Date getAdBeginTime() {
		return adBeginTime;
	}
	/**
	 * 设置：ad_click_num
	 */
	public void setAdClickNum(Integer adClickNum) {
		this.adClickNum = adClickNum;
	}
	/**
	 * 获取：ad_click_num
	 */
	public Integer getAdClickNum() {
		return adClickNum;
	}
	/**
	 * 设置：ad_end_time
	 */
	public void setAdEndTime(Date adEndTime) {
		this.adEndTime = adEndTime;
	}
	/**
	 * 获取：ad_end_time
	 */
	public Date getAdEndTime() {
		return adEndTime;
	}
	/**
	 * 设置：ad_gold
	 */
	public void setAdGold(Integer adGold) {
		this.adGold = adGold;
	}
	/**
	 * 获取：ad_gold
	 */
	public Integer getAdGold() {
		return adGold;
	}
	/**
	 * 设置：ad_slide_sequence
	 */
	public void setAdSlideSequence(Integer adSlideSequence) {
		this.adSlideSequence = adSlideSequence;
	}
	/**
	 * 获取：ad_slide_sequence
	 */
	public Integer getAdSlideSequence() {
		return adSlideSequence;
	}
	/**
	 * 设置：ad_status
	 */
	public void setAdStatus(Integer adStatus) {
		this.adStatus = adStatus;
	}
	/**
	 * 获取：ad_status
	 */
	public Integer getAdStatus() {
		return adStatus;
	}
	/**
	 * 设置：ad_text
	 */
	public void setAdText(String adText) {
		this.adText = adText;
	}
	/**
	 * 获取：ad_text
	 */
	public String getAdText() {
		return adText;
	}
	/**
	 * 设置：ad_title
	 */
	public void setAdTitle(String adTitle) {
		this.adTitle = adTitle;
	}
	/**
	 * 获取：ad_title
	 */
	public String getAdTitle() {
		return adTitle;
	}
	/**
	 * 设置：ad_url
	 */
	public void setAdUrl(String adUrl) {
		this.adUrl = adUrl;
	}
	/**
	 * 获取：ad_url
	 */
	public String getAdUrl() {
		return adUrl;
	}
	/**
	 * 设置：ad_acc_id
	 */
	public void setAdAccId(Long adAccId) {
		this.adAccId = adAccId;
	}
	/**
	 * 获取：ad_acc_id
	 */
	public Long getAdAccId() {
		return adAccId;
	}
	/**
	 * 设置：ad_ap_id
	 */
	public void setAdApId(Long adApId) {
		this.adApId = adApId;
	}
	/**
	 * 获取：ad_ap_id
	 */
	public Long getAdApId() {
		return adApId;
	}
	/**
	 * 设置：ad_user_id
	 */
	public void setAdUserId(Long adUserId) {
		this.adUserId = adUserId;
	}
	/**
	 * 获取：ad_user_id
	 */
	public Long getAdUserId() {
		return adUserId;
	}
}
