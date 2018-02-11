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
public class GroupDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//beginTime
	private Date begintime;
	//endTime
	private Date endtime;
	//group_name
	private String groupName;
	//joinEndTime
	private Date joinendtime;
	//status
	private Integer status;

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
	 * 设置：beginTime
	 */
	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}
	/**
	 * 获取：beginTime
	 */
	public Date getBegintime() {
		return begintime;
	}
	/**
	 * 设置：endTime
	 */
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	/**
	 * 获取：endTime
	 */
	public Date getEndtime() {
		return endtime;
	}
	/**
	 * 设置：group_name
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	/**
	 * 获取：group_name
	 */
	public String getGroupName() {
		return groupName;
	}
	/**
	 * 设置：joinEndTime
	 */
	public void setJoinendtime(Date joinendtime) {
		this.joinendtime = joinendtime;
	}
	/**
	 * 获取：joinEndTime
	 */
	public Date getJoinendtime() {
		return joinendtime;
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
}
