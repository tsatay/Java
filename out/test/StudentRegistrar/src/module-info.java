module StudentRegistrar {
      requires javafx.fxml;
      requires javafx.controls;
      requires com.fasterxml.jackson.databind;
      exports com.wonderland.registrar.model;

    opens com.wonderland.registrar;
}