package com.maksdave.touch.controller;

import com.maksdave.touch.interfaces.RedirectHandler;
import com.maksdave.touch.enums.LandingPages;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class Enter implements RedirectHandler {

    
    public Button enterButton;
    
    public ImageView mainScreen;

    public void clickedEnter() throws IOException {
        makeRedirect(enterButton, LandingPages.CHOOSE_LANDING.getLink());
    }

    public void touchedEnter() throws IOException {
        clickedEnter();
    }


   /* 
    protected void onMainButtonClick() {
        MainText.setText("Welcome to JavaFX Application!");
    }*/
}
