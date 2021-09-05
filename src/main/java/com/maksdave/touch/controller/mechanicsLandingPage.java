package com.maksdave.touch.controller;

import com.maksdave.touch.interfaces.RedirectHandler;
import com.maksdave.touch.enums.Landings;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.TouchEvent;
import javafx.scene.media.MediaView;

import java.io.IOException;

public class mechanicsLandingPage implements RedirectHandler {
    @FXML
    public Button returnButton;
    @FXML
    public MediaView video1;

    public void clickedReturn() throws IOException {
        makeRedirect(returnButton, Landings.CHOOSE_LANDING.getLink());
    }

    public void touchedReturn(TouchEvent touchEvent) throws IOException {
        clickedReturn();
    }
}
