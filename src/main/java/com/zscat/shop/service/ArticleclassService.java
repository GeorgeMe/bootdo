package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.ArticleclassDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public interface ArticleclassService {
	
	ArticleclassDO get(Long id);
	
	List<ArticleclassDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ArticleclassDO articleclass);
	
	int update(ArticleclassDO articleclass);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	ArticleclassDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
