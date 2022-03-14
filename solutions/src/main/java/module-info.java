module com.example.solutions {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.solutions to javafx.fxml;
    exports com.example.solutions;
}