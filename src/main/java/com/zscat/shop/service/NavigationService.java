package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.NavigationDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface NavigationService {
	
	NavigationDO get(Long id);
	
	List<NavigationDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(NavigationDO navigation);
	
	int update(NavigationDO navigation);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	NavigationDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
