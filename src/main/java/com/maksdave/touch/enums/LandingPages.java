package com.maksdave.touch.enums;

public enum LandingPages {
    ENTER_LANDING("/fxml/enter.fxml"),
    CHOOSE_LANDING("/fxml/choose.fxml"),
    ASPECTS_LANDING("/fxml/aspectsLandingPage.fxml"),
    USAGE_LANDING("/fxml/usageLandingPage.fxml"),
    MECHANICS_LANDING("/fxml/mechanicsLandingPage.fxml"),
    PLAYER_LANDING("/fxml/player.fxml");

    private String link;
    LandingPages(String link) {
        this.link=link;
    }
    public String getLink(){
        return link;
    }
}


