package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.GoodstypeBrandDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface GoodstypeBrandService {
	
	GoodstypeBrandDO get(Long typeId);
	
	List<GoodstypeBrandDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodstypeBrandDO goodstypeBrand);
	
	int update(GoodstypeBrandDO goodstypeBrand);
	
	int remove(Long typeId);
	
	int batchRemove(Long[] typeIds);

	GoodstypeBrandDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
