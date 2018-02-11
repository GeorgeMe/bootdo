package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.StoreclassDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public interface StoreclassService {
	
	StoreclassDO get(Long id);
	
	List<StoreclassDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StoreclassDO storeclass);
	
	int update(StoreclassDO storeclass);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	StoreclassDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
