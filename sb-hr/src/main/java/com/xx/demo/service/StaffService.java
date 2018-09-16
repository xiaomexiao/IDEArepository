package com.xx.demo.service;

import com.xx.demo.pojo.Staff;

import java.util.ArrayList;

public interface StaffService {
    ArrayList<Staff> queryByPosition(Staff staff);
}
