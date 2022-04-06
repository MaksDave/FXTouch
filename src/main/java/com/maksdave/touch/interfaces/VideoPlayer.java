package com.maksdave.touch.interfaces;

import com.maksdave.touch.controller.PlayerPage;
import com.maksdave.touch.controller.ShowRoomFxController;
import com.maksdave.touch.enums.LandingPagesEnum;
import com.maksdave.touch.statistics.UsageCounter;
import com.maksdave.touch.statistics.WriteToFile;
import javafx.scene.control.Button;


import java.io.IOException;

public interface VideoPlayer extends RedirectHandler{
    default void runPlayer(String videoSource, Button button,int count) throws IOException {
        System.out.println(videoSource);
        ShowRoomFxController.setVideoSource(videoSource);
        UsageCounter.videoStatistics.put(videoSource,count);
          WriteToFile writeToFile = new WriteToFile();
          writeToFile.writeTheStatistics();
        System.out.println("Current video source is: " + videoSource  + " " + count);
        makeRedirect(button, LandingPagesEnum.SHOW_ROOM_LANDING.getLink());
    }

}
