package com.whstategrid.wuhaistategrid.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.whstategrid.wuhaistategrid.R;
import com.whstategrid.wuhaistategrid.activity.ContentActivity;
import com.whstategrid.wuhaistategrid.activity.ListActivity;
import com.whstategrid.wuhaistategrid.bean.ListResultInfo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by 冯傲 on 2016/8/20.
 * e-mail 897840134@qq.com
 */
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {
    Context context;
    ArrayList<ListResultInfo.ListCantantInfo> list;
    Boolean more;

    public ListAdapter(Context context, ArrayList<ListResultInfo.ListCantantInfo> info, Boolean more) {
        this.context = context;
        this.list = info;
        this.more = more;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        if (viewType == 2) {
            view = LayoutInflater.from(context).inflate(R.layout.itemaddmost, parent,
                    false);
        } else {
            view = LayoutInflater.from(
                    context).inflate(R.layout.istitem, parent,
                    false);
        }
        MyViewHolder holder = new MyViewHolder(view, viewType);
        return holder;
    }


    @Override
    public int getItemViewType(int position) {
        if (list==null||position == list.size()) {
            return 2;
        }
        return 1;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        Log.i("fengao", "onBindViewHolder: " + (list.size() + 1));
        if ((position < list.size()) && list.size() != 0) {
            holder.view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent((ListActivity) context, ContentActivity.class);
                    String filenumlist = list.get(position).filenumlist.toUpperCase();
                    intent.putExtra("projectname", list.get(position).projectname);
                    intent.putExtra("fileNumList", filenumlist);
                    intent.putExtra("projecttype", list.get(position).projecttype);
                    ((ListActivity) context).startActivity(intent);
                }
            });
            holder.tv1.setText(list.get(position).projectname);
            holder.tv2.setText(list.get(position).username);
            if(list.get(position).projecttype==0|list.get(position).projecttype==1){
                holder.tv4.setText("基建项目辅助管理..");
            }else if(list.get(position).projecttype==2){
                holder.tv4.setText("安全文明施工检查表");
            }else if(list.get(position).projecttype==3){
                holder.tv4.setText("标准工艺评价表和..");
            }else if(list.get(position).projecttype==4){
                holder.tv4.setText("流动红旗竞赛检查表");
            }else if(list.get(position).projecttype==5){
                holder.tv4.setText("输变电工程优质工..");
            }
            String time = list.get(position).createtime.time + "";
            Log.i("fengao", "onBindViewHolder: " + time);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String date = sdf.format(new Date(new Long(time)));
            holder.tv3.setText(date);
        } else {
            if (more) {
                holder.tv1.setText("点击加载更多");
                holder.tv1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ((ListActivity)context).add();
                    }
                });
            } else {
                holder.tv1.setText("没有更多数据了");
                holder.tv1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "没有更多数据了", 0).show();
                    }
                });
            }
        }


    }

    @Override
    public int getItemCount() {
        if (list == null) {
            return 1;
        }
        return list.size() + 1;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView tv1;
        public TextView tv2;
        public TextView tv3;
        public TextView tv4;

        public MyViewHolder(View view, int type) {

            super(view);

            this.view = view;
            if (type == 2) {
                tv1 = (TextView) view.findViewById(R.id.tv_more);
            } else {
                tv1 = (TextView) view.findViewById(R.id.tv_pro_name);
                tv2 = (TextView) view.findViewById(R.id.tv_auther_name);
                tv4=(TextView) view.findViewById(R.id.tv_pro_type);
                tv3 = (TextView) view.findViewById(R.id.tv_time);
            }


        }
    }

}
