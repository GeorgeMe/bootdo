package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.WatermarkDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
public interface WatermarkService {
	
	WatermarkDO get(Long id);
	
	List<WatermarkDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WatermarkDO watermark);
	
	int update(WatermarkDO watermark);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	WatermarkDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
