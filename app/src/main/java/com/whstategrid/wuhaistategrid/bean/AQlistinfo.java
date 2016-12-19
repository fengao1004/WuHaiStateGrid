package com.whstategrid.wuhaistategrid.bean;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/8/17.
 */
public class AQlistinfo {
        public int number;
        public String porjectName;
        public int standard;
        public ArrayList<stringaddboolean> numberStandard ;
        public boolean isChoose = false;
        public AQlistinfo(int number, String porjectName, int standard, String[] numberStandard) {
            this.number = number;
            this.porjectName = porjectName;
            this.numberStandard =new ArrayList<>();
            for(int i = 0;i<numberStandard.length;i++){
                this.numberStandard.add(new stringaddboolean(numberStandard[i]));
            }
            this.standard = standard;
        }
    public class stringaddboolean {
        public stringaddboolean(String name) {
            this.name = name;
        }

        public String name;
        public boolean ischoose = false;
    }



}
