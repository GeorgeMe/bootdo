package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.AreaDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public interface AreaService {
	
	AreaDO get(Long id);
	
	List<AreaDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AreaDO area);
	
	int update(AreaDO area);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	AreaDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
