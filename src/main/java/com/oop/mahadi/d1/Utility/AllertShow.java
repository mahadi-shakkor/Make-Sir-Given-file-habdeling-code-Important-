package com.oop.mahadi.d1.Utility;

import javafx.scene.control.Alert;

public class AllertShow {



    public static void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
