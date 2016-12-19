package com.whstategrid.wuhaistategrid.adapter;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.whstategrid.wuhaistategrid.R;
import com.whstategrid.wuhaistategrid.activity.ContentActivity;
import com.whstategrid.wuhaistategrid.bean.DBTCInfo;
import com.whstategrid.wuhaistategrid.bean.LDHQCinfo;

import java.util.ArrayList;

/**
 * Created by 冯傲 on 2016/8/18.
 * e-mail 897840134@qq.com
 */
public class DBTCdapter extends RecyclerView.Adapter<DBTCdapter.MyViewHolder> {
    public Context context;
    ViewPager viewPager;
    ArrayList<DBTCInfo> list;
    String TAG = "fengao";
    int position;
    String type;
    String filenumlist;
    int TITLE = 1;
    int CONTENT = 2;
    int END = 3;

    public DBTCdapter(Context context, ArrayList<DBTCInfo> list, ViewPager viewPager, int position, String type) {
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
            view = LayoutInflater.from(context).inflate(R.layout.itemdbtc_title, parent,
                    false);
        } else if (viewType == 2) {
            view = LayoutInflater.from(context).inflate(R.layout.itemdbtc_content, parent,
                    false);
        } else {
            view = LayoutInflater.from(context).inflate(R.layout.nextandlast, parent,
                    false);
        }
        return new MyViewHolder(view, viewType);
    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        if (getItemViewType(position) == 2) {
            holder.tv1.setText(list.get(position).number);
            holder.tv2.setText(list.get(position).name);
            holder.tv3.setText(list.get(position).pfbz);
            holder.tv4.setText(list.get(position).jcyq);
            if (type.equals("edit")) {
                holder.iv1.setImageResource(R.drawable.checked);
                holder.iv2.setImageResource(R.drawable.checked);
                holder.iv1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (list.get(position).isChoose == 1) {
                            list.get(position).isChoose = 0;
                            holder.iv1.setImageResource(R.drawable.checked);
                            holder.iv2.setImageResource(R.drawable.checked);
                        } else {
                            list.get(position).isChoose = 1;
                            holder.iv1.setImageResource(R.drawable.checkeded);
                            holder.iv2.setImageResource(R.drawable.checked);
                        }

                    }
                });
                holder.iv2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (list.get(position).isChoose == 2) {
                            list.get(position).isChoose = 0;
                            holder.iv1.setImageResource(R.drawable.checked);
                            holder.iv2.setImageResource(R.drawable.checked);
                        } else {
                            list.get(position).isChoose = 2;
                            holder.iv1.setImageResource(R.drawable.checked);
                            holder.iv2.setImageResource(R.drawable.checkeded);
                        }
                    }
                });
            } else {
                String s1 = "@" + this.position + position + "T##";
                String s2 = "@" + this.position + position + "F##";
                if (filenumlist.contains(s1)) {
                    holder.iv1.setImageResource(R.drawable.checkeded);
                    holder.iv2.setImageResource(R.drawable.checked);
                } else if (filenumlist.contains(s2)) {
                    holder.iv1.setImageResource(R.drawable.checked);
                    holder.iv2.setImageResource(R.drawable.checkeded);
                } else {
                    holder.iv1.setImageResource(R.drawable.checked);
                    holder.iv2.setImageResource(R.drawable.checked);
                }
            }
        } else if (getItemViewType(position) == 3) {
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
        } else {
            holder.tv1.setText(list.get(position).number);
            holder.tv2.setText(list.get(position).name);
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (list.size() == 0 || position == list.size()) {
            return 3;
        } else if (list.get(position).type == DBTCInfo.TITLE) {
            return 1;
        } else {
            return 2;
        }
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
        public ImageView iv1;
        public ImageView iv2;

        public MyViewHolder(View view, int type) {
            super(view);
            this.view = view;
            if (type == 1) {
                tv1 = (TextView) view.findViewById(R.id.tv_dbtv_title_num);
                tv2 = (TextView) view.findViewById(R.id.tv_dbtc_title_name);
            } else if (type == 2) {
                tv1 = (TextView) view.findViewById(R.id.tv_dbtc_content_number);
                tv2 = (TextView) view.findViewById(R.id.tv_dbtc_content_name);
                tv3 = (TextView) view.findViewById(R.id.tv_dbtc_content_pfbz);
                tv4 = (TextView) view.findViewById(R.id.tv_dbtc_content_jcyq);
                iv1 = (ImageView) view.findViewById(R.id.iv_dbtc_content_y);
                iv2 = (ImageView) view.findViewById(R.id.iv_dbtc_content_n);
            }

        }
    }

}
