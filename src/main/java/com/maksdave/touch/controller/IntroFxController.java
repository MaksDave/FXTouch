
/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.maksdave.touch.controller;

import com.maksdave.touch.enums.LandingPagesEnum;
import com.maksdave.touch.interfaces.RedirectHandler;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lombok.Getter;

import java.io.IOException;


public class IntroFxController implements RedirectHandler {
    
    @Getter
    public Button loginButton;
    @Getter
    public ImageView introImage;
    @Getter
    public AnchorPane anchorPane;
    
    
    public void logInButtonClickedAction(MouseEvent mouseEvent) throws IOException {
        makeRedirect(loginButton, LandingPagesEnum.MAIN_VIEW_LANDING.getLink());
    }
    
    public void introImageClickedAction(MouseEvent mouseEvent) {
    }
}
