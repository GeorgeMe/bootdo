package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.GoodsReturnDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface GoodsReturnService {
	
	GoodsReturnDO get(Long id);
	
	List<GoodsReturnDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsReturnDO goodsReturn);
	
	int update(GoodsReturnDO goodsReturn);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	GoodsReturnDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
