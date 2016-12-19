package com.whstategrid.wuhaistategrid.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.whstategrid.wuhaistategrid.R;
import com.whstategrid.wuhaistategrid.bean.AQWMSGJCB_Info;
import com.whstategrid.wuhaistategrid.bean.BZGYinfo;
import com.whstategrid.wuhaistategrid.bean.DBTCInfo;
import com.whstategrid.wuhaistategrid.bean.LDHQCinfo;
import com.whstategrid.wuhaistategrid.bean.UpInfo;
import com.whstategrid.wuhaistategrid.bean.UprestleInfo;
import com.whstategrid.wuhaistategrid.fragment.RecyclerFragment;
import com.whstategrid.wuhaistategrid.modle.Constant_AQWMSGJCB_MAX;
import com.whstategrid.wuhaistategrid.modle.Constant_BZGYPJ;
import com.whstategrid.wuhaistategrid.modle.Constant_DBTC;
import com.whstategrid.wuhaistategrid.modle.Constant_LDHQ;
import com.whstategrid.wuhaistategrid.util.OkHttpUtil;
import com.whstategrid.wuhaistategrid.util.UrlContant;
import com.whstategrid.wuhaistategrid.view.DialogUp;

import java.io.IOException;
import java.util.ArrayList;

public class Choose2Activity extends AppCompatActivity {
    String TAG = "fengao";
    private ViewPager viewPager;
    static ArrayList<AQWMSGJCB_Info> list;
    static ArrayList<ArrayList<BZGYinfo>> list2;
    static ArrayList<ArrayList<LDHQCinfo>> list3;
    static ArrayList<ArrayList<DBTCInfo>> list4;

