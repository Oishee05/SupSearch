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

public class Register extends AppCompatActivity implements View.OnClickListener {

    Button RegisterButton;
    EditText enterName, enterNetID, enterPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        enterName = (EditText) findViewById(R.id.enterName);
        enterNetID = (EditText) findViewById(R.id.enterNetID);
        enterPassword = (EditText) findViewById(R.id.enterPassword);
        RegisterButton = (Button) findViewById(R.id.RegisterButton);

        RegisterButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.RegisterButton:
                String name = enterName.getText().toString();
                String netID = enterNetID.getText().toString();
                String pwd = enterPassword.getText().toString();

                UserData registeredUser = new UserData(name, netID, pwd);
                startActivity(new Intent(this, Login.class));
                break;
        }
    }
}