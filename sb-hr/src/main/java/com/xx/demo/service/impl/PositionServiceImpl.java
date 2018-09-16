package com.xx.demo.service.impl;


import com.xx.demo.mapper.PositionMapper;
import com.xx.demo.pojo.Position;
import com.xx.demo.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionMapper pm;

    @Override
    public void addPosition(Position position) {
        pm.addPosition(position);
    }

    @Override
    public void deletePosition(int sno) {
        pm.deletePosition(sno);
    }

    @Override
    public ArrayList<Position> queryPosition(Position position) {
        return pm.queryPosition(position);
    }

    @Override
    public void updatePosition(Position position) {
        pm.updatePosition(position);
    }
}
