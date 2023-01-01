module com.example.universityeducationmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.universityeducationmanagementsystem to javafx.fxml;
    exports com.example.universityeducationmanagementsystem;
}