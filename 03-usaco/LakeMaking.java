public class LakeMaking {


    public int LakeMaking(){
	int[][] cows = {{28, 25, 20, 32, 34, 36},{27, 25, 20, 20, 30, 34},{24, 20, 20, 20, 20, 30},{20, 20, 14, 14, 20, 20}};
	for (int i=0; i<cows.length; i++){
	    for (int j=0; j<cows[0].length; j++){
	        return cows[i][j];
	    }
	}
	int[] line1 = {1, 4, 4};


	int[] line2 = {1, 1, 10};


	//line1 = 4 6 22 2
	//line2 = 1 4 4
	//line3 = 1 1 10
    }


    public static void main (String[] args){
	usaco u = new usaco();
	System.out.println(u.LakeMaking());
    }
}







/* 
6'x6' squares
elevation in inches
stomp in inches
N --> # of stomp instructions
E - elevation
*/





