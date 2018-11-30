package com.atguigu.education.portalservice.controller;

import com.atguigu.education.bean.Lession;
import com.atguigu.education.portalservice.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author York
 * @create 2018-11-29 20:10
 */
@RestController
public class DispatcherController {

    @Autowired
    private EducationService educationService;



    @RequestMapping("/education/getAllLession")
    public List<Lession> getAllEducation(){
        return educationService.getAllEducation();
    }
}
