import java.io.*;
import java.util.*;

public class LLit<E> implements Iterator<E>{
    private Node<E> t;
    private Node<E> hello;
    public LLit(Node<E> n){
	t=n;
    }

    public boolean hasNext(){
	return t!=null;
    }

    public E next(){
	E retval = t.getData();
	hello = t;
	t=t.getNext();
	return retval;
    }

    public void remove() {
	hello.setNext(t.getNext());
    }
}