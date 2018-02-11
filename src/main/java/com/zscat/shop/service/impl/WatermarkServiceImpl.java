package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.WatermarkDao;
import com.zscat.shop.domain.WatermarkDO;
import com.zscat.shop.service.WatermarkService;



@Service
public class WatermarkServiceImpl implements WatermarkService {
	@Autowired
	private WatermarkDao watermarkDao;
	
	@Override
	public WatermarkDO get(Long id){
		return watermarkDao.get(id);
	}
	
	@Override
	public List<WatermarkDO> list(Map<String, Object> map){
		return watermarkDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return watermarkDao.count(map);
	}
	
	@Override
	public int save(WatermarkDO watermark){
		return watermarkDao.save(watermark);
	}
	
	@Override
	public int update(WatermarkDO watermark){
		return watermarkDao.update(watermark);
	}
	
	@Override
	public int remove(Long id){
		return watermarkDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return watermarkDao.batchRemove(ids);
	}
    @Override
    public WatermarkDO selectOne(Map<String, Object> params) {
        List<WatermarkDO> list = watermarkDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<WatermarkDO> resList = watermarkDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}
