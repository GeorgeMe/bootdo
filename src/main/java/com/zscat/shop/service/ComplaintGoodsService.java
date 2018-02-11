package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.ComplaintGoodsDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public interface ComplaintGoodsService {
	
	ComplaintGoodsDO get(Long id);
	
	List<ComplaintGoodsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ComplaintGoodsDO complaintGoods);
	
	int update(ComplaintGoodsDO complaintGoods);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	ComplaintGoodsDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
