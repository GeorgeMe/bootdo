package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.DynamicDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
public interface DynamicService {
	
	DynamicDO get(Long id);
	
	List<DynamicDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(DynamicDO dynamic);
	
	int update(DynamicDO dynamic);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	DynamicDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
