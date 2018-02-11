package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.ReturnGspDao;
import com.zscat.shop.domain.ReturnGspDO;
import com.zscat.shop.service.ReturnGspService;



@Service
public class ReturnGspServiceImpl implements ReturnGspService {
	@Autowired
	private ReturnGspDao returnGspDao;
	
	@Override
	public ReturnGspDO get(Long itemId){
		return returnGspDao.get(itemId);
	}
	
	@Override
	public List<ReturnGspDO> list(Map<String, Object> map){
		return returnGspDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return returnGspDao.count(map);
	}
	
	@Override
	public int save(ReturnGspDO returnGsp){
		return returnGspDao.save(returnGsp);
	}
	
	@Override
	public int update(ReturnGspDO returnGsp){
		return returnGspDao.update(returnGsp);
	}
	
	@Override
	public int remove(Long itemId){
		return returnGspDao.remove(itemId);
	}
	
	@Override
	public int batchRemove(Long[] itemIds){
		return returnGspDao.batchRemove(itemIds);
	}
    @Override
    public ReturnGspDO selectOne(Map<String, Object> params) {
        List<ReturnGspDO> list = returnGspDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<ReturnGspDO> resList = returnGspDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}
