package com.zscat.shop.dao;

import com.zscat.shop.domain.ComplaintGoodsDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
@Mapper
public interface ComplaintGoodsDao {

	ComplaintGoodsDO get(Long id);
	
	List<ComplaintGoodsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ComplaintGoodsDO complaintGoods);
	
	int update(ComplaintGoodsDO complaintGoods);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
