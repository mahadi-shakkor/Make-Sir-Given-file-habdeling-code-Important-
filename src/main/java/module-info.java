module com.oop.mahadi.d1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.mahadi.d1 to javafx.fxml;
    exports com.oop.mahadi.d1;
    exports com.oop.mahadi.d1.Controller;
    opens com.oop.mahadi.d1.Controller to javafx.fxml;
}
//module com.oop.mahadi.d1 {
//        requires javafx.controls;
//        requires javafx.fxml;
//
//        // Open the package to javafx.base
//        opens com.oop.mahadi.d1.Utility to javafx.base;
//
//        // Export your packages as needed
//        exports com.oop.mahadi.d1;
//        }