package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.StorePointDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public interface StorePointService {
	
	StorePointDO get(Long id);
	
	List<StorePointDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StorePointDO storePoint);
	
	int update(StorePointDO storePoint);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	StorePointDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
