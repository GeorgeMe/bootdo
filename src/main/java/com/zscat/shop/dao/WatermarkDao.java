package com.zscat.shop.dao;

import com.zscat.shop.domain.WatermarkDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
@Mapper
public interface WatermarkDao {

	WatermarkDO get(Long id);
	
	List<WatermarkDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WatermarkDO watermark);
	
	int update(WatermarkDO watermark);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
