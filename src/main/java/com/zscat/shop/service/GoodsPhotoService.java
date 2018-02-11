package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.GoodsPhotoDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface GoodsPhotoService {
	
	GoodsPhotoDO get(Long goodsId);
	
	List<GoodsPhotoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsPhotoDO goodsPhoto);
	
	int update(GoodsPhotoDO goodsPhoto);
	
	int remove(Long goodsId);
	
	int batchRemove(Long[] goodsIds);

	GoodsPhotoDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
