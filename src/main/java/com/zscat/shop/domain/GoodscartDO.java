package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;



/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public class GoodscartDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//count
	private Integer count;
	//price
	private BigDecimal price;
	//spec_info
	private String specInfo;
	//goods_id
	private Long goodsId;
	//of_id
	private Long ofId;
	//cart_type
	private String cartType;
	//sc_id
	private Long scId;

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
	 * 设置：price
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**
	 * 获取：price
	 */
	public BigDecimal getPrice() {
		return price;
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
	 * 设置：of_id
	 */
	public void setOfId(Long ofId) {
		this.ofId = ofId;
	}
	/**
	 * 获取：of_id
	 */
	public Long getOfId() {
		return ofId;
	}
	/**
	 * 设置：cart_type
	 */
	public void setCartType(String cartType) {
		this.cartType = cartType;
	}
	/**
	 * 获取：cart_type
	 */
	public String getCartType() {
		return cartType;
	}
	/**
	 * 设置：sc_id
	 */
	public void setScId(Long scId) {
		this.scId = scId;
	}
	/**
	 * 获取：sc_id
	 */
	public Long getScId() {
		return scId;
	}
}
