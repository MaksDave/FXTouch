package com.maksdave.touch.controller;

import com.maksdave.touch.RedirectHandler;
import com.maksdave.touch.enums.Landings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TouchEvent;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Enter implements RedirectHandler {

    @FXML
    public Button enterButton;
    @FXML
    public ImageView mainScreen;

    public void clickedEnter() throws IOException {
        makeRedirect(enterButton,Landings.CHOOSE_LANDING.getLink());
    }

    public void touchedEnter() throws IOException {
        clickedEnter();
    }


   /* @FXML
    protected void onMainButtonClick() {
        MainText.setText("Welcome to JavaFX Application!");
    }*/
}
