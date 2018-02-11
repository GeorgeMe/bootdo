package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.GoodsSpecDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface GoodsSpecService {
	
	GoodsSpecDO get(Long goodsId);
	
	List<GoodsSpecDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsSpecDO goodsSpec);
	
	int update(GoodsSpecDO goodsSpec);
	
	int remove(Long goodsId);
	
	int batchRemove(Long[] goodsIds);

	GoodsSpecDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
