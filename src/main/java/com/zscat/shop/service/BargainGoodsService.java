package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.BargainGoodsDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public interface BargainGoodsService {
	
	BargainGoodsDO get(Long id);
	
	List<BargainGoodsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(BargainGoodsDO bargainGoods);
	
	int update(BargainGoodsDO bargainGoods);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	BargainGoodsDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
