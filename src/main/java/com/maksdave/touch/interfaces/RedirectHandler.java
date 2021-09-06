package com.maksdave.touch.interfaces;

import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public interface RedirectHandler {

    default void makeRedirect(Button clicked, String redirect) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(redirect));
        Stage window = (Stage) clicked.getScene().getWindow();
        Scene scene = new Scene(root,1920,1080);
        window.setScene(scene);
        window.setFullScreen(true);
        window.setFullScreenExitHint("");
        window.addEventHandler(KeyEvent.KEY_RELEASED, (KeyEvent event) -> {
            if (KeyCode.ESCAPE == event.getCode()) {
                window.close();
            }
        });
    }
    default String makeRedirect(Button clicked, String redirect,String videoSource) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(redirect));
        Stage window = (Stage) clicked.getScene().getWindow();
        Scene scene = new Scene(root,1920,1080);
        window.setScene(scene);
        window.setFullScreen(true);
        window.setFullScreenExitHint("");
        window.addEventHandler(KeyEvent.KEY_RELEASED, (KeyEvent event) -> {
            if (KeyCode.ESCAPE == event.getCode()) {
                window.close();
            }
        });
        return videoSource;
    }
}
