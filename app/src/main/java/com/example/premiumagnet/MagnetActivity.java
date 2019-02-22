package com.example.premiumagnet;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
public class MagnetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MagnetActivityController controller = new MagnetActivityController(this);
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String magnetLink = intent.getData().toString();
        controller.uploadMagnetLink(magnetLink, this);
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.premiumize.me/downloader"));
        startActivity(browserIntent);
        finish();
    }
}
