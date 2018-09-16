package com.xx.demo.service.impl;

import com.xx.demo.pojo.Staff;
import com.xx.demo.service.StaffService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StaffServiceImplTest {
    @Autowired
    StaffService ss;

    @Test
    public void testqueryByPosition() {
        Staff staff = new Staff();
        ArrayList<Staff> staffs = new ArrayList<>();
        staffs = ss.queryByPosition(staff);
        System.out.print(staffs);
    }
}