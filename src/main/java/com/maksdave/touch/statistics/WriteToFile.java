package com.maksdave.touch.statistics;

import java.io.*;


public class WriteToFile {
    private String path = "src/main/resources/statistics/data.txt";
    public WriteToFile(String videoSource, int counter){
        System.out.println(path + "Путь!");
        File output= new File(path);
        System.out.println(output);

        try(FileWriter fw = new FileWriter(output, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(output), "utf-8"))) {
                writer.write(videoSource + " " + counter);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            out.println(videoSource + "" + counter);
            out.close();
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
  }
    }

}
