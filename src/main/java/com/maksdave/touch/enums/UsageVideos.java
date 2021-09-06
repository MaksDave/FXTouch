package com.maksdave.touch.enums;

public enum UsageVideos {
    VIDEO1("src/main/resources/media.usageVideoFiles/Реальная клиническая практика терапии.mp4"),
    VIDEO2("src/main/resources/media.usageVideoFiles/Как долго принимали дупилмаб.mp4"),
    VIDEO3("src/main/resources/media.usageVideoFiles/Оценка эффективности применения дупилумаба у пациентов c АтД.mp4"),
    VIDEO4("src/main/resources/media.usageVideoFiles/Профиль безопасности.mp4")
    ;

    private String link;
    UsageVideos(String link) {
        this.link=link;
    }
    public String getLink(){
        return link;
    }
}
