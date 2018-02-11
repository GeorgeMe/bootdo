package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.GroupGoodsDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface GroupGoodsService {
	
	GroupGoodsDO get(Long id);
	
	List<GroupGoodsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GroupGoodsDO groupGoods);
	
	int update(GroupGoodsDO groupGoods);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	GroupGoodsDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
