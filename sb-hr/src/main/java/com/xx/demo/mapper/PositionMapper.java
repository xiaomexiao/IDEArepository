package com.xx.demo.mapper;

import com.xx.demo.pojo.Position;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface PositionMapper {
    @Insert("insert position_(sno,sname,stype,sbz) values(#{sno},#{sname},#{stype},#{sbz})")
    void addPosition(Position position);

    @Delete("delete from position_ where sno=#{sno}")
    void deletePosition(@Param("sno") int sno);

    @Select("<script>" +
            "select * from position_" +
            "<where>" +
            "<if test=\"sname != null and sname!=''\">and sname=#{sname}</if> " +
            "<if test=\"sno != 0\">and sno=#{sno}</if>" +
            "<if test=\"stype!=null and stype!=''\">and stype=#{stype}</if>" +
            "</where>" +
            "</script>")
    ArrayList<Position> queryPosition(Position position);

    @Update("update position_ set sname=#{sname},stype=#{stype},sbz=#{sbz} where sno=#{sno}")
    void updatePosition(Position position);
}
