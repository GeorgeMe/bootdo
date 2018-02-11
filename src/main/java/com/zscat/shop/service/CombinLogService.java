package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.CombinLogDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public interface CombinLogService {
	
	CombinLogDO get(Long id);
	
	List<CombinLogDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CombinLogDO combinLog);
	
	int update(CombinLogDO combinLog);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	CombinLogDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
