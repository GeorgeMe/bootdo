package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.PaymentDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public interface PaymentService {
	
	PaymentDO get(Long id);
	
	List<PaymentDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PaymentDO payment);
	
	int update(PaymentDO payment);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	PaymentDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
