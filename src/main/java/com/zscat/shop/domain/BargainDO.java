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
public class BargainDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//bargain_time
	private Date bargainTime;
	//maximum
	private Integer maximum;
	//rebate
	private BigDecimal rebate;
	//state
	private String state;

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
	 * 设置：bargain_time
	 */
	public void setBargainTime(Date bargainTime) {
		this.bargainTime = bargainTime;
	}
	/**
	 * 获取：bargain_time
	 */
	public Date getBargainTime() {
		return bargainTime;
	}
	/**
	 * 设置：maximum
	 */
	public void setMaximum(Integer maximum) {
		this.maximum = maximum;
	}
	/**
	 * 获取：maximum
	 */
	public Integer getMaximum() {
		return maximum;
	}
	/**
	 * 设置：rebate
	 */
	public void setRebate(BigDecimal rebate) {
		this.rebate = rebate;
	}
	/**
	 * 获取：rebate
	 */
	public BigDecimal getRebate() {
		return rebate;
	}
	/**
	 * 设置：state
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * 获取：state
	 */
	public String getState() {
		return state;
	}
}
