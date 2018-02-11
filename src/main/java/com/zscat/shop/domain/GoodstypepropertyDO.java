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
public class GoodstypepropertyDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//display
	private Boolean display;
	//name
	private String name;
	//sequence
	private Integer sequence;
	//value
	private String value;
	//goodsType_id
	private Long goodstypeId;

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
	 * 设置：display
	 */
	public void setDisplay(Boolean display) {
		this.display = display;
	}
	/**
	 * 获取：display
	 */
	public Boolean getDisplay() {
		return display;
	}
	/**
	 * 设置：name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：name
	 */
	public String getName() {
		return name;
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
	 * 设置：value
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * 获取：value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * 设置：goodsType_id
	 */
	public void setGoodstypeId(Long goodstypeId) {
		this.goodstypeId = goodstypeId;
	}
	/**
	 * 获取：goodsType_id
	 */
	public Long getGoodstypeId() {
		return goodstypeId;
	}
}
