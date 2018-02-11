package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.GoodsspecpropertyDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface GoodsspecpropertyService {
	
	GoodsspecpropertyDO get(Long id);
	
	List<GoodsspecpropertyDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsspecpropertyDO goodsspecproperty);
	
	int update(GoodsspecpropertyDO goodsspecproperty);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	GoodsspecpropertyDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
