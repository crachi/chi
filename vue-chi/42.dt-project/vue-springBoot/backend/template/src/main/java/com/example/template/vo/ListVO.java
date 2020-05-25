package com.example.template.vo;

import lombok.Data;

@Data
public class ListVO {

    // private String doc_num;
    // private String text;

    // private String sys_id;
    // private String code_desc1;

    // public UserVO(){}
    // public UserVO(String sys_id, String code_desc1) {
    //     super();
    //     this.sys_id = sys_id;
    //     this.code_desc1 = code_desc1;
    // }


    private String printdate;
    private String searchdate;
    private String methodname;
    private String modelname;
    private String datetime;
    private String filename;
    private String label;
    private String score;
    private String px;
    private String py;
    private String width;
    private String height;
    private String image_path;
    private String hit_yn;
    private String ip;
    private String managername;
    private String emp_no;
    private String insert_dt;
    private String update_dt;

    public ListVO(){}
    public ListVO(String printdate,String searchdate,String methodname, String modelname, String datetime, String filename, String label, String score, String px, String py, String width, String height,String image_path,String hit_yn, String ip, String managername,String emp_no, String insert_dt, String update_dt) {
        super();
        this.printdate = printdate; 
        this.searchdate = searchdate; 
        this.methodname = methodname; 
        this.modelname = modelname; 
        this.datetime = datetime;
        this.filename = filename;
        this.label = label;
        this.score = score;
        this.px = px;
        this.py = py;
        this.width = width;
        this.height = height;
        this.image_path = image_path;
        this.hit_yn = hit_yn;
        this.ip = ip;
        this.managername = managername;
        this.emp_no = emp_no;
        this.insert_dt = insert_dt;
        this.update_dt = update_dt;
    }
}


        
