package com.example.premiumagnet;


import android.content.Context;
import android.util.Log;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interceptors.GzipRequestInterceptor;
import com.androidnetworking.interfaces.JSONObjectRequestListener;

import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.OkHttpClient;

public class ApiHandler {

    void pushMagnet(final String apiKey, final String magnetLink, final Context context) {
        final String url = "https://premiumize.me/api/transfer/create?apikey=" + apiKey;
        JSONObject srcMagnet = new JSONObject();
        try {
            srcMagnet.put("src", magnetLink);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        OkHttpClient client = new OkHttpClient().newBuilder()
                .addInterceptor(new GzipRequestInterceptor()).build();
        AndroidNetworking.initialize(context, client);

        AndroidNetworking.post(url)
                .addHeaders("accept", "application/json")
                .addHeaders("Content-Type", "multipart/form-data")
                .addQueryParameter("src", magnetLink)
                .build().getAsJSONObject(new JSONObjectRequestListener() {
            @Override
            public void onResponse(JSONObject response) {
                Log.e("Server response:", response.toString());
            }

            @Override
            public void onError(ANError anError) {
                Log.e("Server error:", anError.toString());
            }
        });

    }
}