package com.example.lenovo.collabapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=(Button)findViewById(R.id.login);
    }
    public void onClick(View view)
    {
        Intent intent=new Intent(MainActivity.this,BoardActivity.class);
        startActivity(intent);
    }
}
