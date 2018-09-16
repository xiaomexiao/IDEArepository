package com.xx.demo.controller;

import com.xx.demo.pojo.Manage;
import com.xx.demo.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("manage")
public class ManageController {

    @Autowired
    ManageService ms;

    @RequestMapping("addManage")
    public ModelAndView addManage(Manage manage) {
        ModelAndView mav = new ModelAndView();
        ms.addManage(manage);
        return mav;
    }
}
