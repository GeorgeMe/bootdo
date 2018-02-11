package com.zscat.shop.dao;

import com.zscat.shop.domain.GroupPriceRangeDO;

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
public interface GroupPriceRangeDao {

	GroupPriceRangeDO get(Long id);
	
	List<GroupPriceRangeDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GroupPriceRangeDO groupPriceRange);
	
	int update(GroupPriceRangeDO groupPriceRange);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
