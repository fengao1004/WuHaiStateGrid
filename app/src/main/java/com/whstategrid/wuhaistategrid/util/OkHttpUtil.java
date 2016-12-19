package com.whstategrid.wuhaistategrid.util;

import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Created by 冯傲 on 2016/8/13.
 * e-mail 897840134@qq.com
 */
public class OkHttpUtil {
    OkHttpCallBack ocb;
    private final OkHttpClient client = new OkHttpClient();

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    public void call(String url, String json,  OkHttpCallBack ocb){
        this.ocb = ocb;
        RequestBody requestBody = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();
        Call call1 = client.newCall(request);
        call1.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                OkHttpUtil.this.ocb.error(request,e);
            }

            @Override
            public void onResponse(Response response) throws IOException {
                OkHttpUtil.this.ocb.sucess(response);
            }
        });

    }

    private String  bean2Json(Object call) {
        Gson gson = new Gson();
        return  gson.toJson(call);

    }

    public interface  OkHttpCallBack{
        void sucess(Response response);
        void error(Request request, IOException e);
    }
}
