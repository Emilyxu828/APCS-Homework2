public class myStack<E>{
    // You decide how the node(s) are declared

    // make whatever constructor(s) you need

    private Node<E> l;
    public myStack(Node<E> n){
	l = n;
    }


    public void push(E data){
        // add something to the top
	Node<E> tmp;
	for  (tmp=l; tmp!=null; tmp=tmp.getNext()){
	    if (tmp.getNext() == null)
		tmp.getNext().setNext(data);
	}

    }

    public E pop(){
        // remove and return the top item from the stack
	Node<E> tp;
	E topitem;
	for  (tp=l; tp!=null; tp=tp.getNext())
	    topitem = tp.getData();
	//E topitem = l.top();

        Node<E> tmp;
	int i = 0;
	for  (tmp=l; tmp!=null; tmp=tmp.getNext()){
	    if (tmp.getNext() == topitem)
		tmp.setNext(null);
	}
	return topitem;
    }

    public boolean empty(){
        Node<E> tmp=l;
	return tmp.getData() == null;
    }

    public E top() {
        // return the top item from the stack
        Node<E> tmp;
	Node<E> i;
	for  (tmp=l; tmp!=null; tmp=tmp.getNext())
	    i = tmp.getData();
	return tmp;
    }
}
