package com.wonderland.registrar;

//import com.wonderland.registrar.model.StudentService;
import com.wonderland.registrar.model.StudentService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        primaryStage.setTitle("Student Registrar Form");
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
    }


   public void init() throws Exception {
        StudentService.getInstance().getStudentFromFile();
    }

    @Override
    public void stop() throws Exception {

        StudentService.getInstance().addToFile();
            }



    public static void main(String[] args) {
         Application.launch(Main.class, args);
    }
}
