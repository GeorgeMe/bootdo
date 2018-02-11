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
public class IntegralGoodscartDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//count
	private Integer count;
	//integral
	private Integer integral;
	//trans_fee
	private BigDecimal transFee;
	//goods_id
	private Long goodsId;
	//order_id
	private Long orderId;

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
	 * 设置：integral
	 */
	public void setIntegral(Integer integral) {
		this.integral = integral;
	}
	/**
	 * 获取：integral
	 */
	public Integer getIntegral() {
		return integral;
	}
	/**
	 * 设置：trans_fee
	 */
	public void setTransFee(BigDecimal transFee) {
		this.transFee = transFee;
	}
	/**
	 * 获取：trans_fee
	 */
	public BigDecimal getTransFee() {
		return transFee;
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
	 * 设置：order_id
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	/**
	 * 获取：order_id
	 */
	public Long getOrderId() {
		return orderId;
	}
}
