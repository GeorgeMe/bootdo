package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.AdvPosDao;
import com.zscat.shop.domain.AdvPosDO;
import com.zscat.shop.service.AdvPosService;



@Service
public class AdvPosServiceImpl implements AdvPosService {
	@Autowired
	private AdvPosDao advPosDao;
	
	@Override
	public AdvPosDO get(Long id){
		return advPosDao.get(id);
	}
	
	@Override
	public List<AdvPosDO> list(Map<String, Object> map){
		return advPosDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return advPosDao.count(map);
	}
	
	@Override
	public int save(AdvPosDO advPos){
		return advPosDao.save(advPos);
	}
	
	@Override
	public int update(AdvPosDO advPos){
		return advPosDao.update(advPos);
	}
	
	@Override
	public int remove(Long id){
		return advPosDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return advPosDao.batchRemove(ids);
	}
    @Override
    public AdvPosDO selectOne(Map<String, Object> params) {
        List<AdvPosDO> list = advPosDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<AdvPosDO> resList = advPosDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}
