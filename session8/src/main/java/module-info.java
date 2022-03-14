module com.example.session8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.session8 to javafx.fxml;
    exports com.example.session8;
}