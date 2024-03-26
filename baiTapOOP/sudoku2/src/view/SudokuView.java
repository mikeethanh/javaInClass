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
                System.out.print("Nhập hàng (1-9) (-1 để kết thúc, 'S' để lưu trò chơi): ");
                choice = scanner.next().charAt(0);
                if (choice == 'S' || choice == 's') {
                    System.out.print("Da duoc luu");
                    String filename = "E:\\theFourSemester\\JavaInCLass\\file\\sudoku_save.txt";
                    saveGameToFile(filename);
                    continue;
                }

                row = Character.getNumericValue(choice);

                if (row == -1) break;

                System.out.print("Nhập cột (1-9): ");
                column = scanner.nextInt();

                // Kiểm tra điều kiện của hàng và cột
                if (row < 1 || row > 9 || column < 1 || column > 9) {
                    throw new IllegalArgumentException("Hàng hoặc cột không hợp lệ.");
                }

                row--;
                column--;

                if (game.getValue(row, column) != 0) {
                    throw new IllegalArgumentException("Ô đã có giá trị.");
                }

                System.out.print("Nhập giá trị: ");
                value = scanner.nextInt();

                if (value < 1 || value > 9) {
                    throw new IllegalArgumentException("Giá trị không hợp lệ.");
                }

                game.setValue(row, column, value);
                displayAfterInput();
            }
        } catch (InputMismatchException e) {
            System.out.println("Dữ liệu nhập không hợp lệ. Vui lòng nhập lại.");
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
            System.out.println("Trò chơi đã được lưu vào tập tin " + filename);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi lưu trò chơi vào tập tin.");
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
