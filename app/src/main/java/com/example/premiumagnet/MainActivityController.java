package com.example.premiumagnet;

import android.support.v7.app.AppCompatActivity;

class MainActivityController {

    private KeyHandler keyHandler;

    MainActivityController(AppCompatActivity mainActivity) {
        keyHandler = new KeyHandler(mainActivity);
    }

    String getApiKey() {
        return keyHandler.getApiKey();
    }

    void setApiKey(String key) {
        keyHandler.setApiKey(key);
    }


}
