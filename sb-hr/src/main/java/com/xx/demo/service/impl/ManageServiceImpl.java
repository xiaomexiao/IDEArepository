package com.xx.demo.service.impl;

import com.xx.demo.mapper.ManageMapper;
import com.xx.demo.pojo.Manage;
import com.xx.demo.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManageServiceImpl implements ManageService {
    @Autowired
    ManageMapper mm;


    @Override
    public void addManage(Manage manage) {
        mm.addManage(manage);
    }
}
