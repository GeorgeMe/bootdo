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
public class StorecartDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//cart_session_id
	private String cartSessionId;
	//total_price
	private BigDecimal totalPrice;
	//store_id
	private Long storeId;
	//user_id
	private Long userId;
	//sc_status
	private Integer scStatus;

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
	 * 设置：cart_session_id
	 */
	public void setCartSessionId(String cartSessionId) {
		this.cartSessionId = cartSessionId;
	}
	/**
	 * 获取：cart_session_id
	 */
	public String getCartSessionId() {
		return cartSessionId;
	}
	/**
	 * 设置：total_price
	 */
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	/**
	 * 获取：total_price
	 */
	public BigDecimal getTotalPrice() {
		return totalPrice;
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
	/**
	 * 设置：user_id
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：user_id
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：sc_status
	 */
	public void setScStatus(Integer scStatus) {
		this.scStatus = scStatus;
	}
	/**
	 * 获取：sc_status
	 */
	public Integer getScStatus() {
		return scStatus;
	}
}
