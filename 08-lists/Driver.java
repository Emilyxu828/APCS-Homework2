import java.util.*;
public class  Driver{
    public static void main(String[] args) {
	/*	Random r = new Random();
	LList l = new LList();
	for (int i=0; i < 10; i++){
	    l.add(i);
	}
	System.out.println(l);

	System.out.println(l.get(5));
	l.add(0,23);
	l.add(5,32);
        l.add(72);
	l.remove(0);
	System.out.println(l.get(7));
	System.out.println(l);
	*/

	Random r = new Random();

	ArrayList<Integer> al = new ArrayList<Integer>();
	LList l = new LList();
	LinkedList ll = new LinkedList();
	for (int i=0; i<2500; i++){
	    al.add(r.nextInt(10));
	    l.add(r.nextInt(10));
	    ll.add(r.nextInt(10));
	}

	long start, elapsed;

	//ArrayList
       	int sumal = 0;
	start = System.currentTimeMillis();
	for (int i=0; i<al.size(); i++)
	    sumal = sumal + al.get(i);
	elapsed = System.currentTimeMillis() - start;
	System.out.println("ArrayList: " + elapsed);
	System.out.println(sumal);
			   
	
        //LList
	int suml = 0;
	start = System.currentTimeMillis();
	for (int i=0; i<l.size(); i++)
	    suml = suml + (int)l.get(i);
	elapsed = System.currentTimeMillis() - start;
	System.out.println("LList: " + elapsed);
	System.out.println(suml);

	//built in LinkedList
	int sumll = 0;
	start = System.currentTimeMillis();
	for (int i=0; i<ll.size(); i++)
	    sumll = sumll + (int)ll.get(i);
	elapsed = System.currentTimeMillis() - start;
	System.out.println("built in LinkedList: " + elapsed);
	System.out.println(sumll);
    }
}
