package com.entity.model;

import com.entity.ShitikuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 试题库
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-06 19:50:32
 */
public class ShitikuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 科目
	 */
	
	private String kemu;
		
	/**
	 * 章节
	 */
	
	private String zhangjie;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 题目内容
	 */
	
	private String timuneirong;
		
	/**
	 * 答案
	 */
	
	private String daan;
		
	/**
	 * 重点分析
	 */
	
	private String zhongdianfenxi;
		
	/**
	 * 题目详情
	 */
	
	private String timuxiangqing;
				
	
	/**
	 * 设置：科目
	 */
	 
	public void setKemu(String kemu) {
		this.kemu = kemu;
	}
	
	/**
	 * 获取：科目
	 */
	public String getKemu() {
		return kemu;
	}
				
	
	/**
	 * 设置：章节
	 */
	 
	public void setZhangjie(String zhangjie) {
		this.zhangjie = zhangjie;
	}
	
	/**
	 * 获取：章节
	 */
	public String getZhangjie() {
		return zhangjie;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：题目内容
	 */
	 
	public void setTimuneirong(String timuneirong) {
		this.timuneirong = timuneirong;
	}
	
	/**
	 * 获取：题目内容
	 */
	public String getTimuneirong() {
		return timuneirong;
	}
				
	
	/**
	 * 设置：答案
	 */
	 
	public void setDaan(String daan) {
		this.daan = daan;
	}
	
	/**
	 * 获取：答案
	 */
	public String getDaan() {
		return daan;
	}
				
	
	/**
	 * 设置：重点分析
	 */
	 
	public void setZhongdianfenxi(String zhongdianfenxi) {
		this.zhongdianfenxi = zhongdianfenxi;
	}
	
	/**
	 * 获取：重点分析
	 */
	public String getZhongdianfenxi() {
		return zhongdianfenxi;
	}
				
	
	/**
	 * 设置：题目详情
	 */
	 
	public void setTimuxiangqing(String timuxiangqing) {
		this.timuxiangqing = timuxiangqing;
	}
	
	/**
	 * 获取：题目详情
	 */
	public String getTimuxiangqing() {
		return timuxiangqing;
	}
			
}
