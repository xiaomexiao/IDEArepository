package com.xx.demo.service;

import com.xx.demo.pojo.Position;

import java.util.ArrayList;

public interface PositionService {
    void addPosition(Position position);

    void deletePosition(int sno);

    ArrayList<Position> queryPosition(Position position);

    void updatePosition(Position position);
}
