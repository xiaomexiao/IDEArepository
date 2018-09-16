package com.xx.demo.service.impl;

import com.xx.demo.mapper.TalentMapper;
import com.xx.demo.pojo.Talent;
import com.xx.demo.service.TalentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TalentServiceImpl implements TalentService {
    @Autowired
    TalentMapper tm;

    @Override
    public ArrayList<Talent> queryTalent(Talent talent) {
        return tm.queryTalent(talent);
    }
}
