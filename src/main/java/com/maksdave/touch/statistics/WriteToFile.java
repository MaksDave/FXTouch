package com.maksdave.touch.statistics;

import java.io.*;


public class WriteToFile {
    //private String path = "src/main/resources/statistics/data.txt";
    private String outPath = "C:\\Share\\FXTouch\\statisticsData.txt";
    public WriteToFile(String videoSource, int counter){
        //UsageCounter usageCounter = new UsageCounter();
        System.out.println(outPath + "Путь!");
        File output= new File(outPath);
        System.out.println(output);
        System.out.println(UsageCounter.videoStatistics);
        try(FileWriter fw = new FileWriter(output, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            //out.println(videoSource + " " + "---" + counter);
            out.println(UsageCounter.videoStatistics);
            out.close();
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
