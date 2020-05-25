package com.example.template.vo;

import lombok.Data;

@Data
public class LabVO {

    private String label;
    private String lab_cnt;

    public LabVO(){}
    public LabVO(String label,String lab_cnt) {
        super();
        this.label = label; 
        this.lab_cnt = lab_cnt; 
    }
}


        
