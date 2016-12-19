package com.whstategrid.wuhaistategrid.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.whstategrid.wuhaistategrid.R;
import com.whstategrid.wuhaistategrid.bean.CratInfo;
import com.whstategrid.wuhaistategrid.bean.CreatResultInfo;
import com.whstategrid.wuhaistategrid.bean.ListCallInfo;
import com.whstategrid.wuhaistategrid.bean.ListResultInfo;
import com.whstategrid.wuhaistategrid.fragment.RecyclerFragment;
import com.whstategrid.wuhaistategrid.fragment.RecyclerFragmentList;
import com.whstategrid.wuhaistategrid.util.OkHttpUtil;
import com.whstategrid.wuhaistategrid.util.UrlContant;
import com.whstategrid.wuhaistategrid.view.DialogAdd;
import com.whstategrid.wuhaistategrid.view.DialogDemo;

import org.w3c.dom.Text;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static com.whstategrid.wuhaistategrid.view.DialogAdd.*;

public class ListActivity extends AppCompatActivity {
    ImageView exit;
    String json;
    ViewPager viewPager;
    String usercode;
    String Url = UrlContant.GETLIST;
    String username;
    long time;
    boolean iscall = false;
    Boolean more = false;
    ArrayList<ListResultInfo.ListCantantInfo> list;
    int role = 2;
    int page = 1;
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            //callurl
            if (msg.what == 2) {
                Toast.makeText(getApplicationContext(), "获取列表错误", 0).show();
            } else if (msg.what == 3) {
                Toast.makeText(getApplicationContext(), "创建工程成功", 0).show();
            } else if (msg.what == 4) {
                Toast.makeText(getApplicationContext(), "创建工程失败", 0).show();
            } else {
                viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));
            }
            // listview.setVisibility(View.VISIBLE);
            viewPager.setVisibility(View.VISIBLE);
            pb.setVisibility(View.GONE);
        }
    };

    private FloatingActionButton add;
    private ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        list = new ArrayList<>();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        Intent intent = getIntent();
        usercode = intent.getStringExtra("usercode");
        username = intent.getStringExtra("username");
        role = intent.getIntExtra("role", 2);
        Log.i("fengao", "onCreate: " + role);
        initview();
    }

    private void initview() {
        viewPager = (ViewPager) findViewById(R.id.vp_list);
        pb = (ProgressBar) findViewById(R.id.pb);
        findViewById(R.id.refersh).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refresh();
            }
        });
        add = (FloatingActionButton) findViewById(R.id.fab);
        //给领导开放权限 2016 09 07 fengao
