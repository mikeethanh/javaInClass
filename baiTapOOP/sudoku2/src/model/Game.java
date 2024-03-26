package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Game {
	private static final int SIZE = 9;
	private int[][] board;
	
	public Game() {
		board = new int[SIZE][SIZE];	
	}
	
	//tao game tu file
    public void createNewGameFromFile(String filename) throws IOException {
        FileReader fr = null; 
        BufferedReader br =null; 
        try {
        	fr = new FileReader(filename);
        	br = new BufferedReader(fr);
        	String line;
            int row = 0;
            while ((line = br.readLine()) != null && row < SIZE) {
                String[] values = line.split("");
                for (int col = 0; col < SIZE; col++) {
                    board[row][col] = Integer.parseInt(values[col]);
                }
                row++;
            }
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			br.close();
	        fr.close();
		}     
    }

    public void saveGameToFile(String filename) throws IOException {
        FileWriter fw = new FileWriter(filename);
        for (int i = 0; i < SIZE; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < SIZE; j++) {
                line.append(board[i][j]);
            }
            fw.write(line.toString());
            fw.write("\n");
        }
        fw.close();
    }
    
	public boolean validateRow(int row) {
        boolean[] seen = new boolean[10];
        for (int j = 0; j < SIZE; j++) {
            int value = board[row][j];
            if (value != 0) {
                if (seen[value]) {
                    return false;
                }
                seen[value] = true;
            }
        }
        return true;
    }
	
    public boolean validateColumn(int column) {
        boolean[] seen = new boolean[10];
        for (int i = 0; i < SIZE; i++) {
            int value = board[i][column];
            if (value != 0) {
                if (seen[value]) {
                    return false;
                }
                seen[value] = true;
            }
        }
        return false;
    }
	
    public boolean validateZone(int zone) {
        boolean[] seen = new boolean[10];
        int startRow = (zone / 3) * 3;
        int startColumn = (zone % 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startColumn; j < startColumn + 3; j++) {
                int value = board[i][j];
                if (value != 0) {
                    if (seen[value]) {
                        return false;
                    }
                    seen[value] = true;
                }
            }
        }
        return false;
    }
	
	public boolean validate() {
		 // check row
        for (int i = 0; i < 9; i++) {
            if (!validateRow(i)) {
                return false; 
            }
        }

        // check column
        for (int j = 0; j < 9; j++) {
            if (!validateColumn(j)) {
                return false; 
            }
        }

        //zone
        for (int zone = 0; zone < 9; zone++) {
            if (!validateZone(zone)) {
                return false; 
            }
        }

        return false; 
	}
	
	//check xemm o da co gia tri chua
	   public int getValue(int row, int column) {
	        return board[row][column];
	    }

	    public void setValue(int row, int column, int value) {
	        board[row][column] = value;
	    }
}