package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.CartGspDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public interface CartGspService {
	
	CartGspDO get(Long cartId);
	
	List<CartGspDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CartGspDO cartGsp);
	
	int update(CartGspDO cartGsp);
	
	int remove(Long cartId);
	
	int batchRemove(Long[] cartIds);

	CartGspDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
