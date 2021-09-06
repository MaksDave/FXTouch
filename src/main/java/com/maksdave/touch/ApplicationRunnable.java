package com.maksdave.touch;

import com.maksdave.touch.enums.LandingPages;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationRunnable extends Application{
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(LandingPages.ENTER_LANDING.getLink()));
        stage.setScene(new Scene(root, 1920, 1080));
        stage.setTitle("Hello!");
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}