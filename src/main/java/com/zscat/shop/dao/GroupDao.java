package com.zscat.shop.dao;

import com.zscat.shop.domain.GroupDO;

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
public interface GroupDao {

	GroupDO get(Long id);
	
	List<GroupDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GroupDO group);
	
	int update(GroupDO group);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
