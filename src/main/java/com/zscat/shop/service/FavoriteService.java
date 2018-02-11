package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.FavoriteDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
public interface FavoriteService {
	
	FavoriteDO get(Long id);
	
	List<FavoriteDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FavoriteDO favorite);
	
	int update(FavoriteDO favorite);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	FavoriteDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
