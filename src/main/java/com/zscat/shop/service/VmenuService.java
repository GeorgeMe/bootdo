package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.VmenuDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
public interface VmenuService {
	
	VmenuDO get(Long id);
	
	List<VmenuDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(VmenuDO vmenu);
	
	int update(VmenuDO vmenu);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	VmenuDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
