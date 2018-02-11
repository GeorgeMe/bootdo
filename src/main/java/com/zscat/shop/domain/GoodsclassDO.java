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
public class GoodsclassDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//className
	private String classname;
	//display
	private Boolean display;
	//level
	private Integer level;
	//recommend
	private Boolean recommend;
	//sequence
	private Integer sequence;
	//goodsType_id
	private Long goodstypeId;
	//parent_id
	private Long parentId;
	//seo_description
	private String seoDescription;
	//seo_keywords
	private String seoKeywords;
	//icon_sys
	private String iconSys;
	//icon_type
	private Integer iconType;
	//icon_acc_id
	private Long iconAccId;

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
	 * 设置：recommend
	 */
	public void setRecommend(Boolean recommend) {
		this.recommend = recommend;
	}
	/**
	 * 获取：recommend
	 */
	public Boolean getRecommend() {
		return recommend;
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
	 * 设置：goodsType_id
	 */
	public void setGoodstypeId(Long goodstypeId) {
		this.goodstypeId = goodstypeId;
	}
	/**
	 * 获取：goodsType_id
	 */
	public Long getGoodstypeId() {
		return goodstypeId;
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
	/**
	 * 设置：seo_description
	 */
	public void setSeoDescription(String seoDescription) {
		this.seoDescription = seoDescription;
	}
	/**
	 * 获取：seo_description
	 */
	public String getSeoDescription() {
		return seoDescription;
	}
	/**
	 * 设置：seo_keywords
	 */
	public void setSeoKeywords(String seoKeywords) {
		this.seoKeywords = seoKeywords;
	}
	/**
	 * 获取：seo_keywords
	 */
	public String getSeoKeywords() {
		return seoKeywords;
	}
	/**
	 * 设置：icon_sys
	 */
	public void setIconSys(String iconSys) {
		this.iconSys = iconSys;
	}
	/**
	 * 获取：icon_sys
	 */
	public String getIconSys() {
		return iconSys;
	}
	/**
	 * 设置：icon_type
	 */
	public void setIconType(Integer iconType) {
		this.iconType = iconType;
	}
	/**
	 * 获取：icon_type
	 */
	public Integer getIconType() {
		return iconType;
	}
	/**
	 * 设置：icon_acc_id
	 */
	public void setIconAccId(Long iconAccId) {
		this.iconAccId = iconAccId;
	}
	/**
	 * 获取：icon_acc_id
	 */
	public Long getIconAccId() {
		return iconAccId;
	}
}
