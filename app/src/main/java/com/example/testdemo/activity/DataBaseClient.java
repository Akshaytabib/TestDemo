package com.example.testdemo.activity;

import android.content.Context;
import android.provider.ContactsContract;

import androidx.room.Room;
import androidx.room.RoomDatabase;

public class DataBaseClient {

   public static Context context;

   public static DataBaseClient dataBaseClient=null;

   public static Taskhhandler taskhhandler;

    public DataBaseClient(Context context)  {
        this.context=context;
        taskhhandler= Room.databaseBuilder(context,Taskhhandler.class,"TaskDB").allowMainThreadQueries().build();
    }

    public static synchronized DataBaseClient getDataBaseClient(Context context){
        if(dataBaseClient==null){
            dataBaseClient=new DataBaseClient(context);
        }
        return dataBaseClient;
    }

    public Taskhhandler taskhhandlerss(){
        return taskhhandler;
    }
}
