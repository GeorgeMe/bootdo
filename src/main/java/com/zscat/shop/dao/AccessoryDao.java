package com.zscat.shop.dao;

import com.zscat.shop.domain.AccessoryDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
@Mapper
public interface AccessoryDao {

	AccessoryDO get(Long id);
	
	List<AccessoryDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AccessoryDO accessory);
	
	int update(AccessoryDO accessory);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
