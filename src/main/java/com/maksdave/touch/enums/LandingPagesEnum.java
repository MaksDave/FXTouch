package com.maksdave.touch.enums;

public enum LandingPagesEnum {
    INTRO_LANDING("/fxml/gmed/intro.fxml"),
    MAIN_VIEW_LANDING("/fxml/gmed/mainView.fxml"),
    REPORT_PAGE_LANDING("/fxml/gmed/reportPage.fxml"),
    SHOW_ROOM_LANDING("/fxml/gmed/showRoom.fxml");

    private String link;
    LandingPagesEnum(String link) {
        this.link=link;
    }
    public String getLink(){
        return link;
    }
}


