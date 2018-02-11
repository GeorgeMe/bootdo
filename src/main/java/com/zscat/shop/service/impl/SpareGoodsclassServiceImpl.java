package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.SpareGoodsclassDao;
import com.zscat.shop.domain.SpareGoodsclassDO;
import com.zscat.shop.service.SpareGoodsclassService;



@Service
public class SpareGoodsclassServiceImpl implements SpareGoodsclassService {
	@Autowired
	private SpareGoodsclassDao spareGoodsclassDao;
	
	@Override
	public SpareGoodsclassDO get(Long id){
		return spareGoodsclassDao.get(id);
	}
	
	@Override
	public List<SpareGoodsclassDO> list(Map<String, Object> map){
		return spareGoodsclassDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return spareGoodsclassDao.count(map);
	}
	
	@Override
	public int save(SpareGoodsclassDO spareGoodsclass){
		return spareGoodsclassDao.save(spareGoodsclass);
	}
	
	@Override
	public int update(SpareGoodsclassDO spareGoodsclass){
		return spareGoodsclassDao.update(spareGoodsclass);
	}
	
	@Override
	public int remove(Long id){
		return spareGoodsclassDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return spareGoodsclassDao.batchRemove(ids);
	}
    @Override
    public SpareGoodsclassDO selectOne(Map<String, Object> params) {
        List<SpareGoodsclassDO> list = spareGoodsclassDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<SpareGoodsclassDO> resList = spareGoodsclassDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}
