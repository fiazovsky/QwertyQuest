package io.codeforall.heapsdontlie;

import java.io.*;

public class Learderboard {
    String leaderboard;

    public synchronized void readFile(Player player) {
        try {

            BufferedReader bReader = new BufferedReader(new FileReader("resources/leaderboard/leaderboard.txt"));
            StringBuilder result = new StringBuilder();
            String lineReader;
            String lineSaver = (player.getName() + " "+ player.getScore());
            System.out.println(lineSaver);
            int lineCounter = 0;
            while ( (lineReader = bReader.readLine()) != null && !lineReader.equals("\n")) {
                //System.out.println("hey");
                if(lineCounter <= 10) {
                    String[] words = lineReader.split(" ");
                    String[] saver = lineSaver.split(" ");
                    System.out.println(lineReader);

                    if(Integer.parseInt(words[1]) > Integer.parseInt(saver[1]) ){
                        result.append(lineReader).append("\n");
                    }
                    else if(Integer.parseInt(words[1]) <= Integer.parseInt(saver[1])){
                        result.append(lineSaver).append("\n");
                        lineSaver = lineReader;
                    }
                    lineCounter ++;
                }
            }

            if( lineCounter < 10 && !lineSaver.isEmpty()) {
                System.out.println("hey3");
                result.append(lineSaver);
            }
            bReader.close();
            leaderboard = result.toString().trim();
            System.out.println(leaderboard);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void write() {
        try {
            PrintWriter out = new PrintWriter(new FileWriter("resources/leaderboard/leaderboard.txt"));
            out.println(leaderboard);
            // out.flush();
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
