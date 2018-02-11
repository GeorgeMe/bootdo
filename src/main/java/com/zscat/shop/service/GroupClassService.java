package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.GroupClassDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface GroupClassService {
	
	GroupClassDO get(Long id);
	
	List<GroupClassDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GroupClassDO groupClass);
	
	int update(GroupClassDO groupClass);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	GroupClassDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
