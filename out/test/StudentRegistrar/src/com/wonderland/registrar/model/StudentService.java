package com.wonderland.registrar.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


public class StudentService {
    private static StudentService instance = new StudentService();
    private List<StudentModel> students = new ArrayList<>();

    private StudentService() {

    }


    public static StudentService getInstance() {
        return instance;
    }

    public static void setInstance(StudentService instance) {
        StudentService.instance = instance;
    }

    public List<StudentModel> getStudents() {
        return students;
    }

    public void setStudents(List<StudentModel> students) {
        this.students = students;
    }

    public void addToFile() {
        try {

          var list = students.stream()
                                                    .map(StudentModel::toData)
                                                    .collect(Collectors.toList());

                ObjectMapper writer = new ObjectMapper();
               writer.configure(SerializationFeature.INDENT_OUTPUT,true);
               writer.writeValue(new File("data.json"), new NewStudent(list));


        } catch (IOException e) {
            System.out.println("IO Exception when writing on student.txt: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void getStudentFromFile() {

        try {
            var reader = new ObjectMapper();
            NewStudent student = reader.readValue(new File("data.json"), NewStudent.class);

            List<StudentModel> modelList = student.getStudentList()
                                          .stream()
                                        .map(StudentModel.Student::toModel)
                                        .collect(Collectors.toList());
               students.addAll(modelList);
            System.out.println(students);
        }

        catch (IOException e){
            System.out.println("IO Exception when loading student.json into list: "+ e.getMessage());
            e.printStackTrace();
        }

         }

    public void addStudent(StudentModel student) {
        students.add(student);
    }
}
