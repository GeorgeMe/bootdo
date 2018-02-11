package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.GoodsCombinDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface GoodsCombinService {
	
	GoodsCombinDO get(Long wemallGoodsId);
	
	List<GoodsCombinDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsCombinDO goodsCombin);
	
	int update(GoodsCombinDO goodsCombin);
	
	int remove(Long wemallGoodsId);
	
	int batchRemove(Long[] wemallGoodsIds);

	GoodsCombinDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
