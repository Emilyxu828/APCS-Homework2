import java.io.*;
import java.util.*;

/*public class Stats {
    ArrayList<int[]> nums = new ArrayList<int[]>();
    nums.add(12);
    nums.add(4);
    nums.add(6);
    nums.add(8);
    nums.add(2);
    nums.sort();
    public String toString()
    {
	String s = "[2J\n";				
	for ( int x=0;x<5;x++){
	    s = s + nums[x];
	    s=s+"\n";
	}
	return s;
    }
    public static void main (String[] args) {
	Stats m = new Stats();
	System.out.println(m);

    }
}
*/

public class usaco {
    public int LakeMaking(){
	int[][] cows = {{28, 25, 20, 32, 34, 36},{27, 25, 20, 20, 30, 34},{24, 20, 20, 20, 20, 30},{20, 20, 14, 14, 20, 20}};
	for (int i=0; i<cows.length; i++){
	    for (int j=0; j<cows[0].length; j++){
	        return cows[i][j];
	    }
	}
    }


    public static void main (String[] args){
	usaco u = new usaco();
	System.out.println(u.LakeMaking());
    }
}
