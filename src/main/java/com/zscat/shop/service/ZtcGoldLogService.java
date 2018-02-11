package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.ZtcGoldLogDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
public interface ZtcGoldLogService {
	
	ZtcGoldLogDO get(Long id);
	
	List<ZtcGoldLogDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ZtcGoldLogDO ztcGoldLog);
	
	int update(ZtcGoldLogDO ztcGoldLog);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	ZtcGoldLogDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
