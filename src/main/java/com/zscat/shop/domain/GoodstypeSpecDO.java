package com.zscat.shop.domain;

import java.io.Serializable;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public class GoodstypeSpecDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//type_id
	private Long typeId;
	//spec_id
	private Long specId;

	/**
	 * 设置：type_id
	 */
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	/**
	 * 获取：type_id
	 */
	public Long getTypeId() {
		return typeId;
	}
	/**
	 * 设置：spec_id
	 */
	public void setSpecId(Long specId) {
		this.specId = specId;
	}
	/**
	 * 获取：spec_id
	 */
	public Long getSpecId() {
		return specId;
	}
}
