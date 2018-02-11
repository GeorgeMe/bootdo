package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.PredepositLogDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public interface PredepositLogService {
	
	PredepositLogDO get(Long id);
	
	List<PredepositLogDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PredepositLogDO predepositLog);
	
	int update(PredepositLogDO predepositLog);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	PredepositLogDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
