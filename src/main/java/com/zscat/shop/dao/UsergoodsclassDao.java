package com.zscat.shop.dao;

import com.zscat.shop.domain.UsergoodsclassDO;

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
public interface UsergoodsclassDao {

	UsergoodsclassDO get(Long id);
	
	List<UsergoodsclassDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(UsergoodsclassDO usergoodsclass);
	
	int update(UsergoodsclassDO usergoodsclass);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
