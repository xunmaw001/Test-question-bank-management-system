package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShitikuDao;
import com.entity.ShitikuEntity;
import com.service.ShitikuService;
import com.entity.vo.ShitikuVO;
import com.entity.view.ShitikuView;

@Service("shitikuService")
public class ShitikuServiceImpl extends ServiceImpl<ShitikuDao, ShitikuEntity> implements ShitikuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShitikuEntity> page = this.selectPage(
                new Query<ShitikuEntity>(params).getPage(),
                new EntityWrapper<ShitikuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShitikuEntity> wrapper) {
		  Page<ShitikuView> page =new Query<ShitikuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShitikuVO> selectListVO(Wrapper<ShitikuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShitikuVO selectVO(Wrapper<ShitikuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShitikuView> selectListView(Wrapper<ShitikuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShitikuView selectView(Wrapper<ShitikuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
