package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.OrderLogDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface OrderLogService {
	
	OrderLogDO get(Long id);
	
	List<OrderLogDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(OrderLogDO orderLog);
	
	int update(OrderLogDO orderLog);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	OrderLogDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