    int position;
    String projectname;
    String type;
    String filenumlist;
    private LinearLayout ll_choose2;
    private TextView tv_name_choose2_top;
    private FloatingActionButton fab_up;
    final int AQWM = 1;
    final int JJXM = 0;
    final int BZGY = 2;
    final int LDHQ = 3;
    final int DBTC = 4;
    int item;
    private View view2;
    private View view1;
    private TextView tv_name_choose3_top;
    private TextView tv_name_choose4_top;
    private TextView tv_name_choose5_top;
    private TextView tv_name_choose6_top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose2);
        Intent intent = getIntent();
        type = intent.getStringExtra("type");
        projectname = intent.getStringExtra("projectname");
        item = intent.getIntExtra("item", 0);
        filenumlist = ContentActivity.getfilenumlist();
        if (type.equals("show") && item == AQWM) {
            list = Constant_AQWMSGJCB_MAX.getAQWMSGJCB_InfoByName();
        } else if (type.equals("edit") && item == AQWM) {
            list = ChooseActivity.gelist2();
        } else if (type.equals("show") && item == BZGY) {
            list2 = Constant_BZGYPJ.getBZGYPJs();
        } else if (type.equals("edit") && item == BZGY) {
            list2 = ChooseActivity.gelist3();
        } else if (type.equals("show") && item == LDHQ) {
            list3 = Constant_LDHQ.getLDHQinfos();
        } else if (type.equals("edit") && item == LDHQ) {
            list3 = ChooseActivity.gelist4();
        } else if (type.equals("edit") && item == DBTC) {
            list4 = ChooseActivity.gelist5();
        } else if (type.equals("show") && item == DBTC) {
            list4 = Constant_DBTC.getDBTCinfos();
        }
        position = intent.getIntExtra("position", 0);
        initView();
    }

    private void initView() {
        TextView tv_xm = (TextView) findViewById(R.id.tv_xm);
        tv_xm.setText(projectname);
        viewPager = (ViewPager) findViewById(R.id.choose_list2_contant);
        ll_choose2 = (LinearLayout) findViewById(R.id.ll_choose2);
        initAQWM();

    }

    private void updata(String contetn) {
        String usercode = ChooseActivity.getUsercode();
        String username = ChooseActivity.getUsername();
        UpInfo info = null;
        if (item == AQWM) {
            info = new UpInfo(projectname, contetn, usercode, username, "安全文明施工检查表", 2);
        } else if (item == BZGY) {
            info = new UpInfo(projectname, contetn, usercode, username, "标准工艺评价表和评分表", 3);
        } else if (item == LDHQ) {
            info = new UpInfo(projectname, contetn, usercode, username, "流动红旗竞赛检查表", 4);
        } else if (item == DBTC) {
            info = new UpInfo(projectname, contetn, usercode, username, "输变电工程优质工程评定检查表", 5);
        }
        Gson gson = new Gson();
        String json = gson.toJson(info);
        Log.i(TAG, "updata: " + json);
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
                    setResult(100);
                    finish();
                } else {
                    setResult(200, new Intent().putExtra("msg", uprestleInfo.msg));
                    finish();
                }


            }


            @Override
            public void error(Request request, IOException e) {

                setResult(200, new Intent().putExtra("msg", "上传失败"));
                finish();
            }
        });


    }

    private void initAQWM() {
        switch (item) {
            case AQWM:
                View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.top_chooose2, null);
                tv_name_choose2_top = (TextView) view.findViewById(R.id.tv_name_choose2_top);
                tv_name_choose2_top.setText(list.get(position).listname);
                ll_choose2.removeAllViews();
                ll_choose2.addView(view);
                break;
            case BZGY:
                view1 = LayoutInflater.from(getApplicationContext()).inflate(R.layout.top_chooose3, null);
                view2 = LayoutInflater.from(getApplicationContext()).inflate(R.layout.top_chooose4, null);
                tv_name_choose3_top = (TextView) view1.findViewById(R.id.tv_name_choose3_top);
                tv_name_choose4_top = (TextView) view2.findViewById(R.id.tv_name_choose4_top);
                if (position == 0) {
                    tv_name_choose3_top.setText(Constant_BZGYPJ.names[position]);
                    ll_choose2.removeAllViews();
                    ll_choose2.addView(view1);
                } else {
                    tv_name_choose4_top.setText(Constant_BZGYPJ.names[position]);
                    ll_choose2.removeAllViews();
                    ll_choose2.addView(view2);
                }
                break;
            case LDHQ:
                View view5 = LayoutInflater.from(getApplicationContext()).inflate(R.layout.top_chooose5, null);
                tv_name_choose5_top = (TextView) view5.findViewById(R.id.tv_name_choose5_top);
                tv_name_choose5_top.setText(Constant_LDHQ.names[position]);
                ll_choose2.removeAllViews();
                ll_choose2.addView(view5);
                break;
            case DBTC:
                View view6 = LayoutInflater.from(getApplicationContext()).inflate(R.layout.top_chooose6, null);
                tv_name_choose6_top = (TextView) view6.findViewById(R.id.tv_name_choose6_top);
                tv_name_choose6_top.setText(Constant_DBTC.names[position]);
                ll_choose2.removeAllViews();
                ll_choose2.addView(view6);
                break;
        }


        fab_up = (FloatingActionButton) findViewById(R.id.fab_up);
        if (type.equals("show")) {
            fab_up.setVisibility(View.GONE);
        } else {
            fab_up.setVisibility(View.VISIBLE);
            fab_up.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final DialogUp.Builder builder = new DialogUp.Builder(Choose2Activity.this);
                    builder.setOnClick(new DialogUp.onUpClickListener() {
                        @Override
                        public void onClick() {
                            String contetn = "";
                            if (item == AQWM) {
                                for (int i = 0; i < list.size(); i++) {
                                    for (int j = 0; j < list.get(i).list.size(); j++) {
                                        for (int k = 0; k < list.get(i).list.get(j).numberStandard.size(); k++) {
                                            if (list.get(i).list.get(j).numberStandard.get(k).ischoose) {
                                                contetn += "@" + i + j + k + "##";
                                            }
                                        }
                                    }
                                }
                            } else if (item == BZGY) {
                                for (int i = 0; i < list2.size(); i++) {
                                    if (i == 0) {
                                        for (int j = 0; j < list2.get(0).size(); j++) {
                                            for (int k = 0; k < list2.get(0).get(j).pfbz.size(); k++) {
                                                if (list2.get(0).get(j).pfbz.get(k).ischoose == 1) {
                                                    contetn += "@" + 0 + j + k + "T##";
                                                } else if (list2.get(0).get(j).pfbz.get(k).ischoose == 2) {
                                                    contetn += "@" + 0 + j + k + "F##";
                                                }
                                            }
                                        }
                                    } else {
                                        for (int j = 0; j < list2.get(i).size(); j++) {
                                            if (list2.get(i).get(j).isChoose == 1) {
                                                contetn += "@" + i + j + "T##";
                                            } else if (list2.get(i).get(j).isChoose == 2) {
                                                contetn += "@" + i + j + "F##";
                                            }
                                        }
                                    }
                                }
                            } else if (item == LDHQ) {
                                for (int i = 0; i < list3.size(); i++) {
                                    for (int j = 0; j < list3.get(i).size(); j++) {
                                        if (list3.get(i).get(j).type == 2) {
                                            for (int k = 0; k < list3.get(i).get(j).pfbz.size(); k++) {
                                                if (list3.get(i).get(j).pfbz.get(k).ischoose == 1) {
                                                    contetn += "@" + i + j + k + "T##";
                                                } else if (list3.get(i).get(j).pfbz.get(k).ischoose == 2) {
                                                    contetn += "@" + i + j + k + "F##";
                                                }
                                            }
                                        }

                                    }
                                }
                            } else if (item == DBTC) {
                                for (int i = 0; i < list4.size(); i++) {
                                    for (int j = 0; j < list4.get(i).size(); j++) {
                                        if (list4.get(i).get(j).type == 2) {
                                            if (list4.get(i).get(j).isChoose == 1) {
                                                contetn += "@" + i + j + "T##";
                                            } else if (list4.get(i).get(j).isChoose == 2) {
                                                contetn += "@" + i + j + "F##";
                                            }
                                        }
                                    }
                                }
                            }
                            Log.i(TAG, "onClick: " + contetn);
                            updata(contetn);
                        }
                    });
                    builder.create().show();
                }


            });
        }

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (item == AQWM) {
                    tv_name_choose2_top.setText(list.get(position).listname);
                } else if (item == BZGY) {
                    tv_name_choose3_top.setText(Constant_BZGYPJ.names[position]);
                    tv_name_choose4_top.setText(Constant_BZGYPJ.names[position]);
                    if (position == 0) {
                        ll_choose2.removeAllViews();
                        ll_choose2.addView(view1);
                    } else {
                        ll_choose2.removeAllViews();
                        ll_choose2.addView(view2);
                    }
                } else if (item == LDHQ) {
                    tv_name_choose5_top.setText(Constant_LDHQ.names[position]);
                }else if(item == DBTC){
                    tv_name_choose6_top.setText(Constant_DBTC.names[position]);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));
        viewPager.setCurrentItem(position);
    }


    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Log.i(TAG, "getItem: ");
            if (item == AQWM) {
                return new RecyclerFragment(viewPager, list.get(position), position, type, item);
            } else if (item == BZGY) {
                Log.i(TAG, "getItem: " + list2.get(3));
                return new RecyclerFragment(viewPager, list2.get(position), position, type, item, null);
            } else if (item == LDHQ) {
                Log.i(TAG, "getItem: " + "流动红旗表");
                return new RecyclerFragment(viewPager, list3.get(position), position, type, item, null);
            }else if(item == DBTC){
                return new RecyclerFragment(viewPager, list4.get(position), position, type, item, null);
            }
            return null;
        }

        @Override
        public int getCount() {
            if (item == AQWM) {
                return list.size();

            } else if (item == BZGY) {
                int a = list2.size();
                return a;

            } else if (item == LDHQ) {
                int a = list3.size();
                return a;
            }else if(item == DBTC){
                int a = list4.size();
                return a;
            }
            return 0;
        }
    }
}
