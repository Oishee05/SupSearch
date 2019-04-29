package com.example.supsearch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Account extends AppCompatActivity implements View.OnClickListener {
    Button logout;
    UserLocalData userLocalData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        logout = (Button) findViewById(R.id.logout);
        logout.setOnClickListener(this);
        userLocalData = new UserLocalData(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.logout:
                userLocalData.clearData();
                userLocalData.setLoggedIn(false);
                Intent end = new Intent(Account.this, Login.class);
                startActivity(end);
                break;
        }
    }


}