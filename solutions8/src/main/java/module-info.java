module com.example.solutions8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.solutions8 to javafx.fxml;
    exports com.example.solutions8;
}