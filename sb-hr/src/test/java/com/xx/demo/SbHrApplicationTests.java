package com.xx.demo;

import com.xx.demo.mapper.PositionMapper;
import com.xx.demo.pojo.Position;
import com.xx.demo.service.PositionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbHrApplicationTests {
    @Autowired
    PositionMapper pm;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testqueryPosition() {
        Position position = new Position();
        ArrayList<Position> positions = new ArrayList<>();
        positions = pm.queryPosition(position);
        System.out.println(positions);
    }

    @Test
    public void testaddPosition() {
        Position position = new Position();
        position.setSname("呵呵");
        position.setStype("部门");
        position.setSbz(23242);
        pm.addPosition(position);
    }

    @Test
    public void testupdatePosition() {
        Position position = new Position();
        position.setSno(5);
        position.setSname("zz");
        position.setStype("技术");
        position.setSbz(777777);
        pm.updatePosition(position);
        System.out.print(position.toString());
    }

    @Test
    public void testdeletePosition() {
        pm.deletePosition(9);
    }


}
