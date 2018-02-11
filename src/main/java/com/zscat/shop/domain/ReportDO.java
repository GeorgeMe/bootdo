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
public class ReportDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//content
	private String content;
	//handle_Time
	private Date handleTime;
	//handle_info
	private String handleInfo;
	//result
	private Integer result;
	//status
	private Integer status;
	//acc1_id
	private Long acc1Id;
	//acc2_id
	private Long acc2Id;
	//acc3_id
	private Long acc3Id;
	//goods_id
	private Long goodsId;
	//subject_id
	private Long subjectId;
	//user_id
	private Long userId;

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
	 * 设置：handle_Time
	 */
	public void setHandleTime(Date handleTime) {
		this.handleTime = handleTime;
	}
	/**
	 * 获取：handle_Time
	 */
	public Date getHandleTime() {
		return handleTime;
	}
	/**
	 * 设置：handle_info
	 */
	public void setHandleInfo(String handleInfo) {
		this.handleInfo = handleInfo;
	}
	/**
	 * 获取：handle_info
	 */
	public String getHandleInfo() {
		return handleInfo;
	}
	/**
	 * 设置：result
	 */
	public void setResult(Integer result) {
		this.result = result;
	}
	/**
	 * 获取：result
	 */
	public Integer getResult() {
		return result;
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
	 * 设置：acc1_id
	 */
	public void setAcc1Id(Long acc1Id) {
		this.acc1Id = acc1Id;
	}
	/**
	 * 获取：acc1_id
	 */
	public Long getAcc1Id() {
		return acc1Id;
	}
	/**
	 * 设置：acc2_id
	 */
	public void setAcc2Id(Long acc2Id) {
		this.acc2Id = acc2Id;
	}
	/**
	 * 获取：acc2_id
	 */
	public Long getAcc2Id() {
		return acc2Id;
	}
	/**
	 * 设置：acc3_id
	 */
	public void setAcc3Id(Long acc3Id) {
		this.acc3Id = acc3Id;
	}
	/**
	 * 获取：acc3_id
	 */
	public Long getAcc3Id() {
		return acc3Id;
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
	 * 设置：subject_id
	 */
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	/**
	 * 获取：subject_id
	 */
	public Long getSubjectId() {
		return subjectId;
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
}
