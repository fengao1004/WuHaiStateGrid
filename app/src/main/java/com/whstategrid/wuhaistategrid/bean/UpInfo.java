package com.whstategrid.wuhaistategrid.bean;

/**
 * Created by 冯傲 on 2016/8/14.
 * e-mail 897840134@qq.com
 */
public class UpInfo {
    public String projectname;
    public String fileNumList;
    public String usercode;
    public String username;
    public String projecttypename;
    public int projecttype;

    public UpInfo(String projectname, String fileNumList,String usercode,String username,String projecttypename,int projecttype) {
        this.fileNumList = fileNumList;
        this.projectname =projectname;
        this.usercode =usercode;
        this.username=username;
        this.projecttypename = projecttypename;
        this.projecttype = projecttype;
    }
}
