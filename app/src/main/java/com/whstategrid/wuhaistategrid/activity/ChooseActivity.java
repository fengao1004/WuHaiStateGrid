package com.whstategrid.wuhaistategrid.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.whstategrid.wuhaistategrid.R;
import com.whstategrid.wuhaistategrid.adapter.AQWMAdapter1;
import com.whstategrid.wuhaistategrid.adapter.JJFZAdapter;
import com.whstategrid.wuhaistategrid.adapter.LDHQdapter;
import com.whstategrid.wuhaistategrid.bean.AQWMSGJCB_Info;
import com.whstategrid.wuhaistategrid.bean.BZGYinfo;
import com.whstategrid.wuhaistategrid.bean.DBTCInfo;
import com.whstategrid.wuhaistategrid.bean.LDHQCinfo;
import com.whstategrid.wuhaistategrid.bean.ProjectInfo;
import com.whstategrid.wuhaistategrid.bean.UpInfo;
import com.whstategrid.wuhaistategrid.bean.UprestleInfo;
import com.whstategrid.wuhaistategrid.modle.Constant;
import com.whstategrid.wuhaistategrid.modle.Constant_AQWMSGJCB_MAX;
import com.whstategrid.wuhaistategrid.modle.Constant_BZGYPJ;
import com.whstategrid.wuhaistategrid.modle.Constant_DBTC;
import com.whstategrid.wuhaistategrid.modle.Constant_LDHQ;
import com.whstategrid.wuhaistategrid.modle.UpDataStatus;
import com.whstategrid.wuhaistategrid.util.OkHttpUtil;
import com.whstategrid.wuhaistategrid.util.UrlContant;
import com.whstategrid.wuhaistategrid.view.DialogCancle;
import com.whstategrid.wuhaistategrid.view.DialogUp;

import java.io.IOException;
import java.util.ArrayList;

public class ChooseActivity extends AppCompatActivity {
    static ChooseActivity choos;
    private LinearLayout ll_choose;

    public static ChooseActivity getChooseActivity() {

        return choos;
    }

    final int JJXM = 0;
    final int AQWM = 1;
    final int BZGY = 2;
    final int LDHQ = 3;
    final int DBTC = 4;

    String projectname;
    static String usercode;
    static String username;
    int SUCESS = 100;
    int item;
    private ImageView content_exit;
    private RecyclerView list_content;
    static ArrayList<ProjectInfo> list = new ArrayList<ProjectInfo>();
    private FloatingActionButton fab_up;
    private TextView tv_xm;
    private static ArrayList<AQWMSGJCB_Info> list2;
    private static ArrayList<ArrayList<BZGYinfo>> list3;
    private static ArrayList<ArrayList<LDHQCinfo>> list4;
    private static ArrayList<ArrayList<DBTCInfo>> list5;

    public static String getUsername() {
        return username;
    }

    public static String getUsercode() {
        return usercode;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        choos = this;
        Intent intent = getIntent();
        projectname = intent.getStringExtra("proname");
        usercode = intent.getStringExtra("usercod");
        username = intent.getStringExtra("username");
        item = intent.getIntExtra("item", 0);
        initView();
    }

    public static ArrayList<AQWMSGJCB_Info> gelist2() {

        return list2;
    }

    public static ArrayList<ArrayList<BZGYinfo>> gelist3() {

        return list3;
    }

    public static ArrayList<ArrayList<LDHQCinfo>> gelist4() {

        return list4;
    }

    public static ArrayList<ArrayList<DBTCInfo>> gelist5() {

        return list5;
    }


