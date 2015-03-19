public class LLit{
    private Node l;
    public LLit(Node n){
	l = n.getNext();
    }

    public boolean has Next(){
	return l !== null;
    }

    /*
      move to the next node and return to the value in the node (before the move)
    */
    public String next(){
	String s = l.getData();
	l = l.getNext();
	return s;
    }
}

