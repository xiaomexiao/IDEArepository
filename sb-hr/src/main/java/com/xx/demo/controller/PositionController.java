package com.xx.demo.controller;

import com.xx.demo.pojo.Position;
import com.xx.demo.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("position")
public class PositionController {
    @Autowired
    PositionService ps;

    @RequestMapping("addPosition")
    public ModelAndView addPosition(Position position) {
        ps.addPosition(position);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("position_modify");
        return mav;
    }

    @RequestMapping("queryPosition")
    public @ResponseBody
    ArrayList<Position> queryPosition(@RequestBody Position position) {
        System.out.print(ps.queryPosition(position));
        return ps.queryPosition(position);
    }

    @RequestMapping("updatePosition")
    public ModelAndView updatePosition(Position position) {
        ps.updatePosition(position);
        ModelAndView mav = new ModelAndView("redirect:http://127.0.0.1:8080/position/position_modify.html");
        return mav;
    }


    //加了@@RequestParam("***"),就可以接受前台checkbox的值了
    //Integer[]接受数组，删除多个checkbox
    @RequestMapping("deletePosition")
    public ModelAndView deletePosition(@RequestParam("check") Integer[] sno) {
        for (int i = 0; i < sno.length; i++) {
            System.out.print("要删除的:" + sno[i]);
            ps.deletePosition(sno[i]);
        }
        ModelAndView mav = new ModelAndView("redirect:http://127.0.0.1:8080/position/position_modify.html");
        return mav;
    }


}