//        if (role == 2) {
//            add.setVisibility(View.VISIBLE);
//        }
        add.setVisibility(View.VISIBLE);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Builder builder = new Builder(ListActivity.this);
                builder.setOnClick(new onUpClickListener() {
                    @Override
                    public void onClick(String name, int item) {
                        if (name == null || name.equals("")) {
                            Toast.makeText(getApplicationContext(), "请输入项目名称", 0).show();
                        } else {
                            openProject(name, item);
                        }
                    }
                });
                builder.create().show();
            }
        });
        initlist();
    }

    private void openProject(String name, int item) {
        Intent intent = new Intent(ListActivity.this, ChooseActivity.class);
        intent.putExtra("proname", name);
        intent.putExtra("usercod", usercode);
        intent.putExtra("username", username);
        intent.putExtra("item", item);
        startActivityForResult(intent, 0);

//        CratInfo cratInfo = new CratInfo(name, usercode, username);
//        Gson gson = new Gson();
//        String json = gson.toJson(cratInfo);
//        iscall = true;
//        Log.i("fengao", "openProject: " + json);
//        new OkHttpUtil().call(UrlContant.UPNAME, json, new OkHttpUtil.OkHttpCallBack() {
//            @Override
//            public void sucess(Response response) {
//                try {
//                    iscall = false;
//                    String json = response.body().string();
//                    Gson gson1 = new Gson();
//                    CreatResultInfo info = gson1.fromJson(json, CreatResultInfo.class);
//                    Intent intent = new Intent(ListActivity.this, ChooseActivity.class);
//                    intent.putExtra("proname", info.data.projectname);
//                    intent.putExtra("guid", info.data.guid);
//                    startActivityForResult(intent, 0);
//                    handler.sendEmptyMessage(3);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//
//            @Override
//            public void error(Request request, IOException e) {
//                iscall = false;
//                handler.sendEmptyMessage(4);
//
//            }
//        });

    }

    private void initlist() {
        pb.setVisibility(View.VISIBLE);

        viewPager.setVisibility(View.GONE);
        final ListCallInfo listCallInfo = new ListCallInfo(usercode, username, role, page);
        Gson gson = new Gson();
        String json = gson.toJson(listCallInfo);
        if (iscall) {

            Toast.makeText(getApplicationContext(), "请稍等,请求中", 0).show();
            return;
        }
        Log.i("fengao", "initlist: " + json);
        iscall = true;
        new OkHttpUtil().call(Url, json, new OkHttpUtil.OkHttpCallBack() {
            @Override
            public void sucess(Response response) {
                try {
                    iscall = false;
                    String json = response.body().string();
                    ListActivity.this.json = json;
                    Log.i("fengao", "sucess: " + json);
                    Gson gson1 = new Gson();
                    ListResultInfo info = gson1.fromJson(json, ListResultInfo.class);
                    list.clear();
                    // info.data.list.get(0).projecttype=2;
                    if (info.data.list != null) {
                        list.addAll(info.data.list);
                    }
                    if (info.data.list.size() != 0) {
                        page = info.data.list.get(0).page + 1;
                        if (info.data.list.get(0).page != info.data.list.get(0).totalPage) {
                            more = true;
                        } else {
                            more = false;
                        }
                    }
                    handler.sendMessage(new Message());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void error(Request request, IOException e) {
                iscall = false;
                handler.sendEmptyMessage(2);

            }
        });

    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
            long time1 = new Date().getTime();
            if ((time1 - time) < 4000) {
                finish();
            } else {
                Toast.makeText(getApplicationContext(), "再次点击退出应用", 0).show();
                time = time1;
            }
            return true;
        } else
            return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 2) {
            Toast.makeText(getApplicationContext(), data.getStringExtra("msg"), 0).show();
        } else {
            Toast.makeText(getApplicationContext(), "创建成功", 0).show();
            refresh();
        }

    }

    public void refresh() {
        list.clear();
        page = 1;
        initlist();
    }

    public void add() {
        pb.setVisibility(View.VISIBLE);
        viewPager.setVisibility(View.GONE);
        ListCallInfo listCallInfo = new ListCallInfo(usercode, username, role, page);
        Gson gson = new Gson();
        String json = gson.toJson(listCallInfo);
        if (iscall) {
            Toast.makeText(getApplicationContext(), "请稍等,请求中", 0).show();
            return;
        }
        iscall = true;
        new OkHttpUtil().call(Url, json, new OkHttpUtil.OkHttpCallBack() {
            @Override
            public void sucess(Response response) {
                try {
                    iscall = false;
                    String json = response.body().string();
                    Gson gson1 = new Gson();
                    ListResultInfo info = gson1.fromJson(json, ListResultInfo.class);
                    if (info.data.list != null) {
                        list.addAll(info.data.list);
                    }
                    page = info.data.list.get(0).page + 1;
                    if (info.data.list.get(0).page != info.data.list.get(0).totalPage) {
                        more = true;
                    } else {
                        more = false;
                    }
                    handler.sendMessage(new Message());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


            @Override
            public void error(Request request, IOException e) {
                iscall = false;
                handler.sendEmptyMessage(2);

            }
        });
    }

    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return new RecyclerFragmentList(viewPager, list, more, ListActivity.this);
        }

        @Override
        public int getCount() {
            return 1;
        }
    }


}
