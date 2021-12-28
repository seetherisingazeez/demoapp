package com.devwithcoffee.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {

    String receivedMessage = "";
    TextView receivedMessageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        Intent intent = getIntent();
        receivedMessage = intent.getStringExtra("message");
        receivedMessageView = findViewById(R.id.received_message);

        receivedMessageView.setText(receivedMessage);


    }
}