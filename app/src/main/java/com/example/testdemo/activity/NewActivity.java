package com.example.testdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.testdemo.R;

import java.util.List;

import static com.example.testdemo.activity.DataBaseClient.taskhhandler;

public class NewActivity extends AppCompatActivity {

    EditText name,address,mobno,emailid;
    Button btnsave;
    Task tasks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        name=findViewById(R.id.empname);
        address=findViewById(R.id.address);
        mobno=findViewById(R.id.mobileno);
        emailid=findViewById(R.id.mobileno);
        btnsave=findViewById(R.id.btnsave);
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mname=name.getText().toString();
                String maddress=address.getText().toString();
                String mobileno=mobno.getText().toString();
                String memail=emailid.getText().toString();

                tasks=new Task();
                tasks.setName(mname);
                tasks.setName(maddress);
                tasks.setName(mobileno);
                tasks.setName(memail);

                DataBaseClient.getDataBaseClient(NewActivity.this).taskhhandlerss().taskdeo.insertData(tasks);

                Toast.makeText(NewActivity.this, "Successfully inserted", Toast.LENGTH_SHORT).show();

            }
        });
    }
}