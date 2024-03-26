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

            // Validate toan bo Sudoku board
            if (gameIsComplete()) {
                System.out.println("Chuc mung , ban da hoan thanh suduko!");
                return;
            }
            gameIsComplete();

        scanner.close();
    }

    private boolean gameIsComplete() {
        //       
            if (!game.validate()) {
                System.out.println("suduko k hop le.");
                return false;
            }
        return true;
    }
}