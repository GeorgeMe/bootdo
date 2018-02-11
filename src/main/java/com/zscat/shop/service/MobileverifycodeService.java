package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.MobileverifycodeDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface MobileverifycodeService {
	
	MobileverifycodeDO get(Long id);
	
	List<MobileverifycodeDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(MobileverifycodeDO mobileverifycode);
	
	int update(MobileverifycodeDO mobileverifycode);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	MobileverifycodeDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
