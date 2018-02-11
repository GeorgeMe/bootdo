package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.RefundLogDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public interface RefundLogService {
	
	RefundLogDO get(Long id);
	
	List<RefundLogDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(RefundLogDO refundLog);
	
	int update(RefundLogDO refundLog);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	RefundLogDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
