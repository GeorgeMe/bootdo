package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.DeliveryLogDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
public interface DeliveryLogService {
	
	DeliveryLogDO get(Long id);
	
	List<DeliveryLogDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(DeliveryLogDO deliveryLog);
	
	int update(DeliveryLogDO deliveryLog);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	DeliveryLogDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
