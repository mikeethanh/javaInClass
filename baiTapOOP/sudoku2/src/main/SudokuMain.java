package main;

import java.io.IOException;

import controller.SudokuController;
import model.Game;
import view.SudokuView;

public class SudokuMain {
    public static void main(String[] args) {
        //Tep tin luu tro choi
        String filename = "E:\\theFourSemester\\JavaInCLass\\file\\sudoku.txt"; // Thay đổi tên tập tin theo tên thực tế
        Game sudokuGame = new Game();
        SudokuView sudokuView = new SudokuView(sudokuGame);
        SudokuController sudokuController = new SudokuController(sudokuGame, sudokuView);

        try {
        	// Tao tro choi tu tep tin
            sudokuGame.createNewGameFromFile(filename);
        } catch (IOException e) {
            System.out.println("Da xay ra loi khi tao tro choi.");
            e.printStackTrace();
            return;
        }

        // Bat dau tro choi
        sudokuController.startGame();
    }
}
