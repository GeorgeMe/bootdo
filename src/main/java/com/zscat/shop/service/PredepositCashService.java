package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.PredepositCashDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public interface PredepositCashService {
	
	PredepositCashDO get(Long id);
	
	List<PredepositCashDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PredepositCashDO predepositCash);
	
	int update(PredepositCashDO predepositCash);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	PredepositCashDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
