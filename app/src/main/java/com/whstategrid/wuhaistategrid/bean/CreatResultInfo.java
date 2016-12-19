package com.whstategrid.wuhaistategrid.bean;

/**
 * Created by 冯傲 on 2016/8/14.
 * e-mail 897840134@qq.com
 */
public class CreatResultInfo {
    public String status;
    public String msg;
    public ListCantantInfo1 data;
    public class ListCantantInfo1 {
        public String guid;
        public String projectname;
        public String usercode;
        public String username;
        public Time createtime;
        public String filenumlist;
        int issubmit;
        int isdelete;
    }
    public class Time {
        //date":1,"day":4,"hours":22,"minutes":34,"month":0,"seconds":35,"time":52475000,"timezoneOffset":-480,"year":70},
        public   int date;
        public   int day;
        public   int hours;
        public  int seconds;
        public  long time;
        public  int minutes;
        public int timezoneOffset;
        public  int yera;
        public  int month;
    }
}
