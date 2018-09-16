package com.xx.demo.controller;

import com.xx.demo.pojo.Talent;
import com.xx.demo.service.TalentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@RequestMapping("talent")
public class TalentController {

    @Autowired
    TalentService ts;

    @RequestMapping("queryTalent")
    public @ResponseBody
    ArrayList<Talent> queryTalent(@RequestBody Talent talent) {
        System.out.print(talent);
        return ts.queryTalent(talent);
    }
}
