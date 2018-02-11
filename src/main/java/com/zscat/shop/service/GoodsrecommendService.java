package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.GoodsrecommendDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface GoodsrecommendService {
	
	GoodsrecommendDO get(Long id);
	
	List<GoodsrecommendDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsrecommendDO goodsrecommend);
	
	int update(GoodsrecommendDO goodsrecommend);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	GoodsrecommendDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
