package com.atguigu.education.protalweb.controller;

import com.atguigu.education.bean.Lession;
import com.atguigu.education.protalweb.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author York
 * @create 2018-11-29 20:45
 */
@Controller
public class DispatcherController {

    @Autowired
    private EducationService educationService;

    @ResponseBody
    @RequestMapping("/education/getAllLession")
    public List<Lession> getAllLession(){

        List<Lession> allEducation = educationService.getAllEducation();
        return allEducation;
    }

}
