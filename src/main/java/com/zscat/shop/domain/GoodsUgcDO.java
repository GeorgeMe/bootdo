package com.zscat.shop.domain;

import java.io.Serializable;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public class GoodsUgcDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//goods_id
	private Long goodsId;
	//class_id
	private Long classId;

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
	 * 设置：class_id
	 */
	public void setClassId(Long classId) {
		this.classId = classId;
	}
	/**
	 * 获取：class_id
	 */
	public Long getClassId() {
		return classId;
	}
}
