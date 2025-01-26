package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 试题库
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-06 19:50:32
 */
@TableName("shitiku")
public class ShitikuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShitikuEntity() {
		
	}
	
	public ShitikuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 题库编号
	 */
					
	private String tikubianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：题库编号
	 */
	public void setTikubianhao(String tikubianhao) {
		this.tikubianhao = tikubianhao;
	}
	/**
	 * 获取：题库编号
	 */
	public String getTikubianhao() {
		return tikubianhao;
	}
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
