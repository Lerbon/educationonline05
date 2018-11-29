package com.atguigu.education.protalweb.service;

import com.atguigu.education.bean.Lession;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author York
 * @create 2018-11-29 20:46
 */
@FeignClient("education-portal-service")
public interface EducationService {

    @RequestMapping("/education/getAllLession")
    public List<Lession> getAllEducation();
}
