package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.ReportDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public interface ReportService {
	
	ReportDO get(Long id);
	
	List<ReportDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ReportDO report);
	
	int update(ReportDO report);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	ReportDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
