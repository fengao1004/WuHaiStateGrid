package com.whstategrid.wuhaistategrid.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.whstategrid.wuhaistategrid.R;
import com.whstategrid.wuhaistategrid.activity.ChooseActivity;

import java.util.ArrayList;

import static android.R.layout.*;

/**
 * Created by 冯傲 on 2016/8/14.
 * e-mail 897840134@qq.com
 */
public class DialogAdd extends Dialog {
    public DialogAdd(Context context) {
        super(context);
    }

    public DialogAdd(Context context, int theme) {
        super(context, theme);
    }

    public static class Builder {
        int item;
        private Context context;
        public onUpClickListener l = null;
        private ArrayList<String> data_list;

        public Builder(Context context) {
            this.context = context;
        }


        public DialogAdd create() {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            final DialogAdd dialog = new DialogAdd(context, R.style.Dialog);
            View layout = inflater.inflate(R.layout.dialog_add, null);
            Spinner spinner = (Spinner) layout.findViewById(R.id.spinner);

            data_list = new ArrayList<String>();
            data_list.add("工程档案检查表");
            data_list.add("安全文明施工检查表");
            data_list.add("标准工艺评价表和评分表");
            data_list.add("流动红旗竞赛检查表");
            data_list.add("输变电工程优质工..");

            //适配器
            ArrayAdapter<String> arr_adapter = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, data_list);
            //设置样式
            arr_adapter.setDropDownViewResource(simple_spinner_dropdown_item);
            //加载适配器
            spinner.setAdapter(arr_adapter);
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    Builder.this.item = position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    Builder.this.item = 0;
                }
            });
            dialog.addContentView(layout, new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            final EditText et_project_name = (EditText) layout.findViewById(R.id.et_project_name);
            layout.findViewById(R.id.et_no).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });
            layout.findViewById(R.id.et_yes).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = et_project_name.getText().toString().trim();
                    if (l != null) {
                        l.onClick(name, item);
                        dialog.dismiss();
                    }


                }
            });
            dialog.setContentView(layout);
            return dialog;
        }

        public void setOnClick(onUpClickListener l) {
            this.l = l;
        }
    }

    public interface onUpClickListener {
        void onClick(String name, int item);
    }
}
