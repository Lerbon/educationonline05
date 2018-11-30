package com.atguigu.education.portalservice.service.impl;

import com.atguigu.education.bean.Lession;
import com.atguigu.education.portalservice.dao.EducationDao;
import com.atguigu.education.portalservice.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author York
 * @create 2018-11-29 20:11
 */
@Service
public class EducationServiceImpl implements EducationService {

    @Autowired
    private EducationDao educationDao;
    @Override
    public List<Lession> getAllEducation() {
        return educationDao.getAllEducation();
    }
}
