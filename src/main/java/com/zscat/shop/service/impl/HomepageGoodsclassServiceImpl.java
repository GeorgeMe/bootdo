package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.HomepageGoodsclassDao;
import com.zscat.shop.domain.HomepageGoodsclassDO;
import com.zscat.shop.service.HomepageGoodsclassService;



@Service
public class HomepageGoodsclassServiceImpl implements HomepageGoodsclassService {
	@Autowired
	private HomepageGoodsclassDao homepageGoodsclassDao;
	
	@Override
	public HomepageGoodsclassDO get(Long id){
		return homepageGoodsclassDao.get(id);
	}
	
	@Override
	public List<HomepageGoodsclassDO> list(Map<String, Object> map){
		return homepageGoodsclassDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return homepageGoodsclassDao.count(map);
	}
	
	@Override
	public int save(HomepageGoodsclassDO homepageGoodsclass){
		return homepageGoodsclassDao.save(homepageGoodsclass);
	}
	
	@Override
	public int update(HomepageGoodsclassDO homepageGoodsclass){
		return homepageGoodsclassDao.update(homepageGoodsclass);
	}
	
	@Override
	public int remove(Long id){
		return homepageGoodsclassDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return homepageGoodsclassDao.batchRemove(ids);
	}
    @Override
    public HomepageGoodsclassDO selectOne(Map<String, Object> params) {
        List<HomepageGoodsclassDO> list = homepageGoodsclassDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<HomepageGoodsclassDO> resList = homepageGoodsclassDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}
