import java.util.*;
import java.io.*;

public class selection{
    public int[] partition (int[] L, int startindex, int endindex){
	//int startindex = 0;
	//int endindex = L.length-1;
	int[] D = new int[L.length];
	for (int i=0; i<L.length; i++){
	    if (i<startindex || i>endindex)
		D[i] = L[i];
	}
	int pivot = L[startindex];
	int SI = startindex;
	int EI = endindex;
	for (int q=SI; q<EI+1; q++){
	    if (L[q] < pivot){
		D[startindex] = L[q];
		startindex++;
	    }
	    if (L[q] > pivot){
		D[endindex] = L[q];
		endindex--;
	    }
	}
	D[startindex] = pivot;
	return D;
    }

    public String tostring(int[] a){
	String s = "{";
	for (int i=0; i<a.length; i++)
	    s = s + a[i] + ", ";
	s = s + "}";
	return s;
    }

    public static void main (String[] args){
	selection s = new selection();
	int[] a = {2,6,3,67,9,4,56,7,1,45,74,34};
	System.out.println("pre-partition: " + s.tostring(a));
	System.out.println("post-partition: " + s.tostring(s.partition(a,4,7)));
	System.out.println();
	int[] b = {25,6,3,67,9,4,56,7};
	System.out.println("pre-partition2: ");
	System.out.println(s.tostring(b));
	System.out.println("post-partition2: " + s.tostring(s.partition(b,0,7)));
    }
}
