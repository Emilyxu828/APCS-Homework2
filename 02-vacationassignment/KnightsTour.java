import java.io.*;
import java.util.*;

public class KnightsTour {
    private int[][] board;
    private int maxX;
    private int maxY;

    private int count = 0;
    private int total = 25; // 5*5
    private boolean solved = false;

    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }

    public KnightsTour() {
	maxX = 9; // 2+5+2
	maxY = 9;
	board = new int[maxX][maxY];

	for (int i=0; i<9; i++){
	    for (int j=0; j<9; j++){
		if (i<2 || i>6 || j<2 || j>6)
		    board[i][j] = -1;
		else
		    board[i][j] = 0;
	    }
	}
    }

    public void print(){
	for (int i=0; i<9; i++){
	    for (int j=0; j<9; j++){
		if (board[i][j] != -1){
		    System.out.printf("|"+"%4d", board[i][j]);
		}
	    }
	    System.out.printf("\n");
	}
    }

    public void solve(int x, int y){
	count++;
	if (board[x][y] != 0 || solved == true)
	    return;
	if (count == 25){
	    print();
	    solved = true;
	}
	board[x][y] = count;
	solve(x+1,y+2);
        solve(x+1, y-2);
        solve(x-1,y+2);
	solve(x-1,y+2);
	solve(x+2, y+1);
        solve(x+2, y-1);
	solve(x-2,y+1);
	solve(x-2, y-1);
	if (solved == false){
	    board[x][y] = count;
	}
    }

    public static void main(String[] args){
	KnightsTour k = new KnightsTour();
	System.out.println(k);
	k.solve(2,2);
	System.out.println(k);
    }
}






  // private char me = ‘&’;
    //private char visited = ‘.’;

	/*	try {
	    Scanner sc = new Scanner(new File(“knightstour.dat”));
	    int j = 0;
	    while (sc.hasNext()) {
		String line = sc.nextLine();
		for (int i=0; i<maxX; i++) {
		    board[i][j] = line;
		}
		j++;
	    }
	} catch (Exception e) {} */

  /*   public String toString() {
	String s = “[2J\n”;
        for (int y=0; y<maxY; y++) {
	    for (int x=0; x<maxX; x++) {
		s = s + board[x][y];
	    }
	    s = s + “\n”;
	}
	return s;
	}*/

 /*  if (board[x][y] == 0){
 	    count++;
	    board[x][y] = count;
	    solve(x+1,y+2);
	    solve(x+1, y-2);
	    solve(x-1,y+2);
	    solve(x-1,y+2);
	    solve(x+2, y+1);
            solve(x+2, y-1);
	    solve(x-2,y+1);
	    solve(x-2, y-1);
        }*/

 /*		if (board[x][y] == me || board[x][y] == count || ( board[x][y] !=00 && board[x][y] != ‘=’ && board[x][y] != ‘|’ && board[x][y] != ‘_’ ) || solved == true) {
			return;
			}
			if (board[x][y] == ‘=’ || board[x][y] == ‘|’ || board[x][y] == ‘_’){
			return;
			}
			if (board[x][y] == 00) {
			count++;
			board[x][y] == count;
			solve…………...
			}
			if (count == 25) {
			System.out.println(this);
			solved = true;
			}
			delay(100);
			System.out.println(this);
			board[x][y] = count;
	    */	  
