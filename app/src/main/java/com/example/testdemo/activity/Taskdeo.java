package com.example.testdemo.activity;

import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public interface Taskdeo {

    @Query("select * from Task")
    List<Task> getAll();

    @Update
    void updatetask(Task task);

    @Insert
    void insertData(Task task);

}
