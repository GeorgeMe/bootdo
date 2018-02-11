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
public class GoodsFloorDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//gf_css
	private String gfCss;
	//gf_display
	private Boolean gfDisplay;
	//gf_goods_count
	private Integer gfGoodsCount;
	//gf_level
	private Integer gfLevel;
	//gf_name
	private String gfName;
	//gf_sequence
	private Integer gfSequence;
	//parent_id
	private Long parentId;
	//gf_gc_goods
	private String gfGcGoods;
	//gf_gc_list
	private String gfGcList;
	//gf_left_adv
	private String gfLeftAdv;
	//gf_list_goods
	private String gfListGoods;
	//gf_right_adv
	private String gfRightAdv;
	//gf_brand_list
	private String gfBrandList;

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
	 * 设置：gf_css
	 */
	public void setGfCss(String gfCss) {
		this.gfCss = gfCss;
	}
	/**
	 * 获取：gf_css
	 */
	public String getGfCss() {
		return gfCss;
	}
	/**
	 * 设置：gf_display
	 */
	public void setGfDisplay(Boolean gfDisplay) {
		this.gfDisplay = gfDisplay;
	}
	/**
	 * 获取：gf_display
	 */
	public Boolean getGfDisplay() {
		return gfDisplay;
	}
	/**
	 * 设置：gf_goods_count
	 */
	public void setGfGoodsCount(Integer gfGoodsCount) {
		this.gfGoodsCount = gfGoodsCount;
	}
	/**
	 * 获取：gf_goods_count
	 */
	public Integer getGfGoodsCount() {
		return gfGoodsCount;
	}
	/**
	 * 设置：gf_level
	 */
	public void setGfLevel(Integer gfLevel) {
		this.gfLevel = gfLevel;
	}
	/**
	 * 获取：gf_level
	 */
	public Integer getGfLevel() {
		return gfLevel;
	}
	/**
	 * 设置：gf_name
	 */
	public void setGfName(String gfName) {
		this.gfName = gfName;
	}
	/**
	 * 获取：gf_name
	 */
	public String getGfName() {
		return gfName;
	}
	/**
	 * 设置：gf_sequence
	 */
	public void setGfSequence(Integer gfSequence) {
		this.gfSequence = gfSequence;
	}
	/**
	 * 获取：gf_sequence
	 */
	public Integer getGfSequence() {
		return gfSequence;
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
	 * 设置：gf_gc_goods
	 */
	public void setGfGcGoods(String gfGcGoods) {
		this.gfGcGoods = gfGcGoods;
	}
	/**
	 * 获取：gf_gc_goods
	 */
	public String getGfGcGoods() {
		return gfGcGoods;
	}
	/**
	 * 设置：gf_gc_list
	 */
	public void setGfGcList(String gfGcList) {
		this.gfGcList = gfGcList;
	}
	/**
	 * 获取：gf_gc_list
	 */
	public String getGfGcList() {
		return gfGcList;
	}
	/**
	 * 设置：gf_left_adv
	 */
	public void setGfLeftAdv(String gfLeftAdv) {
		this.gfLeftAdv = gfLeftAdv;
	}
	/**
	 * 获取：gf_left_adv
	 */
	public String getGfLeftAdv() {
		return gfLeftAdv;
	}
	/**
	 * 设置：gf_list_goods
	 */
	public void setGfListGoods(String gfListGoods) {
		this.gfListGoods = gfListGoods;
	}
	/**
	 * 获取：gf_list_goods
	 */
	public String getGfListGoods() {
		return gfListGoods;
	}
	/**
	 * 设置：gf_right_adv
	 */
	public void setGfRightAdv(String gfRightAdv) {
		this.gfRightAdv = gfRightAdv;
	}
	/**
	 * 获取：gf_right_adv
	 */
	public String getGfRightAdv() {
		return gfRightAdv;
	}
	/**
	 * 设置：gf_brand_list
	 */
	public void setGfBrandList(String gfBrandList) {
		this.gfBrandList = gfBrandList;
	}
	/**
	 * 获取：gf_brand_list
	 */
	public String getGfBrandList() {
		return gfBrandList;
	}
}
