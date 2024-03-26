package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class dataFromFile {
    public static List<Game> readGamesFromFile() throws IOException {
        List<Game> games = new ArrayList<>();
        FileReader fr = null;
        BufferedReader br = null;
        try {
           fr = new FileReader("E:\\theFourSemester\\javaInClass\\file\\hangmanStart.txt");
           br = new  BufferedReader(fr);
           String line;
           while ((line = br.readLine()) != null) {
               String[] parts = line.split(" ");
               int level = Integer.parseInt(parts[1]);
               String word = parts[3];
               Game game = new Game(level, word);
               games.add(game);
           }
           
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
        	if(br == null) {
        		br.close();
        	}
        	if(fr == null) {
        		fr.close();
        	}
        }
        return games;
    }
}
