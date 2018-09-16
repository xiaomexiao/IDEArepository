package com.xx.demo.pojo;

//人才基本信息
public class Talent {
    private int id;
    private String name;
    private int nid;
    private String sex;
    private String birthday;
    private String mailbox;

    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
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

    public Talent() {
    }

    public Talent(String name, int nid, String sex, String birthday) {
        this.name = name;
        this.nid = nid;
        this.sex = sex;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Talent{" +
                "name='" + name + '\'' +
                ", nid=" + nid +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
