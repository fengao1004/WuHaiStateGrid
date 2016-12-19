package com.whstategrid.wuhaistategrid.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.whstategrid.wuhaistategrid.R;
import com.whstategrid.wuhaistategrid.bean.ProjectInfo;

import java.util.ArrayList;

/**
 * Created by 冯傲 on 2016/8/18.
 * e-mail 897840134@qq.com
 */
public class JJFZAdapter extends RecyclerView.Adapter<JJFZAdapter.MyViewHolder> {
    ArrayList<ProjectInfo> list = new ArrayList<ProjectInfo>();
    int TWO_NAME = 2;
    int ONE_NAME = 1;
    public Context context;

    public JJFZAdapter(Context context, ArrayList<ProjectInfo> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        if (viewType == ONE_NAME) {
            view = LayoutInflater.from(context).inflate(R.layout.contentitem1, parent,
                    false);
        } else {
            view = LayoutInflater.from(context).inflate(R.layout.contentitem2, parent,
                    false);
        }

        return new MyViewHolder(view, viewType);
    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        if (getItemViewType(position) == ONE_NAME) {
            holder.tv1.setText(list.get(position).classify);
            holder.tv2.setText(list.get(position).name[0]);
            holder.tv3.setText(list.get(position).number);
            if (list.get(position).isChoose) {
                holder.iv1.setImageResource(R.drawable.choose);
            } else {
                holder.iv1.setImageResource(R.drawable.check);
            }
        } else {
            holder.tv1.setText(list.get(position).classify);
            holder.tv2.setText(list.get(position).name[0]);
            holder.tv3.setText(list.get(position).name[1]);
            holder.tv4.setText(list.get(position).number);

            if (list.get(position).isChoose) {
                holder.iv1.setImageResource(R.drawable.choose);
            } else {
                holder.iv1.setImageResource(R.drawable.check);
            }
            if (list.get(position).isChoose2) {
                holder.iv2.setImageResource(R.drawable.choose);
            } else {
                holder.iv2.setImageResource(R.drawable.check);
            }
        }
        holder.iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.get(position).isChoose = !list.get(position).isChoose;
                if (list.get(position).isChoose) {
                    holder.iv1.setImageResource(R.drawable.choose);
                } else {
                    holder.iv1.setImageResource(R.drawable.check);
                }
            }
        });
        if (holder.iv2 != null) {
            holder.iv2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    list.get(position).isChoose2 = !list.get(position).isChoose2;
                    if (list.get(position).isChoose2) {
                        holder.iv2.setImageResource(R.drawable.choose);
                    } else {
                        holder.iv2.setImageResource(R.drawable.check);
                    }
                }
            });
        }

    }

    @Override
    public int getItemViewType(int position) {
        if (list.get(position).name.length != 1) {
            return TWO_NAME;
        }
        return ONE_NAME;
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
            if (type == ONE_NAME) {
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
