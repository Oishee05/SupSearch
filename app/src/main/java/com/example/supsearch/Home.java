package com.example.supsearch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity implements View.OnClickListener {

    Button yourAccount;
    Button qrcode;
    Button search;
    Button chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        yourAccount = (Button) findViewById(R.id.yourAccount);
        qrcode = (Button) findViewById(R.id.qrcode);
        search = (Button) findViewById(R.id.search);
        chat = (Button) findViewById(R.id.chat);
        yourAccount.setOnClickListener(this);
        qrcode.setOnClickListener(this);
        search.setOnClickListener(this);
        chat.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.yourAccount:
                Intent acc = new Intent(Home.this, Account.class);
                startActivity(acc);
                break;
            case R.id.qrcode:
                Intent generateqr = new Intent(Home.this, QRGenerator.class);
                startActivity(generateqr);
                break;
            case R.id.search:
                Intent s = new Intent(Home.this, Search.class);
                startActivity(s);
                break;
            case R.id.chat:
                Intent cr = new Intent(Home.this, Chatroom.class);
                startActivity(cr);
                break;
        }
    }
}



