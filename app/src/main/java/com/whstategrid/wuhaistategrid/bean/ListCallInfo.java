package com.whstategrid.wuhaistategrid.bean;

/**
 * Created by 冯傲 on 2016/8/14.
 * e-mail 897840134@qq.com
 */
public class ListCallInfo {
    public String usercode;
    public String username;
    public int role;
    public int page;

    public ListCallInfo(String usercode, String username, int role, int page) {
        this.usercode = usercode;
        this.username = username;
        this.role = role;
        this.page = page;

    }
}
