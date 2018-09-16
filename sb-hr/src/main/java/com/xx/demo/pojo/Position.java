package com.xx.demo.pojo;

public class Position {
    private int sno;
    private String sname;
    private String stype;
    private int sbz;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype;
    }

    public int getSbz() {
        return sbz;
    }

    public void setSbz(int sbz) {
        this.sbz = sbz;
    }

    @Override
    public String toString() {
        return "Position{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", stype='" + stype + '\'' +
                ", sbz=" + sbz +
                '}';
    }

    public Position() {
    }

    public Position(int sno, String sname, String stype, int sbz) {
        this.sno = sno;
        this.sname = sname;
        this.stype = stype;
        this.sbz = sbz;
    }
}
