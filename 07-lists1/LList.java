public class LList {
    private Node l=null;

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
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

    public String find(int n){
	//will return the value in the nth element of the linked list.
        String s = "";
	Node tmp;
	int i = 0;
	for (tmp=l; tmp!=null; tmp=tmp.getNext()){
	    if (i == n)
		s = s + tmp;
	    i++;
	}
	return s;
    }

    public void insert(int n, String s){
	// inserts string s at location n.
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
		
    }
}
