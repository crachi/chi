package com.example.template.vo;

import lombok.Data;

@Data
public class MonVO {

    private String v_month;
    private String mon_cnt;

    public MonVO(){}
    public MonVO(String v_month,String mon_cnt) {
        super();
        this.v_month = v_month; 
        this.mon_cnt = mon_cnt; 
    }
}


        
