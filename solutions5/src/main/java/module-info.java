module com.example.solutions5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.solutions5 to javafx.fxml;
    exports com.example.solutions5;
}