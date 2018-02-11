package com.zscat.shop.dao;

import com.zscat.shop.domain.NavigationDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
@Mapper
public interface NavigationDao {

	NavigationDO get(Long id);
	
	List<NavigationDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(NavigationDO navigation);
	
	int update(NavigationDO navigation);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
