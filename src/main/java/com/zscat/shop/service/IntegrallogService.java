package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.IntegrallogDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface IntegrallogService {
	
	IntegrallogDO get(Long id);
	
	List<IntegrallogDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(IntegrallogDO integrallog);
	
	int update(IntegrallogDO integrallog);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	IntegrallogDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
