package com.xx.demo.pojo;

public class Manage {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int yid;
    private String name;
    private String sex;
    private String birthday;
    private int identify;
    private String position;
    private String section;
    private String shape;
    private String ysource;
    private String ygdate;
    private String ycdate;
    private String shiyong;
    private String shiyongs;
    private String shiyongf;

    public int getYid() {
        return yid;
    }

    public void setYid(int yid) {
        this.yid = yid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getIdentify() {
        return identify;
    }

    public void setIdentify(int identify) {
        this.identify = identify;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getYsource() {
        return ysource;
    }

    public void setYsource(String ysource) {
        this.ysource = ysource;
    }

    public String getYgdate() {
        return ygdate;
    }

    public void setYgdate(String ygdate) {
        this.ygdate = ygdate;
    }

    public String getYcdate() {
        return ycdate;
    }

    public void setYcdate(String ycdate) {
        this.ycdate = ycdate;
    }

    public String getShiyong() {
        return shiyong;
    }

    public void setShiyong(String shiyong) {
        this.shiyong = shiyong;
    }

    public String getShiyongs() {
        return shiyongs;
    }

    public void setShiyongs(String shiyongs) {
        this.shiyongs = shiyongs;
    }

    public String getShiyongf() {
        return shiyongf;
    }

    public void setShiyongf(String shiyongf) {
        this.shiyongf = shiyongf;
    }

    public Manage() {
    }

    public Manage(int yid, String name, String sex, String birthday, int identify, String position, String section, String shape, String ysource, String ygdate, String ycdate, String shiyong, String shiyongs, String shiyongf) {
        this.yid = yid;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.identify = identify;
        this.position = position;
        this.section = section;
        this.shape = shape;
        this.ysource = ysource;
        this.ygdate = ygdate;
        this.ycdate = ycdate;
        this.shiyong = shiyong;
        this.shiyongs = shiyongs;
        this.shiyongf = shiyongf;
    }

    @Override
    public String toString() {
        return "Manage{" +
                "yid=" + yid +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", identify=" + identify +
                ", position='" + position + '\'' +
                ", section='" + section + '\'' +
                ", shape='" + shape + '\'' +
                ", ysource='" + ysource + '\'' +
                ", ygdate='" + ygdate + '\'' +
                ", ycdate='" + ycdate + '\'' +
                ", shiyong='" + shiyong + '\'' +
                ", shiyongs='" + shiyongs + '\'' +
                ", shiyongf='" + shiyongf + '\'' +
                '}';
    }
}
