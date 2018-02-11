package com.zscat.shop.dao;

import com.zscat.shop.domain.GoodsclassDO;

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
public interface GoodsclassDao {

	GoodsclassDO get(Long id);
	
	List<GoodsclassDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsclassDO goodsclass);
	
	int update(GoodsclassDO goodsclass);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
