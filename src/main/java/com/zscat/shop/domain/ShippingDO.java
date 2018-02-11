package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;



/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public class ShippingDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//sequence
	private Integer sequence;
	//shipping_add_fee
	private BigDecimal shippingAddFee;
	//shipping_add_weight
	private Integer shippingAddWeight;
	//shipping_fee
	private BigDecimal shippingFee;
	//shipping_info
	private String shippingInfo;
	//shipping_name
	private String shippingName;
	//shipping_weight
	private Integer shippingWeight;
	//status
	private Integer status;
	//store_id
	private Long storeId;

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
	 * 设置：sequence
	 */
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
	/**
	 * 获取：sequence
	 */
	public Integer getSequence() {
		return sequence;
	}
	/**
	 * 设置：shipping_add_fee
	 */
	public void setShippingAddFee(BigDecimal shippingAddFee) {
		this.shippingAddFee = shippingAddFee;
	}
	/**
	 * 获取：shipping_add_fee
	 */
	public BigDecimal getShippingAddFee() {
		return shippingAddFee;
	}
	/**
	 * 设置：shipping_add_weight
	 */
	public void setShippingAddWeight(Integer shippingAddWeight) {
		this.shippingAddWeight = shippingAddWeight;
	}
	/**
	 * 获取：shipping_add_weight
	 */
	public Integer getShippingAddWeight() {
		return shippingAddWeight;
	}
	/**
	 * 设置：shipping_fee
	 */
	public void setShippingFee(BigDecimal shippingFee) {
		this.shippingFee = shippingFee;
	}
	/**
	 * 获取：shipping_fee
	 */
	public BigDecimal getShippingFee() {
		return shippingFee;
	}
	/**
	 * 设置：shipping_info
	 */
	public void setShippingInfo(String shippingInfo) {
		this.shippingInfo = shippingInfo;
	}
	/**
	 * 获取：shipping_info
	 */
	public String getShippingInfo() {
		return shippingInfo;
	}
	/**
	 * 设置：shipping_name
	 */
	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}
	/**
	 * 获取：shipping_name
	 */
	public String getShippingName() {
		return shippingName;
	}
	/**
	 * 设置：shipping_weight
	 */
	public void setShippingWeight(Integer shippingWeight) {
		this.shippingWeight = shippingWeight;
	}
	/**
	 * 获取：shipping_weight
	 */
	public Integer getShippingWeight() {
		return shippingWeight;
	}
	/**
	 * 设置：status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：store_id
	 */
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	/**
	 * 获取：store_id
	 */
	public Long getStoreId() {
		return storeId;
	}
}
