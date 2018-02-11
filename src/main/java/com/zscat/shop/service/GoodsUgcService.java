package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.GoodsUgcDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface GoodsUgcService {
	
	GoodsUgcDO get(Long goodsId);
	
	List<GoodsUgcDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsUgcDO goodsUgc);
	
	int update(GoodsUgcDO goodsUgc);
	
	int remove(Long goodsId);
	
	int batchRemove(Long[] goodsIds);

	GoodsUgcDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
