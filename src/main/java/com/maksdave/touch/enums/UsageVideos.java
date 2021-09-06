package com.maksdave.touch.enums;

public enum UsageVideos {VIDEO1("src/main/resources/media.usageVideoFiles/Как применять дупилумаб у пациентов с АтД.mp4");

    private String link;
    UsageVideos(String link) {
        this.link=link;
    }
    public String getLink(){
        return link;
    }
}
