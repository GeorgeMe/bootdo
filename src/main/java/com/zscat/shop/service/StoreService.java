package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.StoreDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public interface StoreService {
	
	StoreDO get(Long id);
	
	List<StoreDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StoreDO store);
	
	int update(StoreDO store);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	StoreDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
