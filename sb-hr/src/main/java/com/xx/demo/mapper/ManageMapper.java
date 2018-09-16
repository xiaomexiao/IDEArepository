package com.xx.demo.mapper;

import com.xx.demo.pojo.Manage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ManageMapper {

    @Insert("insert into manage_(yid,name,sex,birthday,identify,position,section,shape,ysource,ygdate,ycdate,shiyong,shiyongs,shiyongf) " +
            "values(#{yid},#{name},#{sex},#{birthday},#{identify},#{position},#{section},#{shape},#{ysource},#{ygdate},#{ycdate},#{shiyong},#{shiyongs},#{shiyongf})")
    void addManage(Manage manage);
}
