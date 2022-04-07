package com.maksdave.touch.enums;

public enum LandingPagesEnum {
    INTRO_LANDING("/fxml/intro.fxml"),
    MAIN_VIEW_LANDING("/fxml/mainView.fxml"),
    REPORT_PAGE_LANDING("/fxml/reportPage.fxml"),
    SHOW_ROOM_LANDING("/fxml/showRoom.fxml");
    private String link;
    
    LandingPagesEnum(String link) {
        this.link=link;
    }
    public String getLink(){
        return link;
    }
}


