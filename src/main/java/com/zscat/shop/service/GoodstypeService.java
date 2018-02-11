package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.GoodstypeDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface GoodstypeService {
	
	GoodstypeDO get(Long id);
	
	List<GoodstypeDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodstypeDO goodstype);
	
	int update(GoodstypeDO goodstype);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	GoodstypeDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
