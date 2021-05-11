package com.wonderland.registrar.model;

import java.util.List;


public class NewStudent {

    private List<StudentModel.Student> studentList;


    public NewStudent() {
    }

    public NewStudent(List<StudentModel.Student> studentList) {
        this.studentList = studentList;
    }

    public List<StudentModel.Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<StudentModel.Student> studentList) {
        this.studentList = studentList;
    }

}
