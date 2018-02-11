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
public class StoreStatDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//all_goods
	private Integer allGoods;
	//all_store
	private Integer allStore;
	//all_user
	private Integer allUser;
	//next_time
	private Date nextTime;
	//order_amount
	private BigDecimal orderAmount;
	//store_update
	private Integer storeUpdate;
	//week_complaint
	private Integer weekComplaint;
	//week_goods
	private Integer weekGoods;
	//week_order
	private Integer weekOrder;
	//week_report
	private Integer weekReport;
	//week_store
	private Integer weekStore;
	//week_user
	private Integer weekUser;

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
	 * 设置：all_goods
	 */
	public void setAllGoods(Integer allGoods) {
		this.allGoods = allGoods;
	}
	/**
	 * 获取：all_goods
	 */
	public Integer getAllGoods() {
		return allGoods;
	}
	/**
	 * 设置：all_store
	 */
	public void setAllStore(Integer allStore) {
		this.allStore = allStore;
	}
	/**
	 * 获取：all_store
	 */
	public Integer getAllStore() {
		return allStore;
	}
	/**
	 * 设置：all_user
	 */
	public void setAllUser(Integer allUser) {
		this.allUser = allUser;
	}
	/**
	 * 获取：all_user
	 */
	public Integer getAllUser() {
		return allUser;
	}
	/**
	 * 设置：next_time
	 */
	public void setNextTime(Date nextTime) {
		this.nextTime = nextTime;
	}
	/**
	 * 获取：next_time
	 */
	public Date getNextTime() {
		return nextTime;
	}
	/**
	 * 设置：order_amount
	 */
	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}
	/**
	 * 获取：order_amount
	 */
	public BigDecimal getOrderAmount() {
		return orderAmount;
	}
	/**
	 * 设置：store_update
	 */
	public void setStoreUpdate(Integer storeUpdate) {
		this.storeUpdate = storeUpdate;
	}
	/**
	 * 获取：store_update
	 */
	public Integer getStoreUpdate() {
		return storeUpdate;
	}
	/**
	 * 设置：week_complaint
	 */
	public void setWeekComplaint(Integer weekComplaint) {
		this.weekComplaint = weekComplaint;
	}
	/**
	 * 获取：week_complaint
	 */
	public Integer getWeekComplaint() {
		return weekComplaint;
	}
	/**
	 * 设置：week_goods
	 */
	public void setWeekGoods(Integer weekGoods) {
		this.weekGoods = weekGoods;
	}
	/**
	 * 获取：week_goods
	 */
	public Integer getWeekGoods() {
		return weekGoods;
	}
	/**
	 * 设置：week_order
	 */
	public void setWeekOrder(Integer weekOrder) {
		this.weekOrder = weekOrder;
	}
	/**
	 * 获取：week_order
	 */
	public Integer getWeekOrder() {
		return weekOrder;
	}
	/**
	 * 设置：week_report
	 */
	public void setWeekReport(Integer weekReport) {
		this.weekReport = weekReport;
	}
	/**
	 * 获取：week_report
	 */
	public Integer getWeekReport() {
		return weekReport;
	}
	/**
	 * 设置：week_store
	 */
	public void setWeekStore(Integer weekStore) {
		this.weekStore = weekStore;
	}
	/**
	 * 获取：week_store
	 */
	public Integer getWeekStore() {
		return weekStore;
	}
	/**
	 * 设置：week_user
	 */
	public void setWeekUser(Integer weekUser) {
		this.weekUser = weekUser;
	}
	/**
	 * 获取：week_user
	 */
	public Integer getWeekUser() {
		return weekUser;
	}
}
