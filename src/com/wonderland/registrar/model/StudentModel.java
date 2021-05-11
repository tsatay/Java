package com.wonderland.registrar.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class StudentModel {

    public StringProperty firstName = new SimpleStringProperty();
    public StringProperty lastName = new SimpleStringProperty();
    public StringProperty email = new SimpleStringProperty();
    public IntegerProperty id = new SimpleIntegerProperty();


      public Student toData(){
        return new Student(firstName.get(), lastName.get(),email.get(), id.get());
             }

    public static class Student {
        private String firstName;

        private String lastName;
        private String email;
        private int  studentId;

        public Student() {
        }

        public Student(String firstName, String lastName, String email, int studentId) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.studentId = studentId;
        }


        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public StudentModel toModel(){
            var model = new StudentModel();
            model.firstName.set(firstName);
            model.lastName.set(lastName);
            model.email.set(email);
            model.id.set(studentId);
            return model;
        }




    }


}
