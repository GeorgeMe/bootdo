package com.zscat.shop.dao;

import com.zscat.shop.domain.ActivityDO;

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
public interface ActivityDao {

	ActivityDO get(Long id);
	
	List<ActivityDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ActivityDO activity);
	
	int update(ActivityDO activity);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
