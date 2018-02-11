package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.AreaDao;
import com.zscat.shop.domain.AreaDO;
import com.zscat.shop.service.AreaService;



@Service
public class AreaServiceImpl implements AreaService {
	@Autowired
	private AreaDao areaDao;
	
	@Override
	public AreaDO get(Long id){
		return areaDao.get(id);
	}
	
	@Override
	public List<AreaDO> list(Map<String, Object> map){
		return areaDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return areaDao.count(map);
	}
	
	@Override
	public int save(AreaDO area){
		return areaDao.save(area);
	}
	
	@Override
	public int update(AreaDO area){
		return areaDao.update(area);
	}
	
	@Override
	public int remove(Long id){
		return areaDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return areaDao.batchRemove(ids);
	}
    @Override
    public AreaDO selectOne(Map<String, Object> params) {
        List<AreaDO> list = areaDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<AreaDO> resList = areaDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}
