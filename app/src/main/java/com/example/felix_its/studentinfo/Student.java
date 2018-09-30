package com.example.felix_its.studentinfo;

public class Student {
    private int img1;
    private String name;
    private String clgName;
    private String  Course;
    private String Branch;
    private String address;

    public Student(int img1, String name, String clgName, String course, String branch, String address) {
        this.img1 = img1;
        this.name = name;
        this.clgName = clgName;
        Course = course;
        Branch = branch;
        this.address = address;
    }


    public int getImg1() {
        return img1;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClgName() {
        return clgName;
    }

    public void setClgName(String clgName) {
        this.clgName = clgName;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
