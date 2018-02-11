package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.HomepageGoodsclassDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface HomepageGoodsclassService {
	
	HomepageGoodsclassDO get(Long id);
	
	List<HomepageGoodsclassDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(HomepageGoodsclassDO homepageGoodsclass);
	
	int update(HomepageGoodsclassDO homepageGoodsclass);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	HomepageGoodsclassDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
