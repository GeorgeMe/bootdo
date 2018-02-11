package com.zscat.shop.dao;

import com.zscat.shop.domain.StoreNavDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
@Mapper
public interface StoreNavDao {

	StoreNavDO get(Long id);
	
	List<StoreNavDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StoreNavDO storeNav);
	
	int update(StoreNavDO storeNav);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
