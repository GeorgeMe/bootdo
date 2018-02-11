package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.DeliveryGoodsDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
public interface DeliveryGoodsService {
	
	DeliveryGoodsDO get(Long id);
	
	List<DeliveryGoodsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(DeliveryGoodsDO deliveryGoods);
	
	int update(DeliveryGoodsDO deliveryGoods);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	DeliveryGoodsDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
