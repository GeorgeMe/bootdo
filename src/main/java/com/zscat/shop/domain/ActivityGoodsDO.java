package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;



/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public class ActivityGoodsDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//ag_status
	private Integer agStatus;
	//act_id
	private Long actId;
	//ag_admin_id
	private Long agAdminId;
	//ag_goods_id
	private Long agGoodsId;
	//ag_price
	private BigDecimal agPrice;

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
	 * 设置：ag_status
	 */
	public void setAgStatus(Integer agStatus) {
		this.agStatus = agStatus;
	}
	/**
	 * 获取：ag_status
	 */
	public Integer getAgStatus() {
		return agStatus;
	}
	/**
	 * 设置：act_id
	 */
	public void setActId(Long actId) {
		this.actId = actId;
	}
	/**
	 * 获取：act_id
	 */
	public Long getActId() {
		return actId;
	}
	/**
	 * 设置：ag_admin_id
	 */
	public void setAgAdminId(Long agAdminId) {
		this.agAdminId = agAdminId;
	}
	/**
	 * 获取：ag_admin_id
	 */
	public Long getAgAdminId() {
		return agAdminId;
	}
	/**
	 * 设置：ag_goods_id
	 */
	public void setAgGoodsId(Long agGoodsId) {
		this.agGoodsId = agGoodsId;
	}
	/**
	 * 获取：ag_goods_id
	 */
	public Long getAgGoodsId() {
		return agGoodsId;
	}
	/**
	 * 设置：ag_price
	 */
	public void setAgPrice(BigDecimal agPrice) {
		this.agPrice = agPrice;
	}
	/**
	 * 获取：ag_price
	 */
	public BigDecimal getAgPrice() {
		return agPrice;
	}
}
