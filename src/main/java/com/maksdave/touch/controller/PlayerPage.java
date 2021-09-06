package com.maksdave.touch.controller;

import com.maksdave.touch.enums.LandingPages;
import com.maksdave.touch.interfaces.RedirectHandler;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TouchEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.Callable;

public class PlayerPage implements RedirectHandler, Initializable {

    public MediaView videoZone;

    public Slider sliderVideoZone;

    public Button stopPlaying;

    public Button toMenu;

    public Button pause;

    public Label currentTimeLabel;

    public Label totalTimeLabel;

    public Media mediaVideo;

    public MediaPlayer mediaPlayer;

    private static String videoSource;

    public Circle circle;

    public Polygon playArrow;

    public ImageView stopImage;

    public ImageView returnImage;

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
        bindCurrentTimeLabel();
    }

    private void bindCurrentTimeLabel() {
        currentTimeLabel.textProperty().bind(Bindings.createStringBinding(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return getTime(mediaPlayer.getCurrentTime()) + " / ";
            }
        }, mediaPlayer.currentTimeProperty()));
    }

    public String getTime(Duration time){
        int hours = (int) time.toHours();
        int minutes = (int) time.toMinutes();
        int seconds = (int) time.toSeconds();
        //to avoid 61 second.
        if(seconds>59) seconds=seconds % 60;
        if(minutes>59) seconds=seconds % 60;
        if(hours>59) seconds=seconds % 60;
        if(hours > 0) return String.format("%d:%02d:%02d",hours,minutes,seconds);
        else return String.format("%02d:%02d",minutes,seconds);
    }

    public void dragTo(DragEvent dragEvent) {
    }

    public void stopPlayingAction(ActionEvent actionEvent) {
        mediaPlayer.stop();
        circle.setOpacity(0.60);
        playArrow.setOpacity(1);
        stopImage.setOpacity(1);
        returnImage.setOpacity(1);
    }

    public void returnToMenuAction() throws IOException {
        mediaPlayer.stop();
        makeRedirect(toMenu, LandingPages.USAGE_LANDING.getLink());
    }

    public void pauseAction() {
        /*if(mediaPlayer.statusProperty().equals(mediaPlayer.getOnPaused())){mediaPlayer.play();}
        else{mediaPlayer.pause();}*/
        circle.setOpacity(0.60);
        playArrow.setOpacity(1);
        boolean isPaused = mediaPlayer.getStatus().equals((MediaPlayer.Status.PAUSED));
        boolean isStopped = mediaPlayer.getStatus().equals((MediaPlayer.Status.STOPPED));
        boolean isReady = mediaPlayer.getStatus().equals((MediaPlayer.Status.READY));
        if(isPaused||isReady)
        {
            circle.setOpacity(0);
            playArrow.setOpacity(0);
            stopImage.setOpacity(0);
            returnImage.setOpacity(0);
            mediaPlayer.play();}
        else{
            circle.setOpacity(0.60);
            playArrow.setOpacity(1);
            stopImage.setOpacity(1);
            returnImage.setOpacity(1);
            mediaPlayer.pause();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        mediaVideo = new Media(new File(videoSource).toURI().toString());
        mediaPlayer=new MediaPlayer(mediaVideo);
        mediaPlayer.pause();
        videoZone.setMediaPlayer(mediaPlayer);
        bindCurrentTimeLabel();
        mediaPlayer.totalDurationProperty().addListener(new ChangeListener<Duration>() {
            @Override
            public void changed(ObservableValue<? extends Duration> observableValue, Duration oldDuration, Duration newDuration) {
                sliderVideoZone.setMax(newDuration.toSeconds());
                totalTimeLabel.setText(getTime(newDuration));
            }
        });

        sliderVideoZone.valueChangingProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean wasChanging, Boolean isChanging) {
                if(!isChanging){
                    mediaPlayer.seek(Duration.seconds(sliderVideoZone.getValue()));
                }
            }
        });

        sliderVideoZone.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
                double currentTime = mediaPlayer.getCurrentTime().toSeconds();
                if(Math.abs(currentTime - newValue.doubleValue()) > 0.5){
                    mediaPlayer.seek(Duration.seconds(newValue.doubleValue()));
                }
                labelMatchEndVideo(currentTimeLabel.getText(),totalTimeLabel.getText());
            }
        });

        mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {
            @Override
            public void changed(ObservableValue<? extends Duration> observableValue, Duration oldTime, Duration newTime) {
                if(!sliderVideoZone.isValueChanging()){
                    sliderVideoZone.setValue(newTime.toSeconds());
                }
                labelMatchEndVideo(currentTimeLabel.getText(), totalTimeLabel.getText());
            }
        });

        mediaPlayer.setOnEndOfMedia(new Runnable() {
            @Override
            public void run() {
                if(currentTimeLabel.textProperty().equals(totalTimeLabel.textProperty())){
                    currentTimeLabel.textProperty().unbind();
                    currentTimeLabel.setText(getTime(mediaPlayer.getTotalDuration()) + " / ");
                }
            }
        });
    }
    public void labelMatchEndVideo(String labelTime, String labelTotalTime){
        for (int i = 0;i<labelTotalTime.length(); i++){
            if(labelTime.charAt(i)!= labelTotalTime.charAt(i)){
                circle.setOpacity(0);
                playArrow.setOpacity(0);
                stopImage.setOpacity(0);
                returnImage.setOpacity(0);
                break;
            }else{
                circle.setOpacity(0.60);
                playArrow.setOpacity(1);
                stopImage.setOpacity(1);
                returnImage.setOpacity(1);
                //mediaPlayer.stop();
            }
        }
    }
}
