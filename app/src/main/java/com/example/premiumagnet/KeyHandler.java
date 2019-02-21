package com.example.premiumagnet;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class KeyHandler {
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    KeyHandler(final Context activity) {
        preferences = PreferenceManager.getDefaultSharedPreferences(activity);
        editor = preferences.edit();
    }

    public String getApiKey() {
        return preferences.getString("apiKey", "");
    }

    public void setApiKey(String apiKey) {
        editor.putString("apiKey", apiKey);
        editor.commit();
    }
}
