package com.maksdave.touch.statistics;

import java.io.*;

public class WriteToFile {
    private String path = "src/main/resources/statistics/data.txt";

    public WriteToFile(String redirectTo) throws IOException {
        File output= new File(path);
        UsageCounter usageCounter = new UsageCounter();
        usageCounter.setRedirectedTo(redirectTo);
        try(FileWriter fw = new FileWriter(output, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
            {
                out.println(usageCounter.getRedirectedTo());
                //more code
                out.println(UsageCounter.getOVERALLCLICKSAMOUNT());
                //more code
            } catch (IOException e) {
                //exception handling left as an exercise for the reader
            }

    }
}
