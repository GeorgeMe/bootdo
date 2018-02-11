package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.IntegralGoodsDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface IntegralGoodsService {
	
	IntegralGoodsDO get(Long id);
	
	List<IntegralGoodsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(IntegralGoodsDO integralGoods);
	
	int update(IntegralGoodsDO integralGoods);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	IntegralGoodsDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
