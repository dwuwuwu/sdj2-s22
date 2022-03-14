module com.example.solutions6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.solutions6 to javafx.fxml;
    exports com.example.solutions6;
}