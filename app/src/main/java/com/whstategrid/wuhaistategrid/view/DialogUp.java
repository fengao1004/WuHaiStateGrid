package com.whstategrid.wuhaistategrid.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.whstategrid.wuhaistategrid.R;

/**
 * Created by 冯傲 on 2016/8/14.
 * e-mail 897840134@qq.com
 */
public class DialogUp extends Dialog {
    public DialogUp(Context context) {
        super(context);
    }

    public DialogUp(Context context, int theme) {
        super(context, theme);
    }

    public static class Builder {
        private Context context;
        public  onUpClickListener l=null ;


        public Builder(Context context) {
            this.context = context;
        }




        public DialogAdd create() {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            final DialogAdd dialog = new DialogAdd(context,R.style.Dialog);
            View layout = inflater.inflate(R.layout.dialog_up, null);
            dialog.addContentView(layout, new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            layout.findViewById(R.id.et_noup).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });
            layout.findViewById(R.id.et_up).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                  if(l!=null){
                      l.onClick();
                      dialog.dismiss();
                  }
                }
            });
            dialog.setContentView(layout);
            return dialog;
        }
        public void setOnClick(onUpClickListener l){
            this.l = l;
        }


    }

    public interface onUpClickListener{
        void onClick();
    }
}
