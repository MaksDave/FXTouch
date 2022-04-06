package com.maksdave.touch;

import com.maksdave.touch.enums.LandingPagesEnum;
import com.maksdave.touch.interfaces.RedirectHandler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ApplicationRunnable extends Application implements RedirectHandler{
    Button noButton;
    @Override
    public void start(Stage stage)  throws IOException {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(LandingPagesEnum.INTRO_LANDING.getLink())));
            stage.setScene(new Scene(root, 854, 480));
            stage.setTitle("Hello!");
            stage.setFullScreen(false);
            stage.setFullScreenExitHint("");
            stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}