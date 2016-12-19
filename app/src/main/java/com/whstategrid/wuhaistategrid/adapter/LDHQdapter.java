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
import com.whstategrid.wuhaistategrid.bean.BZGYinfo;
import com.whstategrid.wuhaistategrid.bean.LDHQCinfo;

import java.util.ArrayList;

/**
 * Created by 冯傲 on 2016/8/18.
 * e-mail 897840134@qq.com
 */
public class LDHQdapter extends RecyclerView.Adapter<LDHQdapter.MyViewHolder> {
    public Context context;
    ViewPager viewPager;
    ArrayList<LDHQCinfo> list;
    String TAG = "fengao";
    int position;
    String type;
    String filenumlist;
    int TITLE = 1;
    int CONTENT =2 ;
    int END = 3;
    public LDHQdapter(Context context, ArrayList<LDHQCinfo> list, ViewPager viewPager, int position, String type) {
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
            view = LayoutInflater.from(context).inflate(R.layout.itemldhq_title, parent,
                    false);
        } else if(viewType == 2 ) {
            view = LayoutInflater.from(context).inflate(R.layout.itemldhq_content, parent,
                    false);
        }else {
            view = LayoutInflater.from(context).inflate(R.layout.nextandlast, parent,
                    false);
        }
        return new MyViewHolder(view,viewType);
    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        if (getItemViewType(position) == 2) {
            holder.tv1.setText(list.get(position).number);
            holder.tv2.setText(list.get(position).name);
            holder.ll.removeAllViews();
            for (int i = 0; i < list.get(position).pfbz.size(); i++) {
                View view = LayoutInflater.from(context).inflate(R.layout.atringaddchoose2, null);
                TextView tv_number_biaozhun = (TextView) view.findViewById(R.id.tv_pfbz);
                tv_number_biaozhun.setText(list.get(position).pfbz.get(i).name);
                final ImageView iv_nb_choose_n = (ImageView) view.findViewById(R.id.iv_nb_choose_n);
                final ImageView iv_nb_choose_y = (ImageView) view.findViewById(R.id.iv_nb_choose_y);
                if (type.equals("edit")) {
                    if (list.get(position).pfbz.get(i).ischoose==1) {
                        iv_nb_choose_y.setImageResource(R.drawable.checkeded);
                        iv_nb_choose_n.setImageResource(R.drawable.checked);
                    } else if(list.get(position).pfbz.get(i).ischoose==2){
                        iv_nb_choose_y.setImageResource(R.drawable.checked);
                        iv_nb_choose_n.setImageResource(R.drawable.checkeded);
                    }else if(list.get(position).pfbz.get(i).ischoose==0){
                        iv_nb_choose_y.setImageResource(R.drawable.checked);
                        iv_nb_choose_n.setImageResource(R.drawable.checked);
                    }
                    final int a = i;
                    iv_nb_choose_y.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(list.get(position).pfbz.get(a).ischoose == 1){
                                list.get(position).pfbz.get(a).ischoose=0;
                                iv_nb_choose_y.setImageResource(R.drawable.checked);
                                iv_nb_choose_n.setImageResource(R.drawable.checked);
                            }else {
                                list.get(position).pfbz.get(a).ischoose=1;
                                iv_nb_choose_y.setImageResource(R.drawable.checkeded);
                                iv_nb_choose_n.setImageResource(R.drawable.checked);
                            }

                        }
                    });
                    iv_nb_choose_n.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(list.get(position).pfbz.get(a).ischoose == 2){
                                list.get(position).pfbz.get(a).ischoose=0;
                                iv_nb_choose_y.setImageResource(R.drawable.checked);
                                iv_nb_choose_n.setImageResource(R.drawable.checked);
                            }else {
                                list.get(position).pfbz.get(a).ischoose=2;
                                iv_nb_choose_y.setImageResource(R.drawable.checked);
                                iv_nb_choose_n.setImageResource(R.drawable.checkeded);
                            }
                        }
                    });
                } else if (type.equals("show")) {
                    String s1 = "@" + this.position + position + i + "T##";
                    String s2 = "@" + this.position + position + i + "F##";
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
                holder.ll.addView(view);
            }
        } else if(getItemViewType(position) ==3){
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
        }else {
            holder.tv1.setText(list.get(position).number);
            holder.tv2.setText(list.get(position).name);
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (list.size() == 0 || position == list.size()) {
            return 3;
        }else if(list.get(position).type == LDHQCinfo.TITLE){
            return 1;
        }else {
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
        public LinearLayout ll;

        public MyViewHolder(View view,int type) {
            super(view);
            this.view = view;
            if(type==1){
                tv1 = (TextView) view.findViewById(R.id.tv_ldhq_title_num);
                tv2 = (TextView) view.findViewById(R.id.tv_ldhq_title_name);
            }else if(type==2) {
                tv1 = (TextView) view.findViewById(R.id.ldhq_number);
                tv2 = (TextView) view.findViewById(R.id.ldhq_name);
                ll = (LinearLayout) view.findViewById(R.id.ll_ldhq_content);
            }

        }
    }

}
