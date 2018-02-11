package com.zscat.shop.dao;

import com.zscat.shop.domain.GoodsReturnDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
@Mapper
public interface GoodsReturnDao {

	GoodsReturnDO get(Long id);
	
	List<GoodsReturnDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsReturnDO goodsReturn);
	
	int update(GoodsReturnDO goodsReturn);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
