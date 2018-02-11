package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
public class DynamicDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//content
	private String content;
	//discussNum
	private Integer discussnum;
	//praiseNum
	private Integer praisenum;
	//turnNum
	private Integer turnnum;
	//dissParent_id
	private Long dissparentId;
	//goods_id
	private Long goodsId;
	//turnParent_id
	private Long turnparentId;
	//user_id
	private Long userId;
	//locked
	private Boolean locked;
	//img_id
	private Long imgId;
	//store_id
	private Long storeId;
	//display
	private Boolean display;

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
	 * 设置：discussNum
	 */
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	/**
	 * 获取：discussNum
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
	/**
	 * 设置：praiseNum
	 */
	public void setPraisenum(Integer praisenum) {
		this.praisenum = praisenum;
	}
	/**
	 * 获取：praiseNum
	 */
	public Integer getPraisenum() {
		return praisenum;
	}
	/**
	 * 设置：turnNum
	 */
	public void setTurnnum(Integer turnnum) {
		this.turnnum = turnnum;
	}
	/**
	 * 获取：turnNum
	 */
	public Integer getTurnnum() {
		return turnnum;
	}
	/**
	 * 设置：dissParent_id
	 */
	public void setDissparentId(Long dissparentId) {
		this.dissparentId = dissparentId;
	}
	/**
	 * 获取：dissParent_id
	 */
	public Long getDissparentId() {
		return dissparentId;
	}
	/**
	 * 设置：goods_id
	 */
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}
	/**
	 * 获取：goods_id
	 */
	public Long getGoodsId() {
		return goodsId;
	}
	/**
	 * 设置：turnParent_id
	 */
	public void setTurnparentId(Long turnparentId) {
		this.turnparentId = turnparentId;
	}
	/**
	 * 获取：turnParent_id
	 */
	public Long getTurnparentId() {
		return turnparentId;
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
	 * 设置：locked
	 */
	public void setLocked(Boolean locked) {
		this.locked = locked;
	}
	/**
	 * 获取：locked
	 */
	public Boolean getLocked() {
		return locked;
	}
	/**
	 * 设置：img_id
	 */
	public void setImgId(Long imgId) {
		this.imgId = imgId;
	}
	/**
	 * 获取：img_id
	 */
	public Long getImgId() {
		return imgId;
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
}
