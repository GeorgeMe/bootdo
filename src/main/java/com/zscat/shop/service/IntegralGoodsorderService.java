package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.IntegralGoodsorderDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface IntegralGoodsorderService {
	
	IntegralGoodsorderDO get(Long id);
	
	List<IntegralGoodsorderDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(IntegralGoodsorderDO integralGoodsorder);
	
	int update(IntegralGoodsorderDO integralGoodsorder);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	IntegralGoodsorderDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
