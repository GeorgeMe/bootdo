package com.zscat.shop.domain;

import java.io.Serializable;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public class GoodsPhotoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//goods_id
	private Long goodsId;
	//photo_id
	private Long photoId;

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
	 * 设置：photo_id
	 */
	public void setPhotoId(Long photoId) {
		this.photoId = photoId;
	}
	/**
	 * 获取：photo_id
	 */
	public Long getPhotoId() {
		return photoId;
	}
}
