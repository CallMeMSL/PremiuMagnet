package com.example.premiumagnet;

import android.support.v7.app.AppCompatActivity;

import java.util.Observable;

class MainActivityController extends Observable {

    private KeyHandler keyHandler;

    MainActivityController(AppCompatActivity mainActivity) {
        super();
        keyHandler = new KeyHandler(mainActivity);
    }

    String getApiKey() {
        return keyHandler.getApiKey();
    }

    void setApiKey(String key) {
        keyHandler.setApiKey(key);
    }


}
