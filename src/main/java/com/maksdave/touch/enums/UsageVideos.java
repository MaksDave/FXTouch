package com.maksdave.touch.enums;

public enum UsageVideos {
    VIDEO1("/media.usageVideoFiles/Реальная клиническая практика терапии.mp4"),
    VIDEO2("/media.usageVideoFiles/Как долго принимали дупилмаб.mp4"),
    VIDEO3("/media.usageVideoFiles/Оценка эффективности применения дупилумаба у пациентов c АтД.mp4"),
    VIDEO4("/media.usageVideoFiles/Профиль безопасности.mp4")
    ;

    private String link;
    UsageVideos(String link) {
        this.link=link;
    }
    public String getLink(){
        return link;
    }
}
