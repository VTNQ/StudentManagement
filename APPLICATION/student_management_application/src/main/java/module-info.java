module com.mg.student_management_application {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mg.student_management_application to javafx.fxml;
    exports com.mg.student_management_application;
}