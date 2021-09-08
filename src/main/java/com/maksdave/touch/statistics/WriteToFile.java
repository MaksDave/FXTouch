package com.maksdave.touch.statistics;

import java.io.*;
import java.util.Date;


public class WriteToFile {

    private String outPath = "C:\\FXTouch\\statisticsData.txt";

    public void writeFinalString(){
        Date date = new Date();
        File output= new File(outPath);
        try(FileWriter fw = new FileWriter(output, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println("The end of the session:" + " " + date);
            out.close();
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeTheStatistics(){
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
//    public WriteToFile(String videoSource, int counter){
//        //UsageCounter usageCounter = new UsageCounter();
//        System.out.println(outPath + "Путь!");
//        File output= new File(outPath);
//        System.out.println(output);
//        System.out.println(UsageCounter.videoStatistics);
//        try(FileWriter fw = new FileWriter(output, true);
//            BufferedWriter bw = new BufferedWriter(fw);
//            PrintWriter out = new PrintWriter(bw))
//        {
//            //out.println(videoSource + " " + "---" + counter);
//            out.println(UsageCounter.videoStatistics);
//            out.close();
//            out.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}
