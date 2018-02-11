package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.BrandcategoryDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public interface BrandcategoryService {
	
	BrandcategoryDO get(Long id);
	
	List<BrandcategoryDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(BrandcategoryDO brandcategory);
	
	int update(BrandcategoryDO brandcategory);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	BrandcategoryDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
