package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.ActivityDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public interface ActivityService {
	
	ActivityDO get(Long id);
	
	List<ActivityDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ActivityDO activity);
	
	int update(ActivityDO activity);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	ActivityDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
