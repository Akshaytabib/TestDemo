package com.example.testdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.testdemo.R;

public class UpdateActivity extends AppCompatActivity {

    EditText name,address,mobno,emailid;
    Button btnsave;
    Task tasks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        name=findViewById(R.id.empname);
        address=findViewById(R.id.address);
        mobno=findViewById(R.id.mobileno);
        emailid=findViewById(R.id.mobileno);

        name.setText(getIntent().getStringExtra("name"));
        address.setText(getIntent().getStringExtra("address"));
        mobno.setText(getIntent().getStringExtra("mobile"));
        emailid.setText(getIntent().getStringExtra("email"));

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

                DataBaseClient.getDataBaseClient(UpdateActivity.this).taskhhandlerss().taskdeo.updatetask(tasks);

                Toast.makeText(UpdateActivity.this, "Successfully inserted", Toast.LENGTH_SHORT).show();

            }
        });

    }
}