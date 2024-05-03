package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LiuyanbeizhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LiuyanbeizhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LiuyanbeizhuView;


/**
 * 留言备注
 *
 * @author 
 * @email 
 * @date 2022-03-25 14:13:13
 */
public interface LiuyanbeizhuService extends IService<LiuyanbeizhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LiuyanbeizhuVO> selectListVO(Wrapper<LiuyanbeizhuEntity> wrapper);
   	
   	LiuyanbeizhuVO selectVO(@Param("ew") Wrapper<LiuyanbeizhuEntity> wrapper);
   	
   	List<LiuyanbeizhuView> selectListView(Wrapper<LiuyanbeizhuEntity> wrapper);
   	
   	LiuyanbeizhuView selectView(@Param("ew") Wrapper<LiuyanbeizhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LiuyanbeizhuEntity> wrapper);
   	

}

