package com.maksdave.touch.interfaces;

import com.maksdave.touch.statistics.UsageCounter;
import com.maksdave.touch.statistics.WriteToFile;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public interface RedirectHandler {

    default void makeRedirect(Button clicked, String redirect) throws IOException {
        var fxmlURL = getClass().getResource(redirect);
        if (fxmlURL != null) {
            System.out.println("Url : " + fxmlURL.toString() +" for files " + redirect);
        } else {
            System.out.println("Url is null for file " + redirect );
        }
        /*UsageCounter.ADDOVERALLCLICKSAMOUNT();
        WriteToFile writeToFile = new WriteToFile(redirect);*/
        Parent root = FXMLLoader.load(fxmlURL);
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
}
