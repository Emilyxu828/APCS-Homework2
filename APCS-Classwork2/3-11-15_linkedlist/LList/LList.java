public class LList{
    private Node l = null;

    public void add(String s){
	//l = new Node(s);
	//l.setNext(null);
	Node tmp = new Node(s);
	tmp.setNext(l);
.........................
    }    

    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = l; tmp != null; tmp = tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
}
