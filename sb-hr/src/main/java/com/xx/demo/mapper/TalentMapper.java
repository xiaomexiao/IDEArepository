package com.xx.demo.mapper;

import com.xx.demo.pojo.Talent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface TalentMapper {

    @Select("<script>" +
            "select * from talent_" +
            "<where>" +
            "<if test=\"name != null and name != '' \"> and name=#{name}</if>" +
            "<if test=\"nid != 0 \"> and nid=#{nid}</if>" +
            "</where>" +
            "</script>")
    ArrayList<Talent> queryTalent(Talent talent);
}
