package com.example.premiumagnet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    MainActivityController controller;

    private EditText tfApiKey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tfApiKey = (EditText) findViewById(R.id.tfApiKey);
        Button btSave = (Button) findViewById(R.id.btSave);

        controller = new MainActivityController(this);
        String key = controller.getApiKey();

        if (!key.equals("")) {
            tfApiKey.setText(controller.getApiKey());
        }

        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String key = tfApiKey.getText().toString();
                controller.setApiKey(key);
            }
        });
    }
}
