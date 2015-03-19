public class LList {
    private Node l=null;
    
    public LList(){
	l = new Node(0);
    }

    private int len = 0;	



    public boolean add(int s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
	len++;
	return true;
    }

    public int get(int n){
	if (n<0 || n>=len){
	    throw new IndexOutOfBoundsException();
	}
	else {
	    Node tmp;
	    int i = 0;   
	    for (tmp=l; tmp!=null; tmp=tmp.getNext()){
		if (i == n)
		    break;
		i++;
	    }
	    return tmp.getData();
	}
    }

    public void add(int n, int s){
	if (n<0 || n>len)
	    throw new IndexOutOfBoundsException();
	else {
	    Node tmp;
	    Node hello = null;
	    Node insertee = new Node(s);
	    int i = 1;
	    if (n == 0){
		tmp = l;
		insertee.setNext(tmp);
	    }	
	    else {
		for (tmp=l; tmp!=null; tmp=tmp.getNext()){
		    if (i == n-1)
			hello = tmp;
		    if (i == n){
			insertee.setNext(tmp);
			hello.setNext(insertee);
		    }
		    i++;
		}
	    }
	    len++;
	}
		
    }

    /*   public void remove(int n){
	if (n<0 || n>=len)
	    throw new IndexOutOfBoundsException();
	else {
	    Node here = get(n);
	    Node hello = get(n-1);
	    Node goodbye = get(n+1);
	    hello.setNext(goodbye);
	    len--;
	    return here;
	}
	} */

    public boolean remove(int i){
	Node tmp;
	for (tmp=l; tmp!=null; tmp=tmp.getNext()){
	    if (tmp.getNext().getData() == i){
		tmp.setNext(tmp.getNext().getNext());
		len--;
		return true;
	    }
	}
	return false;
    }



    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = l; tmp != null; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    public int size(){
	return len;
    }
}
