package com.example.premiumagnet;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;


public class MagnetActivityController {

    private KeyHandler keyHandler;
    private ApiHandler apiHandler;

    MagnetActivityController(AppCompatActivity magnetActivity) {
        keyHandler = new KeyHandler(magnetActivity);
        apiHandler = new ApiHandler();
    }

    String getApiKey() {
        return keyHandler.getApiKey();
    }

    void uploadMagnetLink(String magnetLink, Context context) {
        String key = keyHandler.getApiKey();
        apiHandler.pushMagnet(key, magnetLink, context);
    }
}
