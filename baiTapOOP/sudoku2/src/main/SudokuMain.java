package main;

import controller.SudokuController;
import model.Game;
import view.SudokuView;

public class SudokuMain {
    public static void main(String[] args) {
        int[][] initialValues = {
        		{5, 3, 0, 0, 7, 0, 0, 0, 0},
	            {6, 0, 0, 1, 9, 5, 0, 0, 0},
	            {0, 9, 8, 0, 0, 0, 0, 6, 0},
	            {8, 0, 0, 0, 6, 0, 0, 0, 3},
	            {4, 0, 0, 8, 0, 3, 0, 0, 1},
	            {7, 0, 0, 0, 2, 0, 0, 0, 6},
	            {0, 6, 0, 0, 0, 0, 2, 8, 0},
	            {0, 0, 0, 4, 1, 9, 0, 0, 5},
	            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        Game sudokuGame = new Game(initialValues);
        SudokuView sudokuView = new SudokuView(sudokuGame);
        SudokuController sudokuController = new SudokuController(sudokuGame, sudokuView);

        sudokuController.startGame();
    }
}
