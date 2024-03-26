package view;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.Game;

public class SudokuView {
    private Game game;
    private Scanner scanner;

    public SudokuView(Game game) {
        this.game = game;
        this.scanner = new Scanner(System.in);
    }

    public void displayBoard() {
        System.out.println("Bang Sudoku:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(game.getValue(i, j) + " ");
            }
            System.out.println();
        }
    }

    public void getInput() {
        try {
            int row, column, value;
            char choice;

            while (true) {
                System.out.print("Nhap hang tu 1-9 (-1 de ket thuc, 'S' de ket thuc): ");
                choice = scanner.next().charAt(0);
                if (choice == 'S' || choice == 's') {
                    String filename = "E:\\theFourSemester\\JavaInCLass\\file\\sudoku_save.txt";
                    saveGameToFile(filename);
                    break;
                }

                row = Character.getNumericValue(choice);

                if (row == -1) break;

                System.out.print("Nhap cot tu 1-9: ");
                column = scanner.nextInt();

                // Kiem tra dieu kiem hang va cot
                if (row < 1 || row > 9 || column < 1 || column > 9) {
                    throw new IllegalArgumentException("Hang hoac cot khong hop le.");
                }

                row--;
                column--;

                if (game.getValue(row, column) != 0) {
                    throw new IllegalArgumentException("O da co gia tri.");
                }

                System.out.print("Nhap gia tri: ");
                value = scanner.nextInt();

                if (value < 1 || value > 9) {
                    throw new IllegalArgumentException("Gia tri khong hop le.");
                }

                game.setValue(row, column, value);
                displayAfterInput();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + " Vui lòng nhập lại.");
        } finally {
            scanner.close();
        }
    }
    //
    public void saveGameToFile(String filename) {
        try {
            game.saveGameToFile(filename);
            System.out.println("Tro choi da duoc luu vao tep tin " + filename);
        } catch (IOException e) {
            System.out.println("Da xay ra loi khi luu vao tep tin.");
            e.printStackTrace();
        }
    }
    
    //
    private void displayAfterInput() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(game.getValue(i, j) + " ");
            }
            System.out.println();
        }
    }
}
