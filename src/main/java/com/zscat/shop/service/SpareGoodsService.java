package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.SpareGoodsDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public interface SpareGoodsService {
	
	SpareGoodsDO get(Long id);
	
	List<SpareGoodsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(SpareGoodsDO spareGoods);
	
	int update(SpareGoodsDO spareGoods);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	SpareGoodsDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
