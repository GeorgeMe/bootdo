package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public class StoregradeLogDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//log_edit
	private Boolean logEdit;
	//store_grade_info
	private String storeGradeInfo;
	//store_grade_status
	private Integer storeGradeStatus;
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
	 * 设置：log_edit
	 */
	public void setLogEdit(Boolean logEdit) {
		this.logEdit = logEdit;
	}
	/**
	 * 获取：log_edit
	 */
	public Boolean getLogEdit() {
		return logEdit;
	}
	/**
	 * 设置：store_grade_info
	 */
	public void setStoreGradeInfo(String storeGradeInfo) {
		this.storeGradeInfo = storeGradeInfo;
	}
	/**
	 * 获取：store_grade_info
	 */
	public String getStoreGradeInfo() {
		return storeGradeInfo;
	}
	/**
	 * 设置：store_grade_status
	 */
	public void setStoreGradeStatus(Integer storeGradeStatus) {
		this.storeGradeStatus = storeGradeStatus;
	}
	/**
	 * 获取：store_grade_status
	 */
	public Integer getStoreGradeStatus() {
		return storeGradeStatus;
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
