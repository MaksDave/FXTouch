package com.maksdave.touch.controller;

import com.maksdave.touch.PlayerHandler;
import com.maksdave.touch.enums.LandingPages;
import com.maksdave.touch.enums.UsageVideos;
import com.maksdave.touch.interfaces.RedirectHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TouchEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PlayerPage implements RedirectHandler, Initializable {


    public MediaView videoZone;

    public Slider sliderVideoZone;

    public Button stopPlaying;

    public Button toMenu;

    public Button pause;

    public Media mediaVideo;

    public MediaPlayer mediaPlayer;
    private static String videoSource;

    public static String getVideoSource() {
        return videoSource;
    }

    public static void setVideoSource(String videoSource) {
        PlayerPage.videoSource = videoSource;
    }

    public void clickedVideoZone(MouseEvent mouseEvent) {
    }

    public void touchedVideoZone(TouchEvent touchEvent) {
    }

    public void dragFrom(MouseEvent mouseEvent) {
    }

    public void dragTo(DragEvent dragEvent) {
    }

    public void stopPlayingAction(ActionEvent actionEvent) {
    }

    public void returnToMenuAction() throws IOException {
        makeRedirect(toMenu, LandingPages.USAGE_LANDING.getLink());
    }

    public void pauseAction(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        mediaVideo = new Media(new File(videoSource).toURI().toString());
        mediaPlayer=new MediaPlayer(mediaVideo);
        videoZone.setMediaPlayer(mediaPlayer);

    }

}
