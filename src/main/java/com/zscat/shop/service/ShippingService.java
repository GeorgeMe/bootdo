package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.ShippingDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public interface ShippingService {
	
	ShippingDO get(Long id);
	
	List<ShippingDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ShippingDO shipping);
	
	int update(ShippingDO shipping);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	ShippingDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
