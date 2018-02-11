package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.StorePartnerDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public interface StorePartnerService {
	
	StorePartnerDO get(Long id);
	
	List<StorePartnerDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StorePartnerDO storePartner);
	
	int update(StorePartnerDO storePartner);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	StorePartnerDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
