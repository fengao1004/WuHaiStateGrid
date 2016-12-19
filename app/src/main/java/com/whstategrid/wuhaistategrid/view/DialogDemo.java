package com.whstategrid.wuhaistategrid.view;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.whstategrid.wuhaistategrid.R;

import java.util.ArrayList;

import static android.R.layout.simple_spinner_dropdown_item;

/**
 * Created by 冯傲 on 2016/8/14.
 * e-mail 897840134@qq.com
 */
public class DialogDemo extends Dialog {
    public DialogDemo(Context context) {
        super(context);
    }

    static TextView tv;

    public DialogDemo(Context context, int theme) {
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

        public void settv(String json) {
            tv.setText(json);
        }

        public DialogDemo create() {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            final DialogDemo dialog = new DialogDemo(context, R.style.Dialog);
            View layout = inflater.inflate(R.layout.dialog_add, null);
            tv = (TextView) layout.findViewById(R.id.tv_demo);

            //适配器
            ArrayAdapter<String> arr_adapter = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, data_list);
            //设置样式
            arr_adapter.setDropDownViewResource(simple_spinner_dropdown_item);
            //加载适配器

            dialog.addContentView(layout, new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            final EditText et_project_name = (EditText) layout.findViewById(R.id.et_project_name);
            layout.findViewById(R.id.et_no).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
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
