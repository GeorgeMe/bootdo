package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.CartGspDao;
import com.zscat.shop.domain.CartGspDO;
import com.zscat.shop.service.CartGspService;



@Service
public class CartGspServiceImpl implements CartGspService {
	@Autowired
	private CartGspDao cartGspDao;
	
	@Override
	public CartGspDO get(Long cartId){
		return cartGspDao.get(cartId);
	}
	
	@Override
	public List<CartGspDO> list(Map<String, Object> map){
		return cartGspDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return cartGspDao.count(map);
	}
	
	@Override
	public int save(CartGspDO cartGsp){
		return cartGspDao.save(cartGsp);
	}
	
	@Override
	public int update(CartGspDO cartGsp){
		return cartGspDao.update(cartGsp);
	}
	
	@Override
	public int remove(Long cartId){
		return cartGspDao.remove(cartId);
	}
	
	@Override
	public int batchRemove(Long[] cartIds){
		return cartGspDao.batchRemove(cartIds);
	}
    @Override
    public CartGspDO selectOne(Map<String, Object> params) {
        List<CartGspDO> list = cartGspDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<CartGspDO> resList = cartGspDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}
