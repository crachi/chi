package com.example.template.mapper;

import java.util.List;

import com.example.template.vo.UserVO;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper 
public interface TestMapper { 
	@Select("SELECT DOC_NUM,TEXT FROM INSTA") 
	public List<UserVO> readHome(); 
}

