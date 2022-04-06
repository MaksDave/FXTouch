
/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.maksdave.touch.controller;

import com.maksdave.touch.enums.ModelVideosEnum;
import com.maksdave.touch.interfaces.RedirectHandler;
import com.maksdave.touch.interfaces.VideoPlayer;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ShowRoomFxController implements RedirectHandler, Initializable, VideoPlayer {
    public Button loadModelButton;
    public Button neuralNetworkButton;
    public Button getReportButton;
    public Button returnToMainScreenButton;
    public Pane modelSpace;
    public MediaView modelView;
    @Getter @Setter
    public static String videoSource;
    private static int aV1;
    private static int aV2;
    private static int aV3;
    private static int aV4;
    
    public Media mediaVideo;
    public MediaPlayer mediaPlayer;
    public Button getNeuralCalculationsButton;
    public Button returnToMainScreenButton1;
    
    
    public void loadModelButtonClickedAction(MouseEvent mouseEvent) throws IOException {
        runPlayer(ModelVideosEnum.VIDEO1.getLink(),loadModelButton,aV1);
    }
    
    public void loadNeuralNetworkButtonClickedAction(MouseEvent mouseEvent) throws IOException {
        runPlayer(ModelVideosEnum.VIDEO2.getLink(),loadModelButton,aV2);
    }
    
    public void NeuralCalculationsClickedAction(MouseEvent mouseEvent) throws IOException {
        runPlayer(ModelVideosEnum.VIDEO3.getLink(),loadModelButton,aV3);
    }
    
    public void getReportMouseClickedAction(MouseEvent mouseEvent) {
    }
    
    public void returnToMainScreenClickedAction(MouseEvent mouseEvent) {
    }
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        
        mediaVideo = new Media(getClass().getResource(videoSource).toExternalForm());
        mediaPlayer = new MediaPlayer(mediaVideo);
        mediaPlayer.pause();
        mediaPlayer.setMute(true);
        mediaPlayer.setAutoPlay(true);
        mediaPlayer.setOnRepeat(mediaPlayer.getOnEndOfMedia());
        modelView.setMediaPlayer(mediaPlayer);
    }
}
