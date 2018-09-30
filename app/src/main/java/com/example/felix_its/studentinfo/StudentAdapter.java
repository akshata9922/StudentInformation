package com.example.felix_its.studentinfo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {

    private List<Student>studentList;
    RecyclerViewClickListener listener;


    public StudentAdapter(List<Student> studentList,RecyclerViewClickListener listener ) {
        this.listener=listener;
        this.studentList = studentList;
    }

    @NonNull
    @Override
    //Create Data
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.student_info_list,null);
        return new StudentViewHolder(view,listener);
    }

    @Override
    //set Data onBind
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student student=studentList.get(position);
        //holder.img1.setImageResource(student.getImg1());
        holder.txtName.setText("Name: "+student.getName());
        holder.txtclgname.setText("College Name: "+student.getClgName());
        holder.txtcourse.setText("Course Name :"+student.getCourse());
        holder.txtbranch.setText("Branch: "+student.getBranch());
        holder.txtaddress.setText("Address: "+student.getAddress());


    }

    @Override
    //getCount size of data
    public int getItemCount()
    {
        return studentList.size();
    }
}
