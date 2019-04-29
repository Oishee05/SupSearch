package com.example.supsearch;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button LoginButton;
    EditText enterNetID, enterPassword;    
    TextView linkRegister;

    UserLocalData userLocalData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        enterNetID = (EditText) findViewById(R.id.enterNetID);
        enterPassword = (EditText) findViewById(R.id.enterPassword);
        linkRegister = (TextView) findViewById(R.id.linkRegister);
        LoginButton.setOnClickListener(this);
        linkRegister.setOnClickListener(this);

        userLocalData = new UserLocalData(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.LoginButton:
                UserData user = new UserData(null, null);
                userLocalData.store(user);
                userLocalData.setLoggedIn(true);

                break;

            case R.id.linkRegister:
                startActivity(new Intent(this, Register.class));
                break;
        }
    }
}