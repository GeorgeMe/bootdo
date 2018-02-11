package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.AlbumDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public interface AlbumService {
	
	AlbumDO get(Long id);
	
	List<AlbumDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AlbumDO album);
	
	int update(AlbumDO album);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	AlbumDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
