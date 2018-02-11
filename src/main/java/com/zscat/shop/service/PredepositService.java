package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.PredepositDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public interface PredepositService {
	
	PredepositDO get(Long id);
	
	List<PredepositDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PredepositDO predeposit);
	
	int update(PredepositDO predeposit);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	PredepositDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
