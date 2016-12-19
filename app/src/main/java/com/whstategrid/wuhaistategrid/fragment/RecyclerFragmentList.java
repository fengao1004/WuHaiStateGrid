package com.whstategrid.wuhaistategrid.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.whstategrid.wuhaistategrid.R;
import com.whstategrid.wuhaistategrid.adapter.AQWMAdapter2;
import com.whstategrid.wuhaistategrid.adapter.ListAdapter;
import com.whstategrid.wuhaistategrid.bean.AQWMSGJCB_Info;
import com.whstategrid.wuhaistategrid.bean.ListResultInfo;

import java.util.ArrayList;

/**
 * Created by 冯傲 on 2016/8/18.
 * e-mail 897840134@qq.com
 */
@SuppressLint("ValidFragment")
public class RecyclerFragmentList extends Fragment {
    RecyclerView recyclerView;
    AQWMSGJCB_Info info;
    ViewPager viewPager;
    Context context;
    Boolean more;
    int position;
    ArrayList<ListResultInfo.ListCantantInfo> list;
    public RecyclerFragmentList(ViewPager viewPager, ArrayList<ListResultInfo.ListCantantInfo> list,Boolean more,Context context) {
        this.context = context;
        this.viewPager = viewPager;
        this.list = list;
        this.more = more;
    }
    public static Fragment getInstance(boolean isTest) {
        RecyclerFragmentList instance = new RecyclerFragmentList();
        //instance.isTest = isTest;
        return instance;
    }
    public RecyclerFragmentList(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.itemaqwmrv, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_aqwm);
        initView();
        return view;
    }

    private void initView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new ListAdapter(context, list,more));
    }
}
