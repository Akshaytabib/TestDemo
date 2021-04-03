package com.example.testdemo.activity;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Task.class} , version = 1)
public abstract class Taskhhandler extends RoomDatabase {

    public static Taskdeo taskdeo;

}
