package main;

import java.io.IOException;

import controller.SudokuController;
import model.Game;
import view.SudokuView;

public class SudokuMain {
    public static void main(String[] args) {
        // Tạo trò chơi Sudoku từ tập tin dữ liệu
        String filename = "E:\\theFourSemester\\JavaInCLass\\file\\sudoku.txt"; // Thay đổi tên tập tin theo tên thực tế
        Game sudokuGame = new Game();
        SudokuView sudokuView = new SudokuView(sudokuGame);
        SudokuController sudokuController = new SudokuController(sudokuGame, sudokuView);

        // Tạo trò chơi mới từ tập tin dữ liệu
        try {
            sudokuGame.createNewGameFromFile(filename);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi tạo trò chơi từ tập tin.");
            e.printStackTrace();
            return;
        }

        // Bắt đầu trò chơi
        sudokuController.startGame();
    }
}
