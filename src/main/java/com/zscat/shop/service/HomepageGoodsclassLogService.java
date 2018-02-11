package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.HomepageGoodsclassLogDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface HomepageGoodsclassLogService {
	
	HomepageGoodsclassLogDO get(Long id);
	
	List<HomepageGoodsclassLogDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(HomepageGoodsclassLogDO homepageGoodsclassLog);
	
	int update(HomepageGoodsclassLogDO homepageGoodsclassLog);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	HomepageGoodsclassLogDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
