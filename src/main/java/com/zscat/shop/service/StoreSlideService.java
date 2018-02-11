package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.StoreSlideDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public interface StoreSlideService {
	
	StoreSlideDO get(Long id);
	
	List<StoreSlideDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StoreSlideDO storeSlide);
	
	int update(StoreSlideDO storeSlide);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	StoreSlideDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
