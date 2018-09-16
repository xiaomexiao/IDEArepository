package com.xx.demo.controller;

import com.xx.demo.pojo.Staff;
import com.xx.demo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

//岗位下员工控制类
@Controller
@RequestMapping("staff")
public class StaffController {
    @Autowired
    StaffService ss;

    @RequestMapping("queryStaff")
    public @ResponseBody
    ArrayList<Staff> queryStaff(@RequestBody Staff staff) {
        return ss.queryByPosition(staff);
    }
}



