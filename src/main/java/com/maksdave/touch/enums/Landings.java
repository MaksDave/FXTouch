package com.maksdave.touch.enums;

public enum Landings {
    ENTER_LANDING("/fxml/Enter.fxml"),
    CHOOSE_LANDING("/fxml/Choose.fxml"),
    ASPECTS_LANDING("/fxml/AspectsLandingPage.fxml"),
    USAGE_LANDING("/fxml/UsageLandingPage.fxml"),
    MECHANICS_LANDING("/fxml/MechanicsLandingPage.fxml");

    private String link;
    Landings(String link) {
        this.link=link;
    }
    public String getLink(){
        return link;
    }
}


