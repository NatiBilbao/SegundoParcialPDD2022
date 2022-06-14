module com.example.segundoparcial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.segundoparcial to javafx.fxml;
    exports com.example.segundoparcial;
}