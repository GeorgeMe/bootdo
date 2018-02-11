package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public class GoodsReturnlogDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//gr_id
	private Long grId;
	//of_id
	private Long ofId;
	//return_user_id
	private Long returnUserId;

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
	 * 设置：gr_id
	 */
	public void setGrId(Long grId) {
		this.grId = grId;
	}
	/**
	 * 获取：gr_id
	 */
	public Long getGrId() {
		return grId;
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
	 * 设置：return_user_id
	 */
	public void setReturnUserId(Long returnUserId) {
		this.returnUserId = returnUserId;
	}
	/**
	 * 获取：return_user_id
	 */
	public Long getReturnUserId() {
		return returnUserId;
	}
}
