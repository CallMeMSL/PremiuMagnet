package com.example.premiumagnet;

import android.support.v7.app.AppCompatActivity;

public class MagnetActivityController {

    private KeyHandler keyHandler;
    private ApiHandler apiHandler;

    MagnetActivityController(AppCompatActivity magnetActivity) {
        super();
        keyHandler = new KeyHandler(magnetActivity);
    }

    String getApiKey() {
        return keyHandler.getApiKey();
    }
}
