package com.example.template.mapper;

import java.util.List;

import com.example.template.vo.MonVO;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper 
public interface HItUpdateMapper { 
	// @Select("SELECT DOC_NUM,TEXT FROM INSTA")
	@Update("UPDATE MAIN_RESULTMODEL SET hit_yn = 'N' WHERE FILENAME= #{hitImg}")  
	public void UpdateHitN(String hitImg); 

	@Update("UPDATE MAIN_RESULTMODEL SET hit_yn = 'Y' WHERE FILENAME= #{hitImg}")  
	public void UpdateHitY(String hitImg); 

}

