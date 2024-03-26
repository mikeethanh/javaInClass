package model;

public class Game {
	private Node[][] nodes;
	
	
	public Game(int InitValue[][]) {
		nodes = new Node[9][9];
		for(int i = 0 ; i < 9 ; i++) {
			for(int j = 0 ; j < 9 ; j++) {
				nodes[i][j] = new Node(i,j,InitValue[i][j]);
			}
		}
	}
	
	public boolean validateRow(int row) {
		boolean[] seen = new boolean[10]; // su dung mang boolen de kiem tra so  xuat hien tu 1->9
        for (int j = 0; j < 9; j++) {
            int value = nodes[row][j].getValue();
            if (value != 0) {
                if (seen[value] == true) {
                    return false; // so da xuat hien truoc do trong hang , ko hop le
                }
                seen[value] = true;
            }
        }
		return true;
	}
	
	public boolean validateColumn(int column) {
		boolean[] seen = new boolean[10];
        for (int i = 0; i < 9; i++) {
            int value = nodes[i][column].getValue();
            if (value != 0) {
                if (seen[value]) {
                    return false; 
                }
                seen[value] = true;
            }
        }
        return true; 
	}
	
	public boolean validateZone(int zone) {
		 boolean[] seen = new boolean[10];
	        int startRow = (zone / 3) * 3;
	        int startColumn = (zone % 3) * 3;

	        for (int i = startRow; i < startRow + 3; i++) {
	            for (int j = startColumn; j < startColumn + 3; j++) {
	                int value = nodes[i][j].getValue();
	                if (value != 0) {
	                    if (seen[value]) {
	                        return false; 
	                    }
	                    seen[value] = true;
	                }
	            }
	        }
	        return true; 
	}
	
	public boolean validate() {
		 // check row
        for (int i = 0; i < 9; i++) {
            if (!validateRow(i)) {
                return false; 
            }
        }

        // check column
        for (int j = 0; j < 9; j++) {
            if (!validateColumn(j)) {
                return false; 
            }
        }

        //zone
        for (int zone = 0; zone < 9; zone++) {
            if (!validateZone(zone)) {
                return false; 
            }
        }

        return true; 
	}
	
    public int getValue(int row, int column) {
        return nodes[row][column].getValue();
    }

    public void setValue(int row, int column, int value) {
        nodes[row][column].setValue(value);
    }
}