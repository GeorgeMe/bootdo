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
public class IntegrallogDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//content
	private String content;
	//integral
	private Integer integral;
	//type
	private String type;
	//integral_user_id
	private Long integralUserId;
	//operate_user_id
	private Long operateUserId;

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
	 * 设置：content
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：content
	 */
	public String getContent() {
		return content;
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
	 * 设置：type
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：type
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：integral_user_id
	 */
	public void setIntegralUserId(Long integralUserId) {
		this.integralUserId = integralUserId;
	}
	/**
	 * 获取：integral_user_id
	 */
	public Long getIntegralUserId() {
		return integralUserId;
	}
	/**
	 * 设置：operate_user_id
	 */
	public void setOperateUserId(Long operateUserId) {
		this.operateUserId = operateUserId;
	}
	/**
	 * 获取：operate_user_id
	 */
	public Long getOperateUserId() {
		return operateUserId;
	}
}
