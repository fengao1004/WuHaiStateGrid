package com.whstategrid.wuhaistategrid.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.whstategrid.wuhaistategrid.R;
import com.whstategrid.wuhaistategrid.adapter.AQWMAdapter2;
import com.whstategrid.wuhaistategrid.adapter.BZGYdapter;
import com.whstategrid.wuhaistategrid.adapter.DBTCdapter;
import com.whstategrid.wuhaistategrid.adapter.LDHQdapter;
import com.whstategrid.wuhaistategrid.adapter.SBDAdapter;
import com.whstategrid.wuhaistategrid.bean.AQWMSGJCB_Info;
import com.whstategrid.wuhaistategrid.bean.BZGYinfo;
import com.whstategrid.wuhaistategrid.bean.DBTCInfo;
import com.whstategrid.wuhaistategrid.bean.LDHQCinfo;

import java.util.ArrayList;

/**
 * Created by 冯傲 on 2016/8/18.
 * e-mail 897840134@qq.com
 */
@SuppressLint("ValidFragment")
public class RecyclerFragment extends Fragment {
    public static Fragment getInstance(boolean isTest) {
        RecyclerFragment instance = new RecyclerFragment();

        //instance.isTest = isTest;
        return instance;
    }

    public RecyclerFragment() {

    }

    RecyclerView recyclerView;
    AQWMSGJCB_Info info;
    ViewPager viewPager;
    String TAG = "fengao";
    String type;
    int position;
    int item;
    final int AQWM = 1;
    final int JJXM = 0;
    final int BZGY = 2;
    final int LDHQ = 3;
    final int DBTC = 4;
    ArrayList<BZGYinfo> info2;
    ArrayList<LDHQCinfo> info3;
    ArrayList<DBTCInfo> info4;

    public RecyclerFragment(ViewPager viewPager, AQWMSGJCB_Info info, int position, String type, int item) {
        this.info = info;
        this.viewPager = viewPager;
        this.position = position;
        this.type = type;
        this.item = item;
    }

    public RecyclerFragment(ViewPager viewPager, ArrayList<BZGYinfo> info2, int position, String type, int item, BZGYinfo bzgYinfo) {
        this.info2 = info2;
        this.viewPager = viewPager;
        this.position = position;
        this.type = type;
        this.item = item;
    }

    public RecyclerFragment(ViewPager viewPager, ArrayList<LDHQCinfo> info3, int position, String type, int item, LDHQCinfo bzgYinfo) {
        this.info3 = info3;
        this.viewPager = viewPager;
        this.position = position;
        this.type = type;
        this.item = item;
    }

    public RecyclerFragment(ViewPager viewPager, ArrayList<DBTCInfo> info4, int position, String type, int item, DBTCInfo bzgYinfo) {
        this.info4 = info4;
        this.viewPager = viewPager;
        this.position = position;
        this.type = type;
        this.item = item;
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
        if (item == AQWM) {
            recyclerView.setAdapter(new AQWMAdapter2(getContext(), info, viewPager, position, type));

        } else if (item == BZGY) {
            if (position == 0) {
                recyclerView.setAdapter(new SBDAdapter(getContext(), info2, viewPager, position, type));
            } else {
                recyclerView.setAdapter(new BZGYdapter(getContext(), info2, viewPager, position, type));
            }

        } else if (item == LDHQ) {
            recyclerView.setAdapter(new LDHQdapter(getContext(), info3, viewPager, position, type));
        }else if(item == DBTC){
            recyclerView.setAdapter(new DBTCdapter(getContext(), info4, viewPager, position, type));
        }
    }
}
