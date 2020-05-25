package com.example.template.vo;

import lombok.Data;

@Data
public class UserVO {

    private String doc_num;
    private String text;

    public UserVO(){}
    public UserVO(String doc_num, String text) {
        super();
        this.doc_num = doc_num;
        this.text = text;
    }

}