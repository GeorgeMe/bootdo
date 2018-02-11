package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.TransAreaDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
public interface TransAreaService {
	
	TransAreaDO get(Long id);
	
	List<TransAreaDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TransAreaDO transArea);
	
	int update(TransAreaDO transArea);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	TransAreaDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
