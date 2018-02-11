package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.OrderformDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface OrderformService {
	
	OrderformDO get(Long id);
	
	List<OrderformDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(OrderformDO orderform);
	
	int update(OrderformDO orderform);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	OrderformDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
