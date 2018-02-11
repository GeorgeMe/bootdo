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
public class StoreclassDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//className
	private String classname;
	//level
	private Integer level;
	//sequence
	private Integer sequence;
	//parent_id
	private Long parentId;
	//description_evaluate
	private BigDecimal descriptionEvaluate;
	//service_evaluate
	private BigDecimal serviceEvaluate;
	//ship_evaluate
	private BigDecimal shipEvaluate;

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
	 * 设置：className
	 */
	public void setClassname(String classname) {
		this.classname = classname;
	}
	/**
	 * 获取：className
	 */
	public String getClassname() {
		return classname;
	}
	/**
	 * 设置：level
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}
	/**
	 * 获取：level
	 */
	public Integer getLevel() {
		return level;
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
	 * 设置：parent_id
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：parent_id
	 */
	public Long getParentId() {
		return parentId;
	}
	/**
	 * 设置：description_evaluate
	 */
	public void setDescriptionEvaluate(BigDecimal descriptionEvaluate) {
		this.descriptionEvaluate = descriptionEvaluate;
	}
	/**
	 * 获取：description_evaluate
	 */
	public BigDecimal getDescriptionEvaluate() {
		return descriptionEvaluate;
	}
	/**
	 * 设置：service_evaluate
	 */
	public void setServiceEvaluate(BigDecimal serviceEvaluate) {
		this.serviceEvaluate = serviceEvaluate;
	}
	/**
	 * 获取：service_evaluate
	 */
	public BigDecimal getServiceEvaluate() {
		return serviceEvaluate;
	}
	/**
	 * 设置：ship_evaluate
	 */
	public void setShipEvaluate(BigDecimal shipEvaluate) {
		this.shipEvaluate = shipEvaluate;
	}
	/**
	 * 获取：ship_evaluate
	 */
	public BigDecimal getShipEvaluate() {
		return shipEvaluate;
	}
}
