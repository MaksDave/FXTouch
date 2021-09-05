package com.maksdave.touch.interfaces;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public interface RedirectHandler {

    default void makeRedirect(Button clicked, String redirect) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(redirect));
        Stage window = (Stage) clicked.getScene().getWindow();
        window.setScene(new Scene(root,1920,1080));
    }
}
