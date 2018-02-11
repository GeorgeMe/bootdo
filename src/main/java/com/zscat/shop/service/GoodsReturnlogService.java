package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.GoodsReturnlogDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface GoodsReturnlogService {
	
	GoodsReturnlogDO get(Long id);
	
	List<GoodsReturnlogDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsReturnlogDO goodsReturnlog);
	
	int update(GoodsReturnlogDO goodsReturnlog);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	GoodsReturnlogDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
