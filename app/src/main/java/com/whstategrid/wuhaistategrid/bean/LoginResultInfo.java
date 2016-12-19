package com.whstategrid.wuhaistategrid.bean;

import java.util.ArrayList;

/**
 * Created by 冯傲 on 2016/8/14.
 * e-mail 897840134@qq.com
 */
public class LoginResultInfo {
    public String status;
    public String msg;
    public UserInfo data;

    public class UserInfo {
        public String username;
        public String password;
        public String usercode;
        public int role;
        public String guid;
    }

}
