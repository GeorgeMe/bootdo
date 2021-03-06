package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.IntegralGoodscartDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface IntegralGoodscartService {
	
	IntegralGoodscartDO get(Long id);
	
	List<IntegralGoodscartDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(IntegralGoodscartDO integralGoodscart);
	
	int update(IntegralGoodscartDO integralGoodscart);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	IntegralGoodscartDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
