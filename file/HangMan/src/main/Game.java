package main;

import java.util.Scanner;

public class Game {
	private int level;
	private String phase;
	private int max = 5;
	String hidden;
	
	public Game(int level, String phase) {
		super();
		this.level = level;
		this.phase = phase;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getPhase() {
		return phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public String getHidden() {
		return hidden;
	}
	
	public void setHidden() {
	    StringBuilder hiddenBuilder = new StringBuilder();
	    for (char c : phase.toCharArray()) {
	        if (c == ' ') {
	            hiddenBuilder.append(" "); 
	        } else {
	            hiddenBuilder.append("*"); 
	        }
	    }
	    this.hidden = hiddenBuilder.toString();
	}
	
	//display game
	public void display() {
		System.out.print("WORD: ");
		this.setHidden();
		System.out.println(this.getHidden());
		System.out.print("Life: ");
		System.out.println(this.getMax());
	}
	//
	public void display2() {
		System.out.print("WORD: ");
		System.out.println(this.getHidden());
		System.out.print("Life: ");
		System.out.println(this.getMax());
	}
	//start game
	public void playGame() {
		Scanner scanner = new Scanner(System.in);
		while(max > 0) {
			System.out.println("Doan ky tu:");
			char guess;
			guess = scanner.next().charAt(0);
			//validateGuess
			 if (validateGuess(guess)== true) {
	             System.out.println("doan dung r");
	             updateHiddenPhase(guess);
	             display2();
			 }else {
				 System.out.println("Doan sai r!");
	                max--;
	               System.out.println("Life: " + max);
			 }
			 //validateEndGame
			  if (validateEndGame()) {
                  System.out.println("thang r");
                  break;
              }
			  if(max == 0) {
				  System.out.println("thua r");
				  break;
			  }
		}
		
	}
	//validateGuess
	public boolean validateGuess(char guess) {
		if(phase.indexOf(guess) == -1) {
			return false;
		}
		return true;
	}
	
	//validateEndGame
	public boolean validateEndGame() {
		if(this.phase.equalsIgnoreCase(this.hidden)) {
			return true;
		}
		return false;
	}
	
	//updateHidenWord
		public void updateHiddenPhase(char guess) {
		    StringBuilder updateHidden = new StringBuilder(this.hidden);
		    for (int i = 0; i < this.phase.length(); i++) {
		        if (this.phase.charAt(i) == guess) {
		            updateHidden.setCharAt(i, guess);
		        }
		    }
		    this.hidden = updateHidden.toString();
		}

}
