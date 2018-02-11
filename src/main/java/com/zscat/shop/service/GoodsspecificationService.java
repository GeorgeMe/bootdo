package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.GoodsspecificationDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface GoodsspecificationService {
	
	GoodsspecificationDO get(Long id);
	
	List<GoodsspecificationDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsspecificationDO goodsspecification);
	
	int update(GoodsspecificationDO goodsspecification);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	GoodsspecificationDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
