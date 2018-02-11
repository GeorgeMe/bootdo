package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.ComplaintGoodsDao;
import com.zscat.shop.domain.ComplaintGoodsDO;
import com.zscat.shop.service.ComplaintGoodsService;



@Service
public class ComplaintGoodsServiceImpl implements ComplaintGoodsService {
	@Autowired
	private ComplaintGoodsDao complaintGoodsDao;
	
	@Override
	public ComplaintGoodsDO get(Long id){
		return complaintGoodsDao.get(id);
	}
	
	@Override
	public List<ComplaintGoodsDO> list(Map<String, Object> map){
		return complaintGoodsDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return complaintGoodsDao.count(map);
	}
	
	@Override
	public int save(ComplaintGoodsDO complaintGoods){
		return complaintGoodsDao.save(complaintGoods);
	}
	
	@Override
	public int update(ComplaintGoodsDO complaintGoods){
		return complaintGoodsDao.update(complaintGoods);
	}
	
	@Override
	public int remove(Long id){
		return complaintGoodsDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return complaintGoodsDao.batchRemove(ids);
	}
    @Override
    public ComplaintGoodsDO selectOne(Map<String, Object> params) {
        List<ComplaintGoodsDO> list = complaintGoodsDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<ComplaintGoodsDO> resList = complaintGoodsDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}
