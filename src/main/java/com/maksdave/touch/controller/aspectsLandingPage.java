package com.maksdave.touch.controller;

import com.maksdave.touch.interfaces.RedirectHandler;
import com.maksdave.touch.enums.Landings;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TouchEvent;
import javafx.scene.media.MediaView;

import java.io.IOException;

public class aspectsLandingPage implements RedirectHandler {
    @FXML
    public Button returnButton;
    @FXML
    public MediaView video1;
    @FXML
    public MediaView video2;
    @FXML
    public MediaView video3;
    @FXML
    public MediaView video4;
    @FXML
    public MediaView video5;
    @FXML
    public MediaView video6;

    public void clickedReturn() throws IOException {
        makeRedirect(returnButton,Landings.CHOOSE_LANDING.getLink());
    }

    public void touchedReturn() throws IOException {
        clickedReturn();
    }

    public void clickedVideo1(MouseEvent mouseEvent) {
    }

    public void touchedVideo1(TouchEvent touchEvent) {
    }
    public void clickedVideo2(MouseEvent mouseEvent) {
    }

    public void touchedVideo2(TouchEvent touchEvent) {
    }
    public void clickedVideo3(MouseEvent mouseEvent) {
    }

    public void touchedVideo3(TouchEvent touchEvent) {
    }
    public void clickedVideo4(MouseEvent mouseEvent) {
    }

    public void touchedVideo4(TouchEvent touchEvent) {
    }
    public void clickedVideo5(MouseEvent mouseEvent) {
    }

    public void touchedVideo5(TouchEvent touchEvent) {
    }
    public void clickedVideo6(MouseEvent mouseEvent) {
    }

    public void touchedVideo6(TouchEvent touchEvent) {
    }
}
