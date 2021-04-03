package com.example.testdemo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.testdemo.R;

import java.util.ArrayList;
import java.util.List;

public class ShowActivity extends AppCompatActivity {

    RecyclerView recyclerView;

     TaskssAdapter taskAdapter;
     List<Task> tasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        recyclerView = findViewById(R.id.reycleview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(ShowActivity.this));

        tasks= DataBaseClient.getDataBaseClient(ShowActivity.this).taskhhandlerss().taskdeo.getAll();

        taskAdapter=new TaskssAdapter(this,tasks);
        recyclerView.setAdapter(taskAdapter);

    }
}