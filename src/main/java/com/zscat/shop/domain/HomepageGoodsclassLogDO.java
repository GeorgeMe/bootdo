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
public class HomepageGoodsclassLogDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//goodsClass_id
	private Long goodsclassId;
	//homepageGoodsClass_id
	private Long homepagegoodsclassId;

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
	 * 设置：goodsClass_id
	 */
	public void setGoodsclassId(Long goodsclassId) {
		this.goodsclassId = goodsclassId;
	}
	/**
	 * 获取：goodsClass_id
	 */
	public Long getGoodsclassId() {
		return goodsclassId;
	}
	/**
	 * 设置：homepageGoodsClass_id
	 */
	public void setHomepagegoodsclassId(Long homepagegoodsclassId) {
		this.homepagegoodsclassId = homepagegoodsclassId;
	}
	/**
	 * 获取：homepageGoodsClass_id
	 */
	public Long getHomepagegoodsclassId() {
		return homepagegoodsclassId;
	}
}
