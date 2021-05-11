package com.wonderland.registrar;


import com.wonderland.registrar.model.StudentModel;
import com.wonderland.registrar.model.StudentService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;



public class Controller {


    @FXML
    private TextField newStudentFirstNameField;
    @FXML
    private TextField newStudentLastNameTextField;
    @FXML
    private TextField newStudentEmailTextField;
    @FXML
    private TextField newStudentIdTextField;
    @FXML
    private Button submitButton;


   public void onSubmit() throws Exception {

       StudentModel student = new StudentModel();
        student.firstName.setValue(newStudentFirstNameField.getText());
        student.lastName.setValue(newStudentLastNameTextField.getText());
        student.email.setValue(newStudentEmailTextField.getText());
        student.id.setValue(Integer.parseInt(newStudentIdTextField.getText()));



       StudentService.getInstance().addStudent(student);
       StudentService.getInstance().addToFile();







    }

}
