package com.zscat.shop.dao;

import com.zscat.shop.domain.BrandcategoryDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
@Mapper
public interface BrandcategoryDao {

	BrandcategoryDO get(Long id);
	
	List<BrandcategoryDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(BrandcategoryDO brandcategory);
	
	int update(BrandcategoryDO brandcategory);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
