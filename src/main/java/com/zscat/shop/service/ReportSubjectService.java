package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.ReportSubjectDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public interface ReportSubjectService {
	
	ReportSubjectDO get(Long id);
	
	List<ReportSubjectDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ReportSubjectDO reportSubject);
	
	int update(ReportSubjectDO reportSubject);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	ReportSubjectDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
