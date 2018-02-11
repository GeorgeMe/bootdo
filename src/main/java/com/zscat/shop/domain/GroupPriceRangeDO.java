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
public class GroupPriceRangeDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//gpr_begin
	private Integer gprBegin;
	//gpr_end
	private Integer gprEnd;
	//gpr_name
	private String gprName;

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
	 * 设置：gpr_begin
	 */
	public void setGprBegin(Integer gprBegin) {
		this.gprBegin = gprBegin;
	}
	/**
	 * 获取：gpr_begin
	 */
	public Integer getGprBegin() {
		return gprBegin;
	}
	/**
	 * 设置：gpr_end
	 */
	public void setGprEnd(Integer gprEnd) {
		this.gprEnd = gprEnd;
	}
	/**
	 * 获取：gpr_end
	 */
	public Integer getGprEnd() {
		return gprEnd;
	}
	/**
	 * 设置：gpr_name
	 */
	public void setGprName(String gprName) {
		this.gprName = gprName;
	}
	/**
	 * 获取：gpr_name
	 */
	public String getGprName() {
		return gprName;
	}
}
