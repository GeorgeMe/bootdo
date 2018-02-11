package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.SpareGoodsfloorDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public interface SpareGoodsfloorService {
	
	SpareGoodsfloorDO get(Long id);
	
	List<SpareGoodsfloorDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(SpareGoodsfloorDO spareGoodsfloor);
	
	int update(SpareGoodsfloorDO spareGoodsfloor);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	SpareGoodsfloorDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
