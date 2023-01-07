package com.example.cgp_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

     public void enterapp(View v){
        v.setEnabled(false);
        Button button = (Button)v;
        button.setText("Welcome To CGP");


     }
}
