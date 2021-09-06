package com.maksdave.touch.enums;

public enum MechanicsVideos {
    VIDEO1("src/main/resources/media.mechanicsVideoFiles/Как дупилумаб действует при АтД.mp4")
    ;

    private String link;
    MechanicsVideos(String link) {
        this.link=link;
    }
    public String getLink(){
        return link;
    }
}
