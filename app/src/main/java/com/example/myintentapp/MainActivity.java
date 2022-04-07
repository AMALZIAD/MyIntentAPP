package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Connect(View view) {
        EditText txtlogin =findViewById(R.id.txtuser);
        EditText txtpwd=findViewById(R.id.txtpwd);

        Intent intent =new Intent(this,DataActivity.class);
        Bundle bundle  = new Bundle();
        bundle.putString("Name",txtlogin.getText().toString());
        bundle.putString("pwd",txtpwd.getText().toString());
        startActivity(intent);
    }
}