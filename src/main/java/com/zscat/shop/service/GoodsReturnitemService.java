package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.GoodsReturnitemDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface GoodsReturnitemService {
	
	GoodsReturnitemDO get(Long id);
	
	List<GoodsReturnitemDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsReturnitemDO goodsReturnitem);
	
	int update(GoodsReturnitemDO goodsReturnitem);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	GoodsReturnitemDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
