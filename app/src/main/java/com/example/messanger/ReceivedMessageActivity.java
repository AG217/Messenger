package com.example.messanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ReceivedMessageActivity extends AppCompatActivity {

    private TextView textViewReceivedMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_message);
        textViewReceivedMsg = findViewById(R.id.textViewReceivedMsg);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        textViewReceivedMsg.setText(msg);
    }

    public void back(View view) {
        finish();
    }
}