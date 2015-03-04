import java.io.*;
import java.util.*;

public class MergeSort{
   
    /*------------------ ArrayList ------------------*/

    public ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B){
        ArrayList<Integer> C = new ArrayList<Integer>();
	int i=0;
	int j=0;
	while (i<A.size() && j<B.size()){
	    if (A.get(i) < B.get(j)){
		C.add(A.get(i));
		i++;
	    }
	    else {
		C.add(B.get(j));
		j++;
	    }
	}
	while (i < A.size()){
	    C.add(A.get(i));
	    i++;
	}
	while (j < B.size()){
	    C.add(B.get(j));
	    j++;
	}
	return C;
    }

    public ArrayList<Integer> mergesort(ArrayList<Integer> D){
	if (D.size()==1)
	    return D;
	else {
	    ArrayList<Integer> E = new ArrayList<Integer>();
	    int middle = D.size()/2;
	    for (int i=0; i<middle; i++)
		E.add(D.get(i));
	    ArrayList<Integer> F = new ArrayList<Integer>();
	    for (int q=middle; q<D.size(); q++)
		F.add(D.get(q));

	    if (E.size()>1)
		mergesort(E);
	    if (F.size()>1)
		mergesort(F);

	    ArrayList<Integer> G = mergesort(E);
	    ArrayList<Integer> H = mergesort(F);
	    return merge(G,H);
	}
    }




    /*------------------ Array ------------------*/

  
    public int[] merge(int[] A, int[] B){
        int[] C = new int[A.length+B.length];
	int i=0;
	int j=0;
	int k=0;
	while (i<A.length && j<B.length){
	    if (A[i] < B[j]){
		C[k] = A[i];
		i++;
		k++;
	    }
	    else {
		C[k] = B[j];
		j++;
		k++;
	    }
	}
	while (i < A.length){
	    C[k] = A[i];
	    i++;
	    k++;
	}
	while (j < B.length){
	    C[k] = B[j];
	    j++;
	    k++;
	}
	return C;
    }

    public int[] mergesort(int[] D){
	if (D.length == 1)
	    return D;
	else {
	    int middle = D.length/2;
	    int[] E = new int[middle];
	    int ee = 0;
	    for (int i=0; i<middle; i++){
		E[ee] = D[i];
		ee++;
	    }
	    int[] F = new int[D.length-middle];
	    int ff = 0;
	    for (int q=middle; q<D.length; q++){
		F[ff] = D[q];
		ff++;
	    }

	    int[] G = mergesort(E);
	    int[] H = mergesort(F);
	    return merge(G,H);
	}
    }
    public String tostring(int[] x){
        String s = "{";
	for (int i=0; i<x.length; i++){
	    s = s + x[i] + ", ";
	}
	s = s + "}";
	return s;	    
    }

    public static void main (String args[]){
	MergeSort m = new MergeSort();
	ArrayList<Integer> q = new ArrayList<Integer>();
	q.add(1);
	q.add(2);
	q.add(5);
	q.add(7);
	ArrayList<Integer> w = new ArrayList<Integer>();
	w.add(2);
	w.add(3);
	w.add(4);
	w.add(5);
	System.out.println("pre-merge arraylists");
	System.out.println(q);
	System.out.println(w);
	System.out.println("post-merge arraylist");
	System.out.println(m.merge(q,w));
	ArrayList<Integer> r = new ArrayList<Integer>();
	r.add(34);
	r.add(5);
	r.add(24);
	r.add(9);
	r.add(2);
	r.add(3);
	r.add(78);
	System.out.println("pre-mergesort arraylist");
	System.out.println(r);
	System.out.println("post-mergesort arraylist");
	System.out.println(m.mergesort(r));

	int[] v = {1,3,5};
	int[] n = {2,4,6};
	int[] t = {3, 6, 4, 9, 1, 4, 2};
	System.out.println("pre-merge arrays");
	System.out.println(m.tostring(v) + "and" + m.tostring(n));
	System.out.println("post-merge arrays");
	System.out.println(m.tostring(m.merge(v, n)));
	System.out.println("pre-mergesort array");
	System.out.println(m.tostring(t));
	System.out.println("post-mergesort array");
	System.out.println(m.tostring(m.mergesort(t)));
       	
    }
}

