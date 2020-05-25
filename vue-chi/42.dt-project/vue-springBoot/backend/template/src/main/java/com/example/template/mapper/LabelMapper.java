package com.example.template.mapper;


import java.util.List;

import com.example.template.vo.LabVO;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper 
public interface LabelMapper { 
	// @Select("SELECT DOC_NUM,TEXT FROM INSTA")
	@Select("SELECT LABEL, COUNT(METHODNAME) LAB_CNT FROM MAIN_RESULTMODEL GROUP BY LABEL")  
	public List<LabVO> selectLabel(); 
}


