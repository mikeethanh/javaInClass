package view;

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
        System.out.println("Bảng Sudoku:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(game.getValue(i, j) + " ");
            }
            System.out.println();
        }
    }

    public void getInput() {
        try {
            System.out.println("Nhập giá trị cho các ô có giá trị là 0 trong Sudoku (Nhập -1 để kết thúc):");
            int row, column, value;

            while (true) {
                System.out.print("Nhập hàng (0-8) (-1 để kết thúc): ");
                row = scanner.nextInt();
                if (row == -1) break;

                System.out.print("Nhập cột (0-8): ");
                column = scanner.nextInt();

                if (row < 0 || row > 8 || column < 0 || column > 8) {
                    throw new IllegalArgumentException("Hàng hoặc cột không hợp lệ.");
                }

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

    private void displayAfterInput() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(game.getValue(i, j) + " ");
            }
            System.out.println();
        }
    }
}
