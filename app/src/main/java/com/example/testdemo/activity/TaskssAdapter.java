package com.example.testdemo.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testdemo.R;

import java.util.List;

public class TaskssAdapter extends RecyclerView.Adapter<TaskssAdapter.ViewHolder> {

    Context context;
    List<Task> tasks;
    public TaskssAdapter(ShowActivity showActivity, List<Task> tasks) {

        this.context=showActivity;
        this.tasks=tasks;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.itemlayout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    Task task=tasks.get(position);

        holder.name.setText(task.getName());
        holder.address.setText(task.getAddress());
        holder.mobile.setText(task.getMobileno());
        holder.email.setText(task.getEmail());

        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,UpdateActivity.class);
                intent.putExtra("name", (Parcelable) holder.name);
                intent.putExtra("address", (Parcelable) holder.address);
                intent.putExtra("mobile", (Parcelable) holder.mobile);
                intent.putExtra("email", (Parcelable) holder.email);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,address,mobile,email;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name=(itemView).findViewById(R.id.txtname);
            address=(itemView).findViewById(R.id.txtaddress);
            mobile=(itemView).findViewById(R.id.txtmobono);
            email=(itemView).findViewById(R.id.txtemail);

        }
    }
}
