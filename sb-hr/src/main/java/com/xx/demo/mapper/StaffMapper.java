package com.xx.demo.mapper;

import com.xx.demo.pojo.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;


@Mapper
public interface StaffMapper {

    @Select("select * from staff_ where position =#{position}")
    ArrayList<Staff> queryByPositin(Staff staff);
}
