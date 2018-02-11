package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.HomepageDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface HomepageService {
	
	HomepageDO get(Long id);
	
	List<HomepageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(HomepageDO homepage);
	
	int update(HomepageDO homepage);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	HomepageDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
