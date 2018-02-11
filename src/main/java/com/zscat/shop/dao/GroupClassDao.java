package com.zscat.shop.dao;

import com.zscat.shop.domain.GroupClassDO;

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
public interface GroupClassDao {

	GroupClassDO get(Long id);
	
	List<GroupClassDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GroupClassDO groupClass);
	
	int update(GroupClassDO groupClass);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
