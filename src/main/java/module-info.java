module com.example.datepickerfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.datepickerfx to javafx.fxml;
    exports com.example.datepickerfx;
}