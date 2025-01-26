package com.entity.view;

import com.entity.ShitikuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 试题库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-06 19:50:32
 */
@TableName("shitiku")
public class ShitikuView  extends ShitikuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShitikuView(){
	}
 
 	public ShitikuView(ShitikuEntity shitikuEntity){
 	try {
			BeanUtils.copyProperties(this, shitikuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
