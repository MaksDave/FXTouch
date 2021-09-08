package com.maksdave.touch.controller;

import com.maksdave.touch.enums.AspectsVideos;
import com.maksdave.touch.enums.LandingPages;
import com.maksdave.touch.enums.UsageVideos;
import com.maksdave.touch.interfaces.RedirectHandler;
import com.maksdave.touch.interfaces.VideoPlayer;
import javafx.scene.control.Button;

import java.io.IOException;

public class AspectsLandingPage implements RedirectHandler, VideoPlayer {

    public Button returnButton;
    
    public Button video1;
    
    public Button video2;
    
    public Button video3;
    
    public Button video4;
    
    public Button video5;
    
    public Button video6;
    
    private static int aV1;
    private static int aV2;
    private static int aV3;
    private static int aV4;
    private static int aV5;
    private static int aV6;
    

    public void clickedReturn() throws IOException {
        makeRedirect(returnButton, LandingPages.CHOOSE_LANDING.getLink());
    }

    public void touchedReturn() throws IOException {
        clickedReturn();
    }

    public void clickedVideo1() throws IOException {
        aV1++;
        runPlayer(AspectsVideos.VIDEO1.getLink(),video1,aV1);
    }

    public void touchedVideo1() throws IOException {
        clickedVideo1();
    }
    public void clickedVideo2() throws IOException {
        aV2++;
        runPlayer(AspectsVideos.VIDEO2.getLink(),video2,aV2);
    }

    public void touchedVideo2() throws IOException {
        clickedVideo2();
    }
    public void clickedVideo3() throws IOException {
        aV3++;
        runPlayer(AspectsVideos.VIDEO3.getLink(),video3,aV3);
    }

    public void touchedVideo3() throws IOException {
        clickedVideo3();
    }
    public void clickedVideo4() throws IOException {
        aV4++;
        runPlayer(AspectsVideos.VIDEO4.getLink(),video4,aV4);
    }

    public void touchedVideo4() throws IOException {
        clickedVideo4();
    }
    public void clickedVideo5() throws IOException {
        aV5++;
        runPlayer(AspectsVideos.VIDEO5.getLink(),video5,aV5);
    }

    public void touchedVideo5() throws IOException {
        clickedVideo5();
    }
    public void clickedVideo6() throws IOException {
        aV6++;
        runPlayer(AspectsVideos.VIDEO6.getLink(),video6,aV6);
    }

    public void touchedVideo6() throws IOException {
        clickedVideo6();
    }
}
