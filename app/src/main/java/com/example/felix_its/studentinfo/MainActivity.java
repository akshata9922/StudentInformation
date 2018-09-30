package com.example.felix_its.studentinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerViewClickListener {
    RecyclerView rvStudent;
    List<Student>studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //orientation pass krta hai
        rvStudent=findViewById(R.id.rvStudent);
        rvStudent.setLayoutManager(new LinearLayoutManager(this));
        studentList=new ArrayList<>();


        studentList.add(new Student(R.drawable.ak,"Akshata Bhosale","JSPM","BE","Computer","Pune"));
        studentList.add(new Student(R.drawable.ak,"Akshay Divekar","JSPM","BE","Electrical","Pune"));
        studentList.add(new Student(R.drawable.ak,"Gauri Bhosale","JSPM","BE","Computer","Pune"));
        StudentAdapter studentAdapter =new StudentAdapter(studentList,this);
        rvStudent.setAdapter(studentAdapter);
    }

    @Override
    public void onClick(View view,int position) {
        Student student=studentList.get(position);
        Toast.makeText(this,student.getName(),Toast.LENGTH_SHORT).show();

    }
}
