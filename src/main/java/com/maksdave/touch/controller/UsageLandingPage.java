package com.maksdave.touch.controller;

import com.maksdave.touch.enums.UsageVideos;
import com.maksdave.touch.interfaces.RedirectHandler;
import com.maksdave.touch.enums.LandingPages;
import com.maksdave.touch.interfaces.VideoPlayer;
import javafx.scene.control.Button;
import java.io.IOException;
public class UsageLandingPage implements RedirectHandler, VideoPlayer {


    public Button returnButton;

    public Button video1;
    public Button video2;
    public Button video3;
    public Button video4;
    public PlayerPage playerPage;
    private static int uV1;
    private static int uV2;
    private static int uV3;
    private static int uV4;


    public void clickedReturn() throws IOException {
        makeRedirect(returnButton, LandingPages.CHOOSE_LANDING.getLink());
    }

    public void touchedReturn() throws IOException {
        clickedReturn();
    }

    public void clickedVideo1() throws IOException {
        uV1++;
        runPlayer(UsageVideos.VIDEO1.getLink(),video1,uV1);
    }

    public void touchedVideo1() throws IOException {
        clickedVideo1();
    }
    public void clickedVideo2() throws IOException {
        uV2++;
        runPlayer(UsageVideos.VIDEO2.getLink(),video2,uV2);
    }

    public void touchedVideo2() throws IOException {
        clickedVideo2();
    }
    public void clickedVideo3() throws IOException {
        uV3++;
        runPlayer(UsageVideos.VIDEO3.getLink(),video3,uV3);
    }

    public void touchedVideo3() throws IOException {
        clickedVideo3();
    }
    public void clickedVideo4() throws IOException {
        uV4++;
        runPlayer(UsageVideos.VIDEO4.getLink(),video4,uV4);
    }

    public void touchedVideo4() throws IOException {
        clickedVideo4();
    }

}
