package com.whstategrid.wuhaistategrid.adapter;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.whstategrid.wuhaistategrid.R;
import com.whstategrid.wuhaistategrid.activity.ContentActivity;
import com.whstategrid.wuhaistategrid.bean.BZGYinfo;

import java.util.ArrayList;

/**
 * Created by 冯傲 on 2016/8/18.
 * e-mail 897840134@qq.com
 */
public class BZGYdapter extends RecyclerView.Adapter<BZGYdapter.MyViewHolder> {
    public Context context;
    ViewPager viewPager;
    ArrayList<BZGYinfo> list;
    String TAG = "fengao";
    int position;
    String type;
    String filenumlist;

    public BZGYdapter(Context context, ArrayList<BZGYinfo> list, ViewPager viewPager, int position, String type) {
        this.context = context;
        this.list = list;
        this.viewPager = viewPager;
        this.position = position;
        this.type = type;
        this.filenumlist = ContentActivity.getfilenumlist();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        if (viewType == 1) {
            view = LayoutInflater.from(context).inflate(R.layout.itembzgy, parent,
                    false);

        } else {
            view = LayoutInflater.from(context).inflate(R.layout.nextandlast, parent,
                    false);
        }


        return new MyViewHolder(view);

    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        if (getItemViewType(position) == 1) {
            holder.tv1.setText(list.get(position).zhuanYe + "");
            holder.tv2.setText(list.get(position).number + "");
            holder.tv3.setText(list.get(position).name + "");
            holder.tv4.setText(list.get(position).biaoZhun + "");


            final ImageView iv_nb_choose_n = (ImageView) holder.view.findViewById(R.id.iv_111_choose_n);
            final ImageView iv_nb_choose_y = (ImageView) holder.view.findViewById(R.id.iv_111_choose_y);
            if (type.equals("edit")) {
                if (list.get(position).isChoose==1) {
                    iv_nb_choose_y.setImageResource(R.drawable.checkeded);
                    iv_nb_choose_n.setImageResource(R.drawable.checked);

                } else if(list.get(position).isChoose==2){
                    iv_nb_choose_y.setImageResource(R.drawable.checked);
                    iv_nb_choose_n.setImageResource(R.drawable.checkeded);
                }else if(list.get(position).isChoose==0){
                    iv_nb_choose_y.setImageResource(R.drawable.checked);
                    iv_nb_choose_n.setImageResource(R.drawable.checked);
                }
                iv_nb_choose_y.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        list.get(position).isChoose = 1;
                        iv_nb_choose_y.setImageResource(R.drawable.checkeded);
                        iv_nb_choose_n.setImageResource(R.drawable.checked);
                    }
                });
                iv_nb_choose_n.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        list.get(position).isChoose = 2;
                        iv_nb_choose_y.setImageResource(R.drawable.checked);
                        iv_nb_choose_n.setImageResource(R.drawable.checkeded);
                    }
                });
            } else if (type.equals("show")) {
                String s1 = "@" + this.position + position + "T##";
                String s2 = "@" + this.position + position + "F##";

                if (filenumlist.contains(s1)) {
                    iv_nb_choose_y.setImageResource(R.drawable.checkeded);
                    iv_nb_choose_n.setImageResource(R.drawable.checked);
                } else if(filenumlist.contains(s2)){
                    iv_nb_choose_y.setImageResource(R.drawable.checked);
                    iv_nb_choose_n.setImageResource(R.drawable.checkeded);
                }else {
                    iv_nb_choose_y.setImageResource(R.drawable.checked);
                    iv_nb_choose_n.setImageResource(R.drawable.checked);
                }

            }


        } else {
            int all = viewPager.getAdapter().getCount();

            if (this.position == 0) {
                holder.view.findViewById(R.id.tv_last).setVisibility(View.GONE);
            } else if (this.position == all - 1) {
                holder.view.findViewById(R.id.tv_next).setVisibility(View.GONE);
            }
            holder.view.findViewById(R.id.tv_last).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
                }
            });
            holder.view.findViewById(R.id.tv_next).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                }
            });

        }
    }

    @Override
    public int getItemViewType(int position) {
        if (list.size() == 0 || position == list.size()) {
            return 2;
        }
        return 1;
    }

    @Override
    public int getItemCount() {
        return list.size() + 1;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView tv1;
        public TextView tv2;
        public TextView tv3;
        public TextView tv4;

        public MyViewHolder(View view) {
            super(view);
            this.view = view;

            tv1 = (TextView) view.findViewById(R.id.tv_bzgy_zy);
            tv2 = (TextView) view.findViewById(R.id.tv_bzgy_number);
            tv3 = (TextView) view.findViewById(R.id.tv_bzgy_name);
            tv4 = (TextView) view.findViewById(R.id.tv_bzgy_bz);

        }
    }

}
