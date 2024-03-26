package controller;

import java.util.Scanner;

import model.Game;
import view.SudokuView;

public class SudokuController {
    private Game game;
    private SudokuView view;

    public SudokuController(Game game, SudokuView view) {
        this.game = game;
        this.view = view;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);

            view.displayBoard();
            view.getInput();

            // Validate the entire Sudoku board
            if (gameIsComplete()) {
                System.out.println("Chúc mừng, bạn đã hoàn thành Sudoku!");
                return;
            }
            gameIsComplete();

        scanner.close();
    }

    private boolean gameIsComplete() {
        if (!game.validate()) {
            throw new IllegalArgumentException("Sudoku không hợp lệ. Vui lòng kiểm tra lại.");
        }
        return true;
    }
}
