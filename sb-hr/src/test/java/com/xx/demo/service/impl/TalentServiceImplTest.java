package com.xx.demo.service.impl;

import com.xx.demo.pojo.Talent;
import com.xx.demo.service.TalentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TalentServiceImplTest {
    @Autowired
    TalentService ts;

    @Test
    public void testqueryTalent() {
        Talent talent = new Talent();
        ArrayList<Talent> talents = new ArrayList<>();
        talents = ts.queryTalent(talent);
        System.out.print(talents.toString());
    }

}