package com.maksdave.touch.enums;

public enum ModelVideosEnum {
    VIDEO1("/media.modelFiles/1.mp4"),
    VIDEO2("/media.modelFiles/2.mp4"),
    VIDEO3("/media.modelFiles/3.mp4"),
    VIDEO4("/media.modelFiles/4.mp4"),
    ;

    private String link;
    ModelVideosEnum(String link) {
        this.link=link;
    }
    public String getLink(){
        return link;
    }
}
