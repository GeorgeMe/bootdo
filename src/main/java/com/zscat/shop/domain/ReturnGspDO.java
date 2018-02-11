package com.zscat.shop.domain;

import java.io.Serializable;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public class ReturnGspDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//item_id
	private Long itemId;
	//gsp_id
	private Long gspId;

	/**
	 * 设置：item_id
	 */
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	/**
	 * 获取：item_id
	 */
	public Long getItemId() {
		return itemId;
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
