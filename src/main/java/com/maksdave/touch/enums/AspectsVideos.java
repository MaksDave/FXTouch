package com.maksdave.touch.enums;

public enum AspectsVideos {
    VIDEO1("src/main/resources/media.aspectsVideoFiles/Какие лабораторные показатели необходимо отслеживать .mp4"),
    VIDEO2("src/main/resources/media.aspectsVideoFiles/Кому может быть назначен препарат дупилумаб.mp4"),
    VIDEO3("src/main/resources/media.aspectsVideoFiles/Как применять дупилумаб у пациентов с АтД.mp4"),
    VIDEO4("src/main/resources/media.aspectsVideoFiles/Можно ли применять дупилумаб у пациентов с инфекциями.mp4"),
    VIDEO5("src/main/resources/media.aspectsVideoFiles/Что будет, если отменить терапию.mp4"),
    VIDEO6("src/main/resources/media.aspectsVideoFiles/Противопоказания к применению дупилумаба.mp4")
    ;

    private String link;
    AspectsVideos(String link) {
        this.link=link;
    }
    public String getLink(){
        return link;
    }
}
