package com.maksdave.touch.controller;

import com.maksdave.touch.PlayerHandler;
import com.maksdave.touch.enums.UsageVideos;
import com.maksdave.touch.interfaces.RedirectHandler;
import com.maksdave.touch.enums.LandingPages;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TouchEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.io.IOException;

public class UsageLandingPage implements RedirectHandler {

    
    public Button returnButton;

    public Button video1;
    public Button video2;
    public Button video3;
    public Button video4;
    public PlayerPage playerPage;


    public void clickedReturn() throws IOException {
        makeRedirect(returnButton, LandingPages.CHOOSE_LANDING.getLink());
    }

    public void touchedReturn() throws IOException {
        clickedReturn();
    }

    public void clickedVideo1() throws IOException {
        PlayerPage.setVideoSource(UsageVideos.VIDEO1.getLink());
        makeRedirect(video1,LandingPages.PLAYER_LANDING.getLink());
    }

    public void touchedVideo1() throws IOException {
        clickedVideo1();
    }
    public void clickedVideo2(MouseEvent mouseEvent) throws IOException {
        PlayerPage.setVideoSource(UsageVideos.VIDEO1.getLink());
        makeRedirect(video1,LandingPages.PLAYER_LANDING.getLink());
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

}
