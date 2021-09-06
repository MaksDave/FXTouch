package com.maksdave.touch.statistics;

public class UsageCounter {
    private static int OVERALLCLICKSAMOUNT=0;

    private String redirectedTo="";

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
}
