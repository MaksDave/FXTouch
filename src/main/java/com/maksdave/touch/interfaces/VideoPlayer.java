package com.maksdave.touch.interfaces;

import com.maksdave.touch.controller.PlayerPage;
import com.maksdave.touch.enums.LandingPages;
import com.maksdave.touch.statistics.UsageCounter;
import com.maksdave.touch.statistics.WriteToFile;
import javafx.scene.control.Button;


import java.io.IOException;

public interface VideoPlayer extends RedirectHandler{
    default void runPlayer(String videoSource, Button button,int count) throws IOException {
        System.out.println(videoSource);
        PlayerPage.setVideoSource(videoSource);
        UsageCounter.videoStatistics.put(videoSource,count);
          //WriteToFile writeToFile = new WriteToFile(videoSource,count);
        System.out.println("Current video source is: " + videoSource  + " " + count);
        makeRedirect(button, LandingPages.PLAYER_LANDING.getLink());
    }

}
