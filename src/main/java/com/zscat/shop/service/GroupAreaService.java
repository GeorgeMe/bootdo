package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.GroupAreaDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface GroupAreaService {
	
	GroupAreaDO get(Long id);
	
	List<GroupAreaDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GroupAreaDO groupArea);
	
	int update(GroupAreaDO groupArea);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	GroupAreaDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
