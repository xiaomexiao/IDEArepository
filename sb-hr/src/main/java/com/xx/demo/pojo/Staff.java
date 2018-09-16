package com.xx.demo.pojo;

public class Staff {
    private int sid;
    private String sname;
    private String sex;
    private String section;
    private String position;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Staff() {
    }

    public Staff(int sid, String sname, String sex, String section, String position) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.section = section;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", section='" + section + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
