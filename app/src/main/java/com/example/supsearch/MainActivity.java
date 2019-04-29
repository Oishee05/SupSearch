package com.example.supsearch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button StartButton;
    UserLocalData userLocalData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StartButton = (Button) findViewById(R.id.StartButton);
        //StartButton.setOnClickListener(this);
        userLocalData = new UserLocalData(this);
    }

    /**public void onClick(View v) {
        switch (v.getId()) {
            case R.id.StartButton:
                Intent start = new Intent(MainActivity.this, Login.class);
                startActivity(start);
                break;
        }
    } **/
    protected void onStart() {
        super.onStart();
        if (authenticate() == false) {
            startActivity(new Intent(MainActivity.this, Login.class));
        } else {
            Intent start = new Intent(MainActivity.this, Login.class);
            startActivity(start);
        }

    }

    private boolean authenticate() {
        return userLocalData.getUserLoggedIn();
    }
}