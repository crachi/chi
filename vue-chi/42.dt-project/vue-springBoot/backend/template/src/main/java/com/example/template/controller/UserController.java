package com.example.template.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.template.mapper.HItUpdateMapper;
import com.example.template.mapper.HitMapper;
import com.example.template.mapper.LabelMapper;
import com.example.template.mapper.ListMapper;
import com.example.template.mapper.MonthMapper;
import com.example.template.vo.ResponseVO;
import com.example.template.vo.HitVO;
import com.example.template.vo.LabVO;
import com.example.template.vo.ListVO;
import com.example.template.vo.MonVO;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
// @MapperScan("com.example.template.mapper")
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    ListMapper listMapper;     
    
    @Autowired
    HitMapper hitMapper;
    
    @Autowired
    LabelMapper labelMapper;

    @Autowired
    MonthMapper monthMapper;

    @Autowired
    HItUpdateMapper hitUpdateMapper;

    @GetMapping
    public ResponseVO<?> getLists() {
        ResponseVO<List<ListVO>> respList = new ResponseVO<>();

        List<ListVO> rList = listMapper.selectList();

        System.out.println("printList::"+rList.toString());

        respList.setResponse(rList);
        return respList;
    }

    @GetMapping("/hits")
    public ResponseVO<?> gethits() {
        ResponseVO<List<HitVO>> respHits = new ResponseVO<>();

        List<HitVO> rHits = hitMapper.selectHit();
        System.out.println("printHits::"+rHits.toString());

        respHits.setResponse(rHits);
        return respHits;
    }

    @GetMapping("/labs")
    public ResponseVO<?> getlabs() {
        ResponseVO<List<LabVO>> respLabs = new ResponseVO<>();

        List<LabVO> rLabs = labelMapper.selectLabel();
        System.out.println("printLabs::"+rLabs.toString());

        respLabs.setResponse(rLabs);
        return respLabs;
    }

    @GetMapping("/mons")
    public ResponseVO<?> getmons() {
        ResponseVO<List<MonVO>> respMons = new ResponseVO<>();

        List<MonVO> rMons = monthMapper.selectMonth();
        System.out.println("printMonth::"+rMons.toString());

        respMons.setResponse(rMons);
        return respMons;
    }   

    @GetMapping("/{yn}/{hitImg}")
    public String save(@PathVariable String yn, @PathVariable String hitImg){
        String succ = "succ";
        System.out.println("chicheck::" + hitImg + yn);

        if(yn.equals("Y")){
            hitUpdateMapper.UpdateHitY(hitImg);
        }else{
            hitUpdateMapper.UpdateHitN(hitImg);
        }
        
        return succ;
    }
}