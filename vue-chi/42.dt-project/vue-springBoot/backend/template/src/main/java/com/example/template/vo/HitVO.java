package com.example.template.vo;

import lombok.Data;

@Data
public class HitVO {

    private String hit_yn;
    private String hit_cnt;

    public HitVO(){}
    public HitVO(String hit_yn,String hit_cnt) {
        super();
        this.hit_yn = hit_yn; 
        this.hit_cnt = hit_cnt; 
    }
}


        
