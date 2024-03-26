package main;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		System.out.print("Nhap lever(1, 2, 3):");
		Scanner scanner = new Scanner(System.in);
		Game game = null;
		int level = scanner.nextInt();
		if(level == 1) {
			game = new Game(1,"mikeethanh");
			game.display();
		}else if(level == 2) {
			game = new Game(2," i love hangman");
			game.display();
		} else if(level == 3) {
			game = new Game(3," i love hangman and suduko");
			game.display();
		}
		
		//bat dau tro choi:
		game.playGame();
	}
}
