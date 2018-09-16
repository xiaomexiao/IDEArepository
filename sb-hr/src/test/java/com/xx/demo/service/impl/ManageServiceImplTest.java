package com.xx.demo.service.impl;

import com.xx.demo.pojo.Manage;
import com.xx.demo.service.ManageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManageServiceImplTest {

    @Autowired
    ManageService ms;

    @Test
    public void testaddManage() {
        Manage manage = new Manage();
        manage.setIdentify(12312312);
        ms.addManage(manage);
        System.out.print(manage.getIdentify());
    }

}