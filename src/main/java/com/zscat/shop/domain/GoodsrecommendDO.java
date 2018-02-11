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
public class GoodsrecommendDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//browseNum
	private Integer browsenum;
	//code
	private String code;
	//goodsNum
	private Integer goodsnum;
	//imageHeight
	private Integer imageheight;
	//imageWidth
	private Integer imagewidth;
	//remarkInfo
	private String remarkinfo;
	//sequence
	private Integer sequence;
	//showNum
	private Integer shownum;
	//styleName
	private String stylename;
	//typeName
	private String typename;

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
	 * 设置：browseNum
	 */
	public void setBrowsenum(Integer browsenum) {
		this.browsenum = browsenum;
	}
	/**
	 * 获取：browseNum
	 */
	public Integer getBrowsenum() {
		return browsenum;
	}
	/**
	 * 设置：code
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 获取：code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * 设置：goodsNum
	 */
	public void setGoodsnum(Integer goodsnum) {
		this.goodsnum = goodsnum;
	}
	/**
	 * 获取：goodsNum
	 */
	public Integer getGoodsnum() {
		return goodsnum;
	}
	/**
	 * 设置：imageHeight
	 */
	public void setImageheight(Integer imageheight) {
		this.imageheight = imageheight;
	}
	/**
	 * 获取：imageHeight
	 */
	public Integer getImageheight() {
		return imageheight;
	}
	/**
	 * 设置：imageWidth
	 */
	public void setImagewidth(Integer imagewidth) {
		this.imagewidth = imagewidth;
	}
	/**
	 * 获取：imageWidth
	 */
	public Integer getImagewidth() {
		return imagewidth;
	}
	/**
	 * 设置：remarkInfo
	 */
	public void setRemarkinfo(String remarkinfo) {
		this.remarkinfo = remarkinfo;
	}
	/**
	 * 获取：remarkInfo
	 */
	public String getRemarkinfo() {
		return remarkinfo;
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
	 * 设置：showNum
	 */
	public void setShownum(Integer shownum) {
		this.shownum = shownum;
	}
	/**
	 * 获取：showNum
	 */
	public Integer getShownum() {
		return shownum;
	}
	/**
	 * 设置：styleName
	 */
	public void setStylename(String stylename) {
		this.stylename = stylename;
	}
	/**
	 * 获取：styleName
	 */
	public String getStylename() {
		return stylename;
	}
	/**
	 * 设置：typeName
	 */
	public void setTypename(String typename) {
		this.typename = typename;
	}
	/**
	 * 获取：typeName
	 */
	public String getTypename() {
		return typename;
	}
}
