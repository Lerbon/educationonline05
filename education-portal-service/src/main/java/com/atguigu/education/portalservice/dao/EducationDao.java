package com.atguigu.education.portalservice.dao;

import com.atguigu.education.bean.Lession;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author York
 * @create 2018-11-29 20:15
 */
@Mapper
public interface EducationDao {

    @Select("select * from e_lession")
    List<Lession> getAllEducation();
}
