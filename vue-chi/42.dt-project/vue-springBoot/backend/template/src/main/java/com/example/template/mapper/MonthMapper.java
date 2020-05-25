package com.example.template.mapper;

import java.util.List;

import com.example.template.vo.MonVO;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper 
public interface MonthMapper { 
	// @Select("SELECT DOC_NUM,TEXT FROM INSTA")
	@Select("SELECT V_MONTH, COUNT(V_MONTH) MON_CNT FROM (SELECT SUBSTR(DATETIME, 0,4) V_MONTH FROM MAIN_RESULTMODEL) GROUP BY V_MONTH ORDER BY V_MONTH")  
	public List<MonVO> selectMonth(); 
}

