package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
public class VmenuDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//menu_key
	private String menuKey;
	//menu_name
	private String menuName;
	//menu_type
	private String menuType;
	//menu_url
	private String menuUrl;
	//parent_id
	private Long parentId;
	//store_id
	private Long storeId;
	//menu_sequence
	private Integer menuSequence;
	//menu_key_content
	private String menuKeyContent;
	//menu_cat
	private String menuCat;

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
	 * 设置：menu_key
	 */
	public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}
	/**
	 * 获取：menu_key
	 */
	public String getMenuKey() {
		return menuKey;
	}
	/**
	 * 设置：menu_name
	 */
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	/**
	 * 获取：menu_name
	 */
	public String getMenuName() {
		return menuName;
	}
	/**
	 * 设置：menu_type
	 */
	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}
	/**
	 * 获取：menu_type
	 */
	public String getMenuType() {
		return menuType;
	}
	/**
	 * 设置：menu_url
	 */
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	/**
	 * 获取：menu_url
	 */
	public String getMenuUrl() {
		return menuUrl;
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
	/**
	 * 设置：menu_sequence
	 */
	public void setMenuSequence(Integer menuSequence) {
		this.menuSequence = menuSequence;
	}
	/**
	 * 获取：menu_sequence
	 */
	public Integer getMenuSequence() {
		return menuSequence;
	}
	/**
	 * 设置：menu_key_content
	 */
	public void setMenuKeyContent(String menuKeyContent) {
		this.menuKeyContent = menuKeyContent;
	}
	/**
	 * 获取：menu_key_content
	 */
	public String getMenuKeyContent() {
		return menuKeyContent;
	}
	/**
	 * 设置：menu_cat
	 */
	public void setMenuCat(String menuCat) {
		this.menuCat = menuCat;
	}
	/**
	 * 获取：menu_cat
	 */
	public String getMenuCat() {
		return menuCat;
	}
}
