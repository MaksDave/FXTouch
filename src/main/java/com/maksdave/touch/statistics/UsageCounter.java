package com.maksdave.touch.statistics;

import java.util.HashMap;
import java.util.Map;

public class UsageCounter {
    private static int OVERALLCLICKSAMOUNT = 0;

    private String redirectedTo = "";
    public String jj;

    public static int getOVERALLCLICKSAMOUNT() {
        return OVERALLCLICKSAMOUNT;
    }

    public static void ADDOVERALLCLICKSAMOUNT() {
        UsageCounter.OVERALLCLICKSAMOUNT++;
    }

    public String getRedirectedTo() {
        return redirectedTo;
    }

    public void setRedirectedTo(String redirectedTo) {
        this.redirectedTo = redirectedTo;
    }

//    private  Map<String, Integer> videoStatistics = new HashMap<>();
//
//    {
//        videoStatistics.put("/media.usageVideoFiles/Реальная клиническая практика терапии.mp4", 0);
//        videoStatistics.put("/media.usageVideoFiles/Как долго принимали дупилмаб.mp4", 0);
//        videoStatistics.put("/media.usageVideoFiles/Оценка эффективности применения дупилумаба у пациентов c АтД.mp4", 0);
//        videoStatistics.put("/media.usageVideoFiles/Профиль безопасности.mp4", 0);
//        videoStatistics.put("/media.aspectsVideoFiles/Какие лабораторные показатели необходимо отслеживать .mp4", 0);
//        videoStatistics.put("/media.aspectsVideoFiles/Кому может быть назначен препарат дупилумаб.mp4", 0);
//        videoStatistics.put("/media.aspectsVideoFiles/Как применять дупилумаб у пациентов с АтД.mp4", 0);
//        videoStatistics.put("/media.aspectsVideoFiles/Можно ли применять дупилумаб у пациентов с инфекциями.mp4", 0);
//        videoStatistics.put("/media.aspectsVideoFiles/Что будет, если отменить терапию.mp4", 0);
//        videoStatistics.put("/media.aspectsVideoFiles/Противопоказания к применению дупилумаба.mp4", 0);
//        videoStatistics.put("/media.mechanicsVideoFiles/Как дупилумаб действует при АтД.mp4", 0);
//    }
//
//    public Map<String, Integer> getVideoStatistics() {
//        return videoStatistics;
//    }



//    public static void setVideoStatisticsValue(String toKey) {
//        if (videoStatistics.containsKey(toKey)) {
//            videoStatistics.put(toKey, videoStatistics.get(toKey) + 1);
//            System.out.println(videoStatistics);
//        }
//    }
}