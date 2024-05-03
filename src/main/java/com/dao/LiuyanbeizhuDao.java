package com.dao;

import com.entity.LiuyanbeizhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LiuyanbeizhuVO;
import com.entity.view.LiuyanbeizhuView;


/**
 * 留言备注
 * 
 * @author 
 * @email 
 * @date 2022-03-25 14:13:13
 */
public interface LiuyanbeizhuDao extends BaseMapper<LiuyanbeizhuEntity> {
	
	List<LiuyanbeizhuVO> selectListVO(@Param("ew") Wrapper<LiuyanbeizhuEntity> wrapper);
	
	LiuyanbeizhuVO selectVO(@Param("ew") Wrapper<LiuyanbeizhuEntity> wrapper);
	
	List<LiuyanbeizhuView> selectListView(@Param("ew") Wrapper<LiuyanbeizhuEntity> wrapper);

	List<LiuyanbeizhuView> selectListView(Pagination page,@Param("ew") Wrapper<LiuyanbeizhuEntity> wrapper);
	
	LiuyanbeizhuView selectView(@Param("ew") Wrapper<LiuyanbeizhuEntity> wrapper);
	

}
