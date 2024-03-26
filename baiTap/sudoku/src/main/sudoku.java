package main;
import java.util.Scanner;

public class sudoku {
	// ham de check xem bang isComplte hay chua 
	public static boolean isComplete(int board[][]) {
		// duyet theo tung hang tung cot	 
		for(int i = 0 ; i < 9 ; i++) {
            for(int j = 0 ; j < 9 ; j++) {
                if(board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
	}

	// ham de in ra mang 
	public static void print(int board[][]) {
		// su dung for each de in ra mang 
		for(int[] row : board) {
			for(int elem : row) {
				System.out.print(elem+" ");
			}
			System.out.println();
		}
	}
	
	//ham de nguoi choi nhap vao gia tri 
	public static void enterValue(int board[][]) {
		/** i = index of row
		 * j = index of column
		 * v = value  
		 */
		Scanner scanner = new Scanner(System.in);
				//nhap cho den khi nao complete
				do {
					// nhap vao hang , cot , value
					System.out.print("row: ");
					int i = scanner.nextInt();
					System.out.print("column: ");
					int j = scanner.nextInt();
					System.out.print("value: ");
					int v = scanner.nextInt();

					int mistakes = 5; // so lan invalid toi thieu(chi duoc nhap sai mistakes lan)

					//case : nhap vao o !=0
					if(board[i][j] != 0) {
						System.out.println("Invalid(input on cells with a value of 0)");
						continue;
					}else {
						if((i < 0 || i > 9) || (j < 0 || j > 9) ||(v < 0 || v > 9)) {
							System.out.println("Invalid number(number need to be between 0 and 9)");
						}else  {
							if(validSudoku(board, i, j,v) == false) {
								mistakes--;
								print(board);
							}else {
								print(board);
							}
						}
					}
				
					/*check xem over hay chua 
			 		* neu mistakes ==0 => over
			 		*/
					 if(mistakes==0) {
						System.out.println("Over!");
						return;
					}
				}while(isComplete(board) == false);
			scanner.close();
	}
	
	//check xem co trung so voi cac hang va cot khac khong
	public static boolean validSudoku(int board[][],int i , int j,int v) {
		/*i = row
		 *j = column
		 v = value
		 return true or false (valid or invalid)
		 */
			
		//check ngang doc
		for(int x = 0 ; x < 9 ; x++) {
			if(board[x][j] == v || board[i][x] == v) {
				System.out.println("Invalid number(similar to number)!");
				return false;
			}
		//check trong 3 o

		}

		return true;
	}
	
	public static void main(String[] args) {
	    
		//tao ra 1 mang 2 chieu dai dien cho game sudoku 
		int[][] board = {
				  { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
				  { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
				  { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
				  { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
				  { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
				  { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
				  { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
				  { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
				  { 0, 9, 0, 0, 0, 0, 4, 0, 0 } 
				};
		// in ra mang truoc khi nhap bat ki gia tri nao
		print(board);
		
		enterValue(board);
	}
}
