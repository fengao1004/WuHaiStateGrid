package com.whstategrid.wuhaistategrid.bean;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/9/4.
 */
public class BZGYinfo {
    public String zhuanYe;
    public String number;
    public String name;
    public ArrayList<stringaddboolean> pfbz;
    public String biaoZhun;
    public int isChoose=0;

    public BZGYinfo(String zhuanYe, String number, String name, String biaoZhun) {
        this.zhuanYe = zhuanYe;
        this.number = number;
        this.name = name;
        this.biaoZhun = biaoZhun;
    }

    public BZGYinfo(String[] pfbz, String name) {
        this.pfbz = new ArrayList<>();
        this.name = name;
        for(int i = 0;i<pfbz.length;i++){
            this.pfbz.add(new stringaddboolean(pfbz[i]));
        }
    }
    public class stringaddboolean {
        public stringaddboolean(String name) {
            this.name = name;
        }
        public String name;
        //public boolean ischoose = false;
        public int ischoose = 0;
    }
}
