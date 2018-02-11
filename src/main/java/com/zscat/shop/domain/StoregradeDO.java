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
public class StoregradeDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//add_funciton
	private String addFunciton;
	//audit
	private Boolean audit;
	//content
	private String content;
	//goodsCount
	private Integer goodscount;
	//gradeLevel
	private Integer gradelevel;
	//gradeName
	private String gradename;
	//price
	private String price;
	//sequence
	private Integer sequence;
	//spaceSize
	private Float spacesize;
	//sysGrade
	private Boolean sysgrade;
	//templates
	private String templates;
	//acount_num
	private Integer acountNum;

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
	 * 设置：add_funciton
	 */
	public void setAddFunciton(String addFunciton) {
		this.addFunciton = addFunciton;
	}
	/**
	 * 获取：add_funciton
	 */
	public String getAddFunciton() {
		return addFunciton;
	}
	/**
	 * 设置：audit
	 */
	public void setAudit(Boolean audit) {
		this.audit = audit;
	}
	/**
	 * 获取：audit
	 */
	public Boolean getAudit() {
		return audit;
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
	 * 设置：goodsCount
	 */
	public void setGoodscount(Integer goodscount) {
		this.goodscount = goodscount;
	}
	/**
	 * 获取：goodsCount
	 */
	public Integer getGoodscount() {
		return goodscount;
	}
	/**
	 * 设置：gradeLevel
	 */
	public void setGradelevel(Integer gradelevel) {
		this.gradelevel = gradelevel;
	}
	/**
	 * 获取：gradeLevel
	 */
	public Integer getGradelevel() {
		return gradelevel;
	}
	/**
	 * 设置：gradeName
	 */
	public void setGradename(String gradename) {
		this.gradename = gradename;
	}
	/**
	 * 获取：gradeName
	 */
	public String getGradename() {
		return gradename;
	}
	/**
	 * 设置：price
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * 获取：price
	 */
	public String getPrice() {
		return price;
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
	 * 设置：spaceSize
	 */
	public void setSpacesize(Float spacesize) {
		this.spacesize = spacesize;
	}
	/**
	 * 获取：spaceSize
	 */
	public Float getSpacesize() {
		return spacesize;
	}
	/**
	 * 设置：sysGrade
	 */
	public void setSysgrade(Boolean sysgrade) {
		this.sysgrade = sysgrade;
	}
	/**
	 * 获取：sysGrade
	 */
	public Boolean getSysgrade() {
		return sysgrade;
	}
	/**
	 * 设置：templates
	 */
	public void setTemplates(String templates) {
		this.templates = templates;
	}
	/**
	 * 获取：templates
	 */
	public String getTemplates() {
		return templates;
	}
	/**
	 * 设置：acount_num
	 */
	public void setAcountNum(Integer acountNum) {
		this.acountNum = acountNum;
	}
	/**
	 * 获取：acount_num
	 */
	public Integer getAcountNum() {
		return acountNum;
	}
}
