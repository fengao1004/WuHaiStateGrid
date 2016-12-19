package com.whstategrid.wuhaistategrid.activity;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.gson.Gson;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.whstategrid.wuhaistategrid.R;
import com.whstategrid.wuhaistategrid.bean.AQWMSGJCB_Info;
import com.whstategrid.wuhaistategrid.bean.LoginInfo;
import com.whstategrid.wuhaistategrid.bean.LoginResultInfo;
import com.whstategrid.wuhaistategrid.modle.Constant_AQWMSGJCB_MAX;
import com.whstategrid.wuhaistategrid.util.OkHttpUtil;
import com.whstategrid.wuhaistategrid.util.SharedPreferencesUtils;
import com.whstategrid.wuhaistategrid.util.UrlContant;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText et_username;
    private EditText et_password;
    private ProgressBar progress;
    private ImageView iv_back;
    String TAG = "fengao";
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            progress.setVisibility(View.GONE);
            iv_back.setVisibility(View.GONE);
            if (msg.what != 1) {
                Toast.makeText(getApplicationContext(), msg.obj.toString(), 0).show();
            } else {
                Toast.makeText(getApplicationContext(), "登录失败", 0).show();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intiView();
    }

    private void intiView() {
        et_username = (EditText) findViewById(R.id.et_username);
        et_password = (EditText) findViewById(R.id.et_password);
        String name = (String) SharedPreferencesUtils.getParam(getApplicationContext(), "name", "");
        et_username.setText(name);
        String password = (String) SharedPreferencesUtils.getParam(getApplicationContext(), "password", "");
        et_password.setText(password);
        progress = (ProgressBar) findViewById(R.id.progress);
        iv_back = (ImageView) findViewById(R.id.iv_back);
    }

    public void login(View v) {
        String name = et_username.getText().toString().trim();
        String password = et_password.getText().toString().trim();
        if (name.equals("")) {
            Toast.makeText(getApplicationContext(), "用户名不能为空", 0).show();
            return;
        } else if (password.equals("")) {
            Toast.makeText(getApplicationContext(), "密码不能为空", 0).show();
            return;
        }
        startlogin(name, password);
    }

    public void saveUsernameAndPassword() {
        String name = et_username.getText().toString().trim();
        String password = et_password.getText().toString().trim();
        SharedPreferencesUtils.setParam(getApplicationContext(), "name", name);
        SharedPreferencesUtils.setParam(getApplicationContext(), "password", password);
    }

    public void removePassword() {
        SharedPreferencesUtils.setParam(getApplicationContext(), "password", "");
        //et_password.setText("");
    }

    private void startlogin(String name, String word) {
        progress.setVisibility(View.VISIBLE);
        iv_back.setVisibility(View.VISIBLE);
        LoginInfo loginInfo = new LoginInfo(name, word);
        Gson gson = new Gson();
        String json = gson.toJson(loginInfo);
        new OkHttpUtil().call(UrlContant.LOGIN, json, new OkHttpUtil.OkHttpCallBack() {
            @Override
            public void sucess(Response response) {
                try {
                    saveUsernameAndPassword();
                    String json = response.body().string();
                    Log.i(TAG, "sucess: " + json);
                    LoginResultInfo loginResultInfo = new Gson().fromJson(json, LoginResultInfo.class);
                    if (loginResultInfo.status.equals("true")) {
                        Intent intent = new Intent(MainActivity.this, ListActivity.class);
                        intent.putExtra("usercode", loginResultInfo.data.usercode);
                        intent.putExtra("username", loginResultInfo.data.username);
                        intent.putExtra("role", loginResultInfo.data.role);
                        startActivity(intent);
                        finish();
                    } else {
                        removePassword();
                        Message message = new Message();
                        message.obj = loginResultInfo.msg;
                        handler.sendMessage(message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void error(Request request, IOException e) {
                removePassword();
                handler.sendEmptyMessage(1);
            }
        });

    }


}
