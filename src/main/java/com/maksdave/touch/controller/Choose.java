package com.maksdave.touch.controller;

import com.maksdave.touch.interfaces.RedirectHandler;
import com.maksdave.touch.enums.Landings;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Choose implements RedirectHandler {

    @FXML
    public Button practicalAspectsButton;
    @FXML
    public Button usageButton;
    @FXML
    public Button mechanicsButton;

    public void ClickToPractical() throws IOException {
        makeRedirect(practicalAspectsButton, Landings.ASPECTS_LANDING.getLink());
    }

    public void TouchToPractical() throws IOException {
        ClickToPractical();
    }

    public void clickedUsage() throws IOException {
        makeRedirect(usageButton,Landings.USAGE_LANDING.getLink());
    }

    public void touchedUsage() throws IOException {
        clickedUsage();
    }

    public void clickedMechanics() throws IOException {
        makeRedirect(mechanicsButton,Landings.MECHANICS_LANDING.getLink());
    }

    public void touchedMechanics() throws IOException {
        clickedMechanics();
    }

    //Node and resource URL for scene swap.
    
}
