package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.PartnerDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface PartnerService {
	
	PartnerDO get(Long id);
	
	List<PartnerDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PartnerDO partner);
	
	int update(PartnerDO partner);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	PartnerDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
