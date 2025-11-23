module com.example.integradoraagendapersonal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.integradoraagendapersonal to javafx.fxml;
    exports com.example.integradoraagendapersonal;
}