package com.maksdave.touch.enums;

public enum ModelVideosEnum {
    VIDEO1("/media.modelFiles/first.mp4"),
    VIDEO2("/media.modelFiles/second.mp4"),
    VIDEO3("/media.modelFiles/third.mp4"),
    VIDEO4("/media.modelFiles/fourth.mp4");

    private String link;
    ModelVideosEnum(String link) {
        this.link=link;
    }
    public String getLink(){
        return link;
    }
}
