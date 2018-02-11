package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.ArticleDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public interface ArticleService {
	
	ArticleDO get(Long id);
	
	List<ArticleDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ArticleDO article);
	
	int update(ArticleDO article);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	ArticleDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
