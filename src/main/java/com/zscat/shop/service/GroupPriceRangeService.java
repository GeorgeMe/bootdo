package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.GroupPriceRangeDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface GroupPriceRangeService {
	
	GroupPriceRangeDO get(Long id);
	
	List<GroupPriceRangeDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GroupPriceRangeDO groupPriceRange);
	
	int update(GroupPriceRangeDO groupPriceRange);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	GroupPriceRangeDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
