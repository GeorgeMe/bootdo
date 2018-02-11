package com.zscat.shop.domain;

import java.io.Serializable;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public class GoodstypeBrandDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//type_id
	private Long typeId;
	//brand_id
	private Long brandId;

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
	 * 设置：brand_id
	 */
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	/**
	 * 获取：brand_id
	 */
	public Long getBrandId() {
		return brandId;
	}
}
