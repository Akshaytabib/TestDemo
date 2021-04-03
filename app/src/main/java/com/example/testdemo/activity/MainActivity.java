package com.example.testdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.testdemo.R;

public class MainActivity extends AppCompatActivity {

    Button btnnew,btnshow,btnupdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnnew=findViewById(R.id.btnnew);
        btnshow=findViewById(R.id.btnshow);
        btnupdate=findViewById(R.id.btnupdate);

        btnnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this, NewActivity.class);
                startActivity(intent);

            }
        });

        btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this, ShowActivity.class);
                startActivity(intent);

            }
        });

        btnupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this, UpdateActivity.class);
                startActivity(intent);

            }
        });

    }
}