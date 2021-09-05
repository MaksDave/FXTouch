package com.maksdave.touch.controller;

import com.maksdave.touch.interfaces.RedirectHandler;
import com.maksdave.touch.enums.Landings;
import javafx.scene.control.Button;
import javafx.scene.input.TouchEvent;

import java.io.IOException;

public class usageLandingPage implements RedirectHandler {

    public Button returnButton;

    public void clickedReturn() throws IOException {
        makeRedirect(returnButton, Landings.CHOOSE_LANDING.getLink());
    }

    public void touchedReturn(TouchEvent touchEvent) throws IOException {
        clickedReturn();
    }
}
