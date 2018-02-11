package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GoodsclassDao;
import com.zscat.shop.domain.GoodsclassDO;
import com.zscat.shop.service.GoodsclassService;



@Service
public class GoodsclassServiceImpl implements GoodsclassService {
	@Autowired
	private GoodsclassDao goodsclassDao;
	
	@Override
	public GoodsclassDO get(Long id){
		return goodsclassDao.get(id);
	}
	
	@Override
	public List<GoodsclassDO> list(Map<String, Object> map){
		return goodsclassDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goodsclassDao.count(map);
	}
	
	@Override
	public int save(GoodsclassDO goodsclass){
		return goodsclassDao.save(goodsclass);
	}
	
	@Override
	public int update(GoodsclassDO goodsclass){
		return goodsclassDao.update(goodsclass);
	}
	
	@Override
	public int remove(Long id){
		return goodsclassDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return goodsclassDao.batchRemove(ids);
	}
    @Override
    public GoodsclassDO selectOne(Map<String, Object> params) {
        List<GoodsclassDO> list = goodsclassDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GoodsclassDO> resList = goodsclassDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}
