package com.maksdave.touch.controller;

import com.maksdave.touch.interfaces.RedirectHandler;
import com.maksdave.touch.enums.Landings;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class Enter implements RedirectHandler {

    @FXML
    public Button enterButton;
    @FXML
    public ImageView mainScreen;

    public void clickedEnter() throws IOException {
        makeRedirect(enterButton,Landings.CHOOSE_LANDING.getLink());
    }

    public void touchedEnter() throws IOException {
        clickedEnter();
    }


   /* @FXML
    protected void onMainButtonClick() {
        MainText.setText("Welcome to JavaFX Application!");
    }*/
}
