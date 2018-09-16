package com.xx.demo.service.impl;

import com.xx.demo.mapper.StaffMapper;
import com.xx.demo.pojo.Staff;
import com.xx.demo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    StaffMapper sm;

    @Override
    public ArrayList<Staff> queryByPosition(Staff staff) {
        return sm.queryByPositin(staff);
    }
}
