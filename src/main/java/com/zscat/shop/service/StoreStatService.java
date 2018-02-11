package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.StoreStatDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public interface StoreStatService {
	
	StoreStatDO get(Long id);
	
	List<StoreStatDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StoreStatDO storeStat);
	
	int update(StoreStatDO storeStat);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	StoreStatDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
