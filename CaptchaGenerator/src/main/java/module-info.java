module com.example.captchagenerator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.captchagenerator to javafx.fxml;
    exports com.example.captchagenerator;
}