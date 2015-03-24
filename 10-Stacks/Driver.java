import java.io.*;
import java.util.*;
public class Driver{
    public static void main(String[] args) {

	myStack<String> m = new myStack<String>();
	mystack<Integer> ms = new myStack<Integer>();

	
	m.add("Hello");
	m.add("world");
	m.add("abc");
	m.add("something");
	m.add("else");

	System.out.println(m);

	for (int i=0;i < 10; i++){
	    ms.add(i);
	}

	System.out.println(ms);
	System.out.println();

	// foreach or for in loop in Java
	for (String s : l){
	    System.out.print(s+", ");
	}
	System.out.println();
	for (int j : l2){
	    System.out.print(j+", ");
	}
	System.out.println();
				
    }
}
