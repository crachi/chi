package com.example.template.mapper;


import java.util.List;

import com.example.template.vo.HitVO;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper 
public interface HitMapper { 
	// @Select("SELECT DOC_NUM,TEXT FROM INSTA")
	@Select("SELECT HIT_YN, COUNT(METHODNAME) HIT_CNT FROM MAIN_RESULTMODEL GROUP BY HIT_YN")  
	public List<HitVO> selectHit(); 
}



