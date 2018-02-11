package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.StoreNavDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public interface StoreNavService {
	
	StoreNavDO get(Long id);
	
	List<StoreNavDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StoreNavDO storeNav);
	
	int update(StoreNavDO storeNav);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	StoreNavDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
