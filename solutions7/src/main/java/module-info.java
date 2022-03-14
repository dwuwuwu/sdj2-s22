module com.example.solutions7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.solutions7 to javafx.fxml;
    exports com.example.solutions7;
}