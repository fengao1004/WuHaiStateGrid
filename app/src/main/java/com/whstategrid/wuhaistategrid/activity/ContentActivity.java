package com.whstategrid.wuhaistategrid.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.whstategrid.wuhaistategrid.R;
import com.whstategrid.wuhaistategrid.adapter.AQWMAdapter1;
import com.whstategrid.wuhaistategrid.bean.AQWMSGJCB_Info;
import com.whstategrid.wuhaistategrid.bean.ProjectInfo;
import com.whstategrid.wuhaistategrid.modle.Constant;
import com.whstategrid.wuhaistategrid.modle.Constant_AQWMSGJCB_MAX;
import com.whstategrid.wuhaistategrid.modle.Constant_BZGYPJ;
import com.whstategrid.wuhaistategrid.modle.Constant_DBTC;
import com.whstategrid.wuhaistategrid.modle.Constant_LDHQ;

import java.io.FilenameFilter;
import java.util.ArrayList;

public class ContentActivity extends AppCompatActivity {
    int TWO_NAME_NO_CHOOSE = 20;
    int ONE_NAME_NO_CHOOSE = 10;
    int TWO_NAME_CHOOSE = 21;
    int ONE_NAME_CHOOSE = 11;
    int projecttype;
    private ImageView refresh;
    private RecyclerView list_content;
    String projectname = "";

    static String filenumlist = "";
    ArrayList<ProjectInfo> list = new ArrayList<ProjectInfo>();
    private LinearLayout ll_content;
    static private ArrayList<AQWMSGJCB_Info> list2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        Intent intent = getIntent();
        projectname = intent.getStringExtra("projectname");
        filenumlist = intent.getStringExtra("fileNumList");
        projecttype = intent.getIntExtra("projecttype", 0);
        initView();


    }
    public static String getfilenumlist() {

        return filenumlist;
    }
    public static ArrayList<AQWMSGJCB_Info> gelist2() {

        return list2;
    }

    private void initView() {

        TextView na = (TextView) findViewById(R.id.tv_xm_name);
        na.setText(projectname);
        list_content = (RecyclerView) findViewById(R.id.list_content);
        ll_content = (LinearLayout) findViewById(R.id.ll_content);
        if(projecttype==0||projecttype==1){
            ll_content.setVisibility(View.VISIBLE);

        }else {
            ll_content.setVisibility(View.GONE);
        }
        list = new Constant().getlist();
        int a ;
        list_content.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        list_content.setItemAnimator(new DefaultItemAnimator());
        list_content.setAdapter(new HomeAdapter());
        if (projecttype == 0||projecttype == 1) {
            list_content.setAdapter(new HomeAdapter());
        } else if (projecttype == 2) {
            // ll_content.setVisibility(View.GONE);
            list2 = Constant_AQWMSGJCB_MAX.getAQWMSGJCB_InfoByName();
            String[] listNames =new String[27];
            for(int i = 0;i<27;i++){
                int as =0;
                listNames[i] = list2.get(i).listname;
            }
            list_content.setAdapter(new AQWMAdapter1(this, listNames, projectname,"show",1));
        }else if(projecttype == 3){
            String[] listNames = Constant_BZGYPJ.names;
            list_content.setAdapter(new AQWMAdapter1(this, listNames, projectname,"show",2));
        }else if(projecttype == 4){
            String[] listNames = Constant_LDHQ.names;
            list_content.setAdapter(new AQWMAdapter1(this, listNames, projectname,"show",3));
        }else if(projecttype == 5){
            String[] listNames = Constant_DBTC.names;
            list_content.setAdapter(new AQWMAdapter1(this, listNames, projectname,"show",4));
        }
        if (projecttype == 0||projecttype == 1) {
            ll_content.setVisibility(View.VISIBLE);
        } else if (projecttype == 2) {
            ll_content.setVisibility(View.GONE);
        }
    }


    class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view;
            if (viewType == ONE_NAME_CHOOSE || viewType == ONE_NAME_NO_CHOOSE) {
                view = LayoutInflater.from(
                        ContentActivity.this).inflate(R.layout.contentitem1, parent,
                        false);
            } else {
                view = LayoutInflater.from(
                        ContentActivity.this).inflate(R.layout.contentitem2, parent,
                        false);
            }
            if (viewType == ONE_NAME_CHOOSE || viewType == TWO_NAME_CHOOSE) {
                view.setBackgroundResource(R.drawable.shapebgcon2);
            } else {
                view.setBackgroundResource(R.drawable.shapebgcon1);
            }

            return new MyViewHolder(view, viewType);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            if (getItemViewType(position) == ONE_NAME_CHOOSE || getItemViewType(position) == ONE_NAME_NO_CHOOSE) {
                holder.tv1.setText(list.get(position).classify);
                holder.tv2.setText(list.get(position).name[0]);
                holder.tv3.setText(list.get(position).number);
                if (filenumlist.contains(list.get(position).number + ",")) {
                    holder.iv1.setImageResource(R.drawable.checkeded);
                } else {

                    holder.iv1.setImageResource(R.drawable.checked);
                }
            } else {
                holder.tv1.setText(list.get(position).classify);
                holder.tv2.setText(list.get(position).name[0]);
                holder.tv3.setText(list.get(position).name[1]);
                holder.tv4.setText(list.get(position).number);

                if (filenumlist.contains(list.get(position).number + ",")) {
                    holder.iv1.setImageResource(R.drawable.checkeded);
                } else {


                    holder.iv1.setImageResource(R.drawable.checked);
                }
                if (filenumlist.contains(list.get(position).number + "_")) {
                    holder.iv2.setImageResource(R.drawable.checkeded);
                } else {


                    holder.iv2.setImageResource(R.drawable.checked);
                }


            }
        }

        @Override
        public int getItemViewType(int position) {
            if (list.get(position).name.length != 1 && (filenumlist.contains(list.get(position).number + ",") || filenumlist.contains(list.get(position).number + "_"))) {
                return TWO_NAME_CHOOSE;
            } else if (list.get(position).name.length != 1 && !filenumlist.contains(list.get(position).number + ",")) {
                return TWO_NAME_NO_CHOOSE;
            } else if (list.get(position).name.length == 1 && !filenumlist.contains(list.get(position).number + ",")) {
                return ONE_NAME_NO_CHOOSE;
            } else {
                return ONE_NAME_CHOOSE;
            }

        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        class MyViewHolder extends RecyclerView.ViewHolder {

            public TextView tv1;
            public TextView tv2;
            public TextView tv3;
            public TextView tv4;
            public ImageView iv1;
            public ImageView iv2 = null;

            public MyViewHolder(View view, int type) {
                super(view);
                if (type == ONE_NAME_NO_CHOOSE || type == ONE_NAME_CHOOSE) {
                    tv1 = (TextView) view.findViewById(R.id.tv_classify1);
                    tv2 = (TextView) view.findViewById(R.id.tv_name1);
                    tv3 = (TextView) view.findViewById(R.id.tv_number1);
                    iv1 = (ImageView) view.findViewById(R.id.checked1);
                    tv4 = null;
                } else {
                    tv1 = (TextView) view.findViewById(R.id.tv_classify2);
                    tv2 = (TextView) view.findViewById(R.id.name2_1);
                    tv3 = (TextView) view.findViewById(R.id.name2_2);
                    tv4 = (TextView) view.findViewById(R.id.tv_number2);
                    iv1 = (ImageView) view.findViewById(R.id.checked2_1);
                    iv2 = (ImageView) view.findViewById(R.id.checked2_2);

                }

            }
        }
    }
}
