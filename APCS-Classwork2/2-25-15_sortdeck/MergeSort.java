import java.io.*;
import java.util.*;

public class MergeSort{

    public ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B){
	ArrayList<Integer> C = new ArrayList<Integer>();

	/*	int Asize = A.size();
	int Bsize = B.size();
	int bigger;
	int smaller;
	if (Asize >= Bsize){
	    bigger = Asize;
	    smaller = Bsize;
	}
	else {
	    bigger = Bsize;
	    smaller = Asize;
	    } */

	int i=0;
	int j=0;
	while (i<A.size() || j<B.size()){
	    if (A.get(i) < B.get(j)){
		C.add(A.get(i));
		i++;
	    }
	    else if (A.get(i) < B.get(j)){
		C.add(B.get(i));
		j++;
	    }
	    else {
		C.add(A.get(i));
		C.add(B.get(i));
		i++;
		j++;
	    }
	}

	/*	if (i == A.size()-1 && j != B.size()-1){
	    for(j; j<B.size(); j++)
		C.add(B.get(j));
	}
	if (i != A.size()-1 && j == B.size()-1){
	    for (i; i<A.size(); i++)
		C.add(A.get(i));
		} */

	return C;
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
	m.merge(q,w);
    }
}

