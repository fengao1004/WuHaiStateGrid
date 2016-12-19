package com.whstategrid.wuhaistategrid.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.whstategrid.wuhaistategrid.R;
import com.whstategrid.wuhaistategrid.activity.Choose2Activity;
import com.whstategrid.wuhaistategrid.activity.ChooseActivity;
import com.whstategrid.wuhaistategrid.activity.ContentActivity;
import com.whstategrid.wuhaistategrid.bean.ProjectInfo;

import java.util.ArrayList;

/**
 * Created by 冯傲 on 2016/8/18.
 * e-mail 897840134@qq.com
 */
public class AQWMAdapter1 extends RecyclerView.Adapter<AQWMAdapter1.MyViewHolder> {
    String[] list = new String[]{};
    String projectname;
    public Context context;
    String type ;
    int item;
    public AQWMAdapter1(Context context, String[] list,String projectname,String type,int item) {
        this.projectname =projectname;
        this.context = context;
        this.list = list;
        this.type = type;
        this.item = item;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;

        view = LayoutInflater.from(context).inflate(R.layout.itemaqwmlist1, parent,
                false);

        return new MyViewHolder(view);

    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        holder.tv1.setText(list[position]);
        holder.tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Choose2Activity.class);
                intent.putExtra("position", position);
                intent.putExtra("projectname", projectname);
                intent.putExtra("type", type);
                intent.putExtra("item", item);
                if(type.equals("show")){
                    ((ContentActivity)context).startActivity(intent);
                }else {
                    ((ChooseActivity)context).startActivityForResult(intent,1);
                }
            }
        });
        if(item==1){
            holder.tv2.setVisibility(View.VISIBLE);
        }else if(item==2){
            holder.tv2.setVisibility(View.GONE);
        }else if(item==3){
            holder.tv2.setVisibility(View.GONE);
        }else if(item==4){
            holder.tv2.setVisibility(View.GONE);
        }
    }


    @Override
    public int getItemCount() {
        return list.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView tv1;
        public TextView tv2;


        public MyViewHolder(View view) {
            super(view);
            tv1 = (TextView) view.findViewById(R.id.tv_list_name);
            tv2 = (TextView) view.findViewById(R.id.fenshu);

        }
    }
}
