package com.whstategrid.wuhaistategrid.bean;

import java.util.ArrayList;

/**
 * Created by 冯傲 on 2016/8/14.
 * e-mail 897840134@qq.com
 */
public class ListResultInfo {
    public String status;
    public String msg;
    public ListContant data;

    public class ListContant {
        public int[] customPageArr;
        public ArrayList<ListCantantInfo> list;
    }

    public class ListCantantInfo {
        public int projecttype;
        public String projecttypename;
        public String guid;
        public String projectname;
        public String usercode;
        public String username;
        public Time createtime;
        public String filenumlist;
        public int issubmit;
        public int isdelete;
        public int page;
        public int[] pageArr;
        public int pageArrCount;
        public int pageSize;
        public int totalCount;
        public int totalPage;


    }

    public class Time {
        //date":1,"day":4,"hours":22,"minutes":34,"month":0,"seconds":35,"time":52475000,"timezoneOffset":-480,"year":70},
        public int date;
        public int day;
        public int hours;
        public int seconds;
        public long time;
        public int minutes;
        public int timezoneOffset;
        public int yera;
        public int month;
    }

}
