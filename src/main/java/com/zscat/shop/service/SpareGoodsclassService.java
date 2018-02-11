package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.SpareGoodsclassDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public interface SpareGoodsclassService {
	
	SpareGoodsclassDO get(Long id);
	
	List<SpareGoodsclassDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(SpareGoodsclassDO spareGoodsclass);
	
	int update(SpareGoodsclassDO spareGoodsclass);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	SpareGoodsclassDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
