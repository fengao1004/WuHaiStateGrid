package com.whstategrid.wuhaistategrid.adapter;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.HeaderViewListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.whstategrid.wuhaistategrid.R;
import com.whstategrid.wuhaistategrid.activity.ContentActivity;
import com.whstategrid.wuhaistategrid.bean.AQWMSGJCB_Info;

/**
 * Created by 冯傲 on 2016/8/18.
 * e-mail 897840134@qq.com
 */
public class AQWMAdapter2 extends RecyclerView.Adapter<AQWMAdapter2.MyViewHolder> {
    public Context context;
    ViewPager viewPager;
    public AQWMSGJCB_Info info;
    String TAG = "fengao";
    int position;
    String type;
    String filenumlist;
    public AQWMAdapter2(Context context, AQWMSGJCB_Info info, ViewPager viewPager, int position, String type) {
        this.context = context;
        this.info = info;
        this.viewPager = viewPager;
        this.position = position;
        this.type = type;
        this.filenumlist = ContentActivity.getfilenumlist();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        if (viewType == 1) {
            view = LayoutInflater.from(context).inflate(R.layout.itemaqwmlist2, parent,
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
            holder.tv1.setText(info.list.get(position).number+"");
            holder.tv2.setText(info.list.get(position).porjectName);
            holder.tv3.setText(info.list.get(position).standard + " 分");
            holder.ll.removeAllViews();
            for (int i = 0; i < info.list.get(position).numberStandard.size(); i++) {
                View view = LayoutInflater.from(context).inflate(R.layout.atringaddchoose, null);
                TextView tv_number_biaozhun = (TextView) view.findViewById(R.id.tv_number_biaozhun);
                tv_number_biaozhun.setText(info.list.get(position).numberStandard.get(i).name);
                final ImageView iv_nb_choose = (ImageView) view.findViewById(R.id.iv_nb_choose);
               if(type.equals("edit")){
                   if (info.list.get(position).numberStandard.get(i).ischoose) {
                       iv_nb_choose.setImageResource(R.drawable.choose);
                   } else {
                       iv_nb_choose.setImageResource(R.drawable.check);
                   }
                   final int a = i;
                   iv_nb_choose.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           info.list.get(position).numberStandard.get(a).ischoose = !info.list.get(position).numberStandard.get(a).ischoose;
                           if (info.list.get(position).numberStandard.get(a).ischoose) {
                               iv_nb_choose.setImageResource(R.drawable.choose);
                           } else {
                               iv_nb_choose.setImageResource(R.drawable.check);
                           }
                       }
                   });
               }else if(type.equals("show")){
                   String s = "@"+this.position+position+i+"##";
                   if(filenumlist.contains(s)){
                       iv_nb_choose.setImageResource(R.drawable.checkeded);
                   }else {
                       iv_nb_choose.setImageResource(R.drawable.checked);
                   }

               }
                holder.ll.addView(view);
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
        if (info.list.size() == 0 || position == info.list.size()) {
            return 2;
        }
        return 1;
    }

    @Override
    public int getItemCount() {
        return info.list.size() + 1;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView tv1;
        public TextView tv2;
        public TextView tv3;
        public LinearLayout ll;

        public MyViewHolder(View view) {
            super(view);
            this.view = view;
            tv1 = (TextView) view.findViewById(R.id.tv_number_aqwm);
            tv2 = (TextView) view.findViewById(R.id.tv_name_aqwm);
            tv3 = (TextView) view.findViewById(R.id.tv_point_aqwm);
            ll = (LinearLayout) view.findViewById(R.id.ll_);
        }
    }

}
