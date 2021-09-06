package com.maksdave.touch.controller;

import com.maksdave.touch.enums.AspectsVideos;
import com.maksdave.touch.enums.LandingPages;
import com.maksdave.touch.interfaces.RedirectHandler;
import javafx.scene.control.Button;

import java.io.IOException;

public class AspectsLandingPage implements RedirectHandler {

    public Button returnButton;
    
    public Button video1;
    
    public Button video2;
    
    public Button video3;
    
    public Button video4;
    
    public Button video5;
    
    public Button video6;

    public void clickedReturn() throws IOException {
        makeRedirect(returnButton, LandingPages.CHOOSE_LANDING.getLink());
    }

    public void touchedReturn() throws IOException {
        clickedReturn();
    }

    public void clickedVideo1() throws IOException {
        PlayerPage.setVideoSource(AspectsVideos.VIDEO1.getLink());
        makeRedirect(video1,LandingPages.PLAYER_LANDING.getLink());
    }

    public void touchedVideo1() throws IOException {
        clickedVideo1();
    }
    public void clickedVideo2() throws IOException {
        PlayerPage.setVideoSource(AspectsVideos.VIDEO2.getLink());
        makeRedirect(video2,LandingPages.PLAYER_LANDING.getLink());
    }

    public void touchedVideo2() throws IOException {
        clickedVideo2();
    }
    public void clickedVideo3() throws IOException {
        PlayerPage.setVideoSource(AspectsVideos.VIDEO3.getLink());
        makeRedirect(video3,LandingPages.PLAYER_LANDING.getLink());
    }

    public void touchedVideo3() throws IOException {
        clickedVideo3();
    }
    public void clickedVideo4() throws IOException {
        PlayerPage.setVideoSource(AspectsVideos.VIDEO4.getLink());
        makeRedirect(video4,LandingPages.PLAYER_LANDING.getLink());
    }

    public void touchedVideo4() throws IOException {
        clickedVideo4();
    }
    public void clickedVideo5() throws IOException {
        PlayerPage.setVideoSource(AspectsVideos.VIDEO5.getLink());
        makeRedirect(video5,LandingPages.PLAYER_LANDING.getLink());
    }

    public void touchedVideo5() throws IOException {
        clickedVideo5();
    }
    public void clickedVideo6() throws IOException {
        PlayerPage.setVideoSource(AspectsVideos.VIDEO6.getLink());
        makeRedirect(video6,LandingPages.PLAYER_LANDING.getLink());
    }

    public void touchedVideo6() throws IOException {
        clickedVideo6();
    }
}
