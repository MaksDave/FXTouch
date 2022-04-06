
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
import javafx.scene.media.MediaView;

import java.io.IOException;

public class MainViewFxController implements RedirectHandler {
    public MediaView modelOneView;
    public MediaView modelFourView;
    public MediaView modelThreeView;
    public MediaView modelTwoView;
    public Button goToReport;
    public ImageView mainView;
    public Button goTo3DButton;
    
    public void goTo3DViewAction(MouseEvent mouseEvent) throws IOException {
        makeRedirect(goTo3DButton, LandingPagesEnum.SHOW_ROOM_LANDING.getLink());
    }
    
    public void openCalculationReport(MouseEvent mouseEvent) throws IOException {
        makeRedirect(goToReport, LandingPagesEnum.REPORT_PAGE_LANDING.getLink());
    }
}
