package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.GoldRecordDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
public interface GoldRecordService {
	
	GoldRecordDO get(Long id);
	
	List<GoldRecordDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoldRecordDO goldRecord);
	
	int update(GoldRecordDO goldRecord);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	GoldRecordDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
