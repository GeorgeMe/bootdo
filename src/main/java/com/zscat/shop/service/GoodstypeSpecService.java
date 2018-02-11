package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.GoodstypeSpecDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface GoodstypeSpecService {
	
	GoodstypeSpecDO get(Long typeId);
	
	List<GoodstypeSpecDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodstypeSpecDO goodstypeSpec);
	
	int update(GoodstypeSpecDO goodstypeSpec);
	
	int remove(Long typeId);
	
	int batchRemove(Long[] typeIds);

	GoodstypeSpecDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
