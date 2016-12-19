package com.whstategrid.wuhaistategrid.bean;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/9/4.
 */
public class SBDGCinfo {
    public String name ;
    public String[] pfbz;
    public boolean isChoose;

    public SBDGCinfo(String name, boolean isChoose, String[] pfbz) {
        this.name = name;
        this.isChoose = isChoose;
        this.pfbz = pfbz;
    }
}
