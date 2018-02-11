package com.zscat.shop.domain;

import java.io.Serializable;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public class GoodsCombinDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//wemall_goods_id
	private Long wemallGoodsId;
	//combin_goods_id
	private Long combinGoodsId;

	/**
	 * 设置：wemall_goods_id
	 */
	public void setWemallGoodsId(Long wemallGoodsId) {
		this.wemallGoodsId = wemallGoodsId;
	}
	/**
	 * 获取：wemall_goods_id
	 */
	public Long getWemallGoodsId() {
		return wemallGoodsId;
	}
	/**
	 * 设置：combin_goods_id
	 */
	public void setCombinGoodsId(Long combinGoodsId) {
		this.combinGoodsId = combinGoodsId;
	}
	/**
	 * 获取：combin_goods_id
	 */
	public Long getCombinGoodsId() {
		return combinGoodsId;
	}
}
