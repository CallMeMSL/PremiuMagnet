package com.example.premiumagnet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MagnetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MagnetActivityController controller = new MagnetActivityController(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magnet);
        TextView text = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();
        String magnetLink = intent.getData().toString();
        text.setText(magnetLink);
        controller.uploadMagnetLink(magnetLink, this);

    }
}
