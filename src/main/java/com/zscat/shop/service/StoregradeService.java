package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.StoregradeDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public interface StoregradeService {
	
	StoregradeDO get(Long id);
	
	List<StoregradeDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StoregradeDO storegrade);
	
	int update(StoregradeDO storegrade);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	StoregradeDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
