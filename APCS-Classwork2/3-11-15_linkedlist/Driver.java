public class Driver{

    public static void main(String[] args){
	Node n = new Node("hello");
	//	System.out.println(n);

	Node n2 = new Node("World");
	//	System.out.println(n);

	n.setNext(n2);

	System.out.println(n.getNext().getData());
	System.out.println(n.getNext());

	n.getNext().setData("pickle");
	System.out.println(n2);
	System.out.println(n.getNext().getData());

	n2.setData("watermelon");
	System.out.println(n.getNext().getData());
    }
}
