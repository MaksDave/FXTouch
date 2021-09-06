package com.maksdave.touch;

import com.maksdave.touch.controller.PlayerPage;
import com.maksdave.touch.enums.UsageVideos;
import com.maksdave.touch.interfaces.RedirectHandler;
import javafx.application.Application;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class PlayerHandler  {
    private String source;
    Media mediaVideo;
    MediaView mediaView;
    MediaPlayer mediaPlayer;

    /*public PlayerHandler( String source, Button button) throws IOException {
        super(source,button);
    }
*/
    /*@Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mediaVideo = new Media(new File(source).toURI().toString());
        mediaPlayer=new MediaPlayer(mediaVideo);
        mediaView.setMediaPlayer(mediaPlayer);
    }*/
}


