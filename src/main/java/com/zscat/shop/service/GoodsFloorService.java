package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.GoodsFloorDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface GoodsFloorService {
	
	GoodsFloorDO get(Long id);
	
	List<GoodsFloorDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsFloorDO goodsFloor);
	
	int update(GoodsFloorDO goodsFloor);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	GoodsFloorDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
