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
public class GoodsReturnitemDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//count
	private Integer count;
	//spec_info
	private String specInfo;
	//goods_id
	private Long goodsId;
	//gr_id
	private Long grId;

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
	 * 设置：count
	 */
	public void setCount(Integer count) {
		this.count = count;
	}
	/**
	 * 获取：count
	 */
	public Integer getCount() {
		return count;
	}
	/**
	 * 设置：spec_info
	 */
	public void setSpecInfo(String specInfo) {
		this.specInfo = specInfo;
	}
	/**
	 * 获取：spec_info
	 */
	public String getSpecInfo() {
		return specInfo;
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
	 * 设置：gr_id
	 */
	public void setGrId(Long grId) {
		this.grId = grId;
	}
	/**
	 * 获取：gr_id
	 */
	public Long getGrId() {
		return grId;
	}
}
