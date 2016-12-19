package com.whstategrid.wuhaistategrid.bean;

/**
 * Created by Administrator on 2016/11/15.
 */
public class DBTCInfo {
    public static final int TITLE = 1;
    public static final int CONTENT = 2;
    public int type;
    public String number;
    public String name;
    public String pfbz;
    public String jcyq;
    public int isChoose;

    public DBTCInfo(String number, String name, String pfbz, String jcyq) {
        this.number = number;
        this.jcyq = jcyq;
        this.name = name;
        this.pfbz = pfbz;
        isChoose = 0;
        this.type = CONTENT;
    }

    public DBTCInfo(String number, String name) {
        this.name = name;
        this.number = number;
        this.type = TITLE;
    }
}
