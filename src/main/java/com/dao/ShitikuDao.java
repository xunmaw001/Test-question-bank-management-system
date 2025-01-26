package com.dao;

import com.entity.ShitikuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShitikuVO;
import com.entity.view.ShitikuView;


/**
 * 试题库
 * 
 * @author 
 * @email 
 * @date 2023-03-06 19:50:32
 */
public interface ShitikuDao extends BaseMapper<ShitikuEntity> {
	
	List<ShitikuVO> selectListVO(@Param("ew") Wrapper<ShitikuEntity> wrapper);
	
	ShitikuVO selectVO(@Param("ew") Wrapper<ShitikuEntity> wrapper);
	
	List<ShitikuView> selectListView(@Param("ew") Wrapper<ShitikuEntity> wrapper);

	List<ShitikuView> selectListView(Pagination page,@Param("ew") Wrapper<ShitikuEntity> wrapper);
	
	ShitikuView selectView(@Param("ew") Wrapper<ShitikuEntity> wrapper);
	

}
