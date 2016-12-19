package com.whstategrid.wuhaistategrid.bean;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/9/4.
 */
public class LDHQCinfo {
    public static final int TITLE = 1;
    public static final int CONTENT = 2;
    public int type;
    public String name;
    public String number;
    public ArrayList<stringaddboolean> pfbz;

    public LDHQCinfo(int type,String number,  String name) {
        this.type = type;
        this.name = name;
        this.number = number;
    }

    public boolean isChoose = false;

    public LDHQCinfo(int type, String name, String number, String[] pfbz) {
        this.pfbz = new ArrayList<>();
        this.type = type;
        this.name = name;
        this.number = number;
        for(int i = 0;i<pfbz.length;i++){
            this.pfbz.add(new stringaddboolean(pfbz[i]));
        }

    }
    public class stringaddboolean {
        public stringaddboolean(String name) {
            this.name = name;
        }
        public String name;
        public int ischoose = 0;
    }
}
