public class BST {    
    private Node T;

    public BST() {
	T = null;
    }
    
    public void insert(int a) {
	if (T==null)
	    T = new Node(a);
	else {
	    Node tmp = T;
	    while (T!=null) {
		int c = compareTo(a);
		tmp = T;
		if (c>0) 
		    T = T.getRight();
		else 
		T = T.getLeft();
	    }
	    if (a<tmp.getData()) 
		tmp.setLeft(new Node(a));
	    else 
		tmp.setRight(new Node(a));
	}
    }


    public Node search(int i) {
	//	Node S = new Node(23);
	while (T!=null) {
            int c = compareTo(i);
	    if (c>0) 
		T = T.getRight();
	    else if (c<0)
	    T = T.getLeft(); 
	    else 
		return T;
	}
	//	return S; // null;
	return null;
    }

    public int compareTo(int a) {
	if (T.getData()<a) 
	    return -1;
	else if (T.getData()>a) 
	    return 1;
	else
	    return 0;
    }

    //public void rinsert(int a) {

}