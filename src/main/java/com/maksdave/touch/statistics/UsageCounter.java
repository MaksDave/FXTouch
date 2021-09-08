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

    public static Map<String, Integer> videoStatistics = new HashMap<>();

    {
    }

    public Map<String, Integer> getVideoStatistics() {
        return videoStatistics;
    }



//    public static void setVideoStatisticsValue(String toKey) {
//        if (videoStatistics.containsKey(toKey)) {
//            videoStatistics.put(toKey, videoStatistics.get(toKey) + 1);
//            System.out.println(videoStatistics);
//        }
//    }
}