    private void updata(String contetn) {
        UpInfo info = new UpInfo(projectname, contetn, usercode, username, "基建项目辅助管理系统安全、质量管理功能清单及审批流程", 1);
        Gson gson = new Gson();
        String json = gson.toJson(info);
        Log.i("fengao", "updata: " + json);
        json = json.toLowerCase();
        new OkHttpUtil().call(UrlContant.UPPROJECT, json, new OkHttpUtil.OkHttpCallBack() {
            @Override
            public void sucess(Response response) {
                String string = "";
                try {
                    string = response.body().string();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                UprestleInfo uprestleInfo = new Gson().fromJson(string, UprestleInfo.class);
                if (uprestleInfo.status.equals("true")) {
                    setResult(1);
                    finish();
                } else {
                    setResult(2, new Intent().putExtra("msg", uprestleInfo.msg));
                    finish();
                }


            }


            @Override
            public void error(Request request, IOException e) {

                setResult(2, new Intent().putExtra("msg", "上传失败"));
                finish();
            }
        });


    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
            final DialogCancle.Builder builder = new DialogCancle.Builder(ChooseActivity.this);
            builder.setOnClick(new DialogCancle.onUpClickListener() {
                @Override
                public void onClick() {
                    setResult(2, new Intent().putExtra("msg", "取消创建"));
                    finish();
                }
            });
            builder.create().show();
            return true;
        } else
            return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == UpDataStatus.SUCESS) {
            setResult(1);
            finish();
            //设置result 并关闭
        } else if (resultCode == UpDataStatus.FAILURE) {
            //返回msg
            setResult(2, new Intent().putExtra("msg", data.getStringExtra("msg")));
            finish();
        }
    }

    private void initView() {
        ll_choose = (LinearLayout) findViewById(R.id.ll_choose);
        tv_xm = (TextView) findViewById(R.id.tv_xm);
        tv_xm.setText(getIntent().getStringExtra("proname"));
        fab_up = (FloatingActionButton) findViewById(R.id.fab_up);
        if (item == JJXM) {
            fab_up.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final DialogUp.Builder builder = new DialogUp.Builder(ChooseActivity.this);
                    builder.setOnClick(new DialogUp.onUpClickListener() {
                        @Override
                        public void onClick() {
                            String contetn = "";
                            for (int i = 0; i < list.size(); i++) {
                                if (list.get(i).isChoose) {
                                    contetn = contetn + list.get(i).number + ",";
                                }
                                if (list.get(i).isChoose2) {
                                    contetn = contetn + list.get(i).number + "_,";
                                }
                            }
                            Log.i("fengao", "onClick: " + contetn);
                            updata(contetn);

                        }
                    });
                    builder.create().show();
                }
            });
        } else {
            fab_up.setVisibility(View.GONE);
        }


        list_content = (RecyclerView) findViewById(R.id.list_choose);
        list_content.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        switch (item) {
            case JJXM:
                ll_choose.setVisibility(View.VISIBLE);
                list = new Constant().getlist();
                list_content.setAdapter(new JJFZAdapter(this, list));
                break;
            case AQWM:
                ll_choose.setVisibility(View.GONE);
                list2 = Constant_AQWMSGJCB_MAX.getAQWMSGJCB_InfoByName();
                String[] listNames = new String[27];
                for (int i = 0; i < 27; i++) {
                    listNames[i] = list2.get(i).listname;
                }
                list_content.setAdapter(new AQWMAdapter1(ChooseActivity.this, listNames, projectname, "edit", item));
                break;
            case BZGY:
                ll_choose.setVisibility(View.GONE);
                list3 = Constant_BZGYPJ.getBZGYPJs();
                String[] names = Constant_BZGYPJ.names;
                list_content.setAdapter(new AQWMAdapter1(ChooseActivity.this, names, projectname, "edit", item));
                break;
            case LDHQ:
                ll_choose.setVisibility(View.GONE);
                list4 = Constant_LDHQ.getLDHQinfos();
                String[] namesldhq = Constant_LDHQ.names;
                list_content.setAdapter(new AQWMAdapter1(ChooseActivity.this, namesldhq, projectname, "edit", item));
                break;
            case DBTC:
                ll_choose.setVisibility(View.GONE);
                list5 = Constant_DBTC.getDBTCinfos();
                String[] namesdbtc = Constant_DBTC.names;
                list_content.setAdapter(new AQWMAdapter1(ChooseActivity.this, namesdbtc, projectname, "edit", item));
                break;
        }


    }


}

