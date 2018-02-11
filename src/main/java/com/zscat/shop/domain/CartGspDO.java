package com.zscat.shop.domain;

import java.io.Serializable;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public class CartGspDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//cart_id
	private Long cartId;
	//gsp_id
	private Long gspId;

	/**
	 * 设置：cart_id
	 */
	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}
	/**
	 * 获取：cart_id
	 */
	public Long getCartId() {
		return cartId;
	}
	/**
	 * 设置：gsp_id
	 */
	public void setGspId(Long gspId) {
		this.gspId = gspId;
	}
	/**
	 * 获取：gsp_id
	 */
	public Long getGspId() {
		return gspId;
	}
}
