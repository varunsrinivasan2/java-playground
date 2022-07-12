module com.galvanize.javaplayground {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.galvanize.javaplayground to javafx.fxml;
    exports com.galvanize.javaplayground;
}