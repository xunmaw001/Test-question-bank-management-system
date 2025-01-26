package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShitikuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShitikuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShitikuView;


/**
 * 试题库
 *
 * @author 
 * @email 
 * @date 2023-03-06 19:50:32
 */
public interface ShitikuService extends IService<ShitikuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShitikuVO> selectListVO(Wrapper<ShitikuEntity> wrapper);
   	
   	ShitikuVO selectVO(@Param("ew") Wrapper<ShitikuEntity> wrapper);
   	
   	List<ShitikuView> selectListView(Wrapper<ShitikuEntity> wrapper);
   	
   	ShitikuView selectView(@Param("ew") Wrapper<ShitikuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShitikuEntity> wrapper);
   	

}

