package com.maksdave.touch.enums;

public enum AspectsVideos {
    VIDEO1("/media.aspectsVideoFiles/Какие лабораторные показатели необходимо отслеживать .mp4"),
    VIDEO2("/media.aspectsVideoFiles/Кому может быть назначен препарат дупилумаб.mp4"),
    VIDEO3("/media.aspectsVideoFiles/Как применять дупилумаб у пациентов с АтД.mp4"),
    VIDEO4("/media.aspectsVideoFiles/Можно ли применять дупилумаб у пациентов с инфекциями.mp4"),
    VIDEO5("/media.aspectsVideoFiles/Что будет, если отменить терапию.mp4"),
    VIDEO6("/media.aspectsVideoFiles/Противопоказания к применению дупилумаба.mp4")
    ;

    private String link;
    AspectsVideos(String link) {
        this.link=link;
    }
    public String getLink(){
        return link;
    }
}
