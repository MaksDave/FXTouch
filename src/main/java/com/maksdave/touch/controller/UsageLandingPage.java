package com.maksdave.touch.controller;

import com.maksdave.touch.enums.UsageVideos;
import com.maksdave.touch.interfaces.RedirectHandler;
import com.maksdave.touch.enums.LandingPages;
import javafx.scene.control.Button;
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
    public void clickedVideo2() throws IOException {
        PlayerPage.setVideoSource(UsageVideos.VIDEO2.getLink());
        makeRedirect(video2,LandingPages.PLAYER_LANDING.getLink());
    }

    public void touchedVideo2() throws IOException {
        clickedVideo2();
    }
    public void clickedVideo3() throws IOException {
        PlayerPage.setVideoSource(UsageVideos.VIDEO3.getLink());
        makeRedirect(video3,LandingPages.PLAYER_LANDING.getLink());
    }

    public void touchedVideo3() throws IOException {
        clickedVideo3();
    }
    public void clickedVideo4() throws IOException {
        PlayerPage.setVideoSource(UsageVideos.VIDEO4.getLink());
        makeRedirect(video4,LandingPages.PLAYER_LANDING.getLink());
    }

    public void touchedVideo4() throws IOException {
        clickedVideo4();
    }

}
