package com.maksdave.touch.interfaces;

import com.maksdave.touch.controller.PlayerPage;
import com.maksdave.touch.enums.LandingPages;
import javafx.scene.control.Button;

import java.io.IOException;

public interface VideoPlayer extends RedirectHandler{
    default void runPlayer(String videoSource, Button button) throws IOException {
        PlayerPage.setVideoSource(videoSource);
        makeRedirect(button, LandingPages.PLAYER_LANDING.getLink());
    }

}
