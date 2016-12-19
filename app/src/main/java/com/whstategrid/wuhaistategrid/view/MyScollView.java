package com.whstategrid.wuhaistategrid.view;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by 冯傲 on 2016/8/13.
 * e-mail 897840134@qq.com
 */
public class MyScollView extends NestedScrollView {



        public MyScollView(Context context) {
            super(context);
        }

        public MyScollView(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        public MyScollView(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent ev) {
            final int action = ev.getAction();
            switch (action) {
                case MotionEvent.ACTION_DOWN:
                    Log.i("VerticalScrollview",
                            "onInterceptTouchEvent: DOWN super false");
                    super.onTouchEvent(ev);
                    break;

                case MotionEvent.ACTION_MOVE:
                    return false; // redirect MotionEvents to ourself

                case MotionEvent.ACTION_CANCEL:
                    Log.i("VerticalScrollview",
                            "onInterceptTouchEvent: CANCEL super false");
                    super.onTouchEvent(ev);
                    break;

                case MotionEvent.ACTION_UP:
                    Log.i("VerticalScrollview", "onInterceptTouchEvent: UP super false");
                    return false;

                default:
                    Log.i("VerticalScrollview", "onInterceptTouchEvent: " + action);
                    break;
            }

            return false;
        }

        @Override
        public boolean onTouchEvent(MotionEvent ev) {
            super.onTouchEvent(ev);
            Log.i("VerticalScrollview", "onTouchEvent. action: " + ev.getAction());
            return true;
        }

}
