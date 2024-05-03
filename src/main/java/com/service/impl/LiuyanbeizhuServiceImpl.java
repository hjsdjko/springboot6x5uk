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


import com.dao.LiuyanbeizhuDao;
import com.entity.LiuyanbeizhuEntity;
import com.service.LiuyanbeizhuService;
import com.entity.vo.LiuyanbeizhuVO;
import com.entity.view.LiuyanbeizhuView;

@Service("liuyanbeizhuService")
public class LiuyanbeizhuServiceImpl extends ServiceImpl<LiuyanbeizhuDao, LiuyanbeizhuEntity> implements LiuyanbeizhuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LiuyanbeizhuEntity> page = this.selectPage(
                new Query<LiuyanbeizhuEntity>(params).getPage(),
                new EntityWrapper<LiuyanbeizhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LiuyanbeizhuEntity> wrapper) {
		  Page<LiuyanbeizhuView> page =new Query<LiuyanbeizhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LiuyanbeizhuVO> selectListVO(Wrapper<LiuyanbeizhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LiuyanbeizhuVO selectVO(Wrapper<LiuyanbeizhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LiuyanbeizhuView> selectListView(Wrapper<LiuyanbeizhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LiuyanbeizhuView selectView(Wrapper<LiuyanbeizhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
