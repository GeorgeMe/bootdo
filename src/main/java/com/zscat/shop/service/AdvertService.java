package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.AdvertDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public interface AdvertService {
	
	AdvertDO get(Long id);
	
	List<AdvertDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AdvertDO advert);
	
	int update(AdvertDO advert);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	AdvertDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
