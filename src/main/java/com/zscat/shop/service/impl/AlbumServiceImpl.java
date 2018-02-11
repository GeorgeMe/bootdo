package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.AlbumDao;
import com.zscat.shop.domain.AlbumDO;
import com.zscat.shop.service.AlbumService;



@Service
public class AlbumServiceImpl implements AlbumService {
	@Autowired
	private AlbumDao albumDao;
	
	@Override
	public AlbumDO get(Long id){
		return albumDao.get(id);
	}
	
	@Override
	public List<AlbumDO> list(Map<String, Object> map){
		return albumDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return albumDao.count(map);
	}
	
	@Override
	public int save(AlbumDO album){
		return albumDao.save(album);
	}
	
	@Override
	public int update(AlbumDO album){
		return albumDao.update(album);
	}
	
	@Override
	public int remove(Long id){
		return albumDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return albumDao.batchRemove(ids);
	}
    @Override
    public AlbumDO selectOne(Map<String, Object> params) {
        List<AlbumDO> list = albumDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<AlbumDO> resList = albumDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}
