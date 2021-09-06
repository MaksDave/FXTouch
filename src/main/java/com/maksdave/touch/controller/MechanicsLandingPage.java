package com.maksdave.touch.controller;

import com.maksdave.touch.enums.MechanicsVideos;
import com.maksdave.touch.interfaces.RedirectHandler;
import com.maksdave.touch.enums.LandingPages;
import javafx.scene.control.Button;
import javafx.scene.input.TouchEvent;

import java.io.IOException;

public class MechanicsLandingPage implements RedirectHandler {
    
    public Button returnButton;

    public Button videoButton1;

    public void clickedReturn() throws IOException {
        makeRedirect(returnButton, LandingPages.CHOOSE_LANDING.getLink());
    }

    public void touchedReturn(TouchEvent touchEvent) throws IOException {
        clickedReturn();
    }

    public void clickedVideo1() throws IOException {
        PlayerPage.setVideoSource(MechanicsVideos.VIDEO1.getLink());
        makeRedirect(videoButton1,LandingPages.PLAYER_LANDING.getLink());
    }

    public void touchedVideo1(TouchEvent touchEvent) throws IOException {
        clickedVideo1();
    }
}
