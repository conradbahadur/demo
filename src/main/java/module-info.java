module com.example.demo123 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo123 to javafx.fxml;
    exports com.example.demo123;
}