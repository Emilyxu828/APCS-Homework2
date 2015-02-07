public class recursion {
    public int factorial(int n){
	if (n == 0)
	    return 1;
	else 
	    return n * factorial(n-1);
    }

    public int fib(int n){
	if (n == 0)
	    return 0;
	else if (n == 1)
	    return 1;
	else 
	    return fib(n-1) + fib(n-2);
    }

    public int len(String s){
	if (s.length() == 0)
	    return 0;
	else 
	    return 1 + len(s.substring(1));
    }

    public int count(String s, char c){     
	if (s.length() < 1)
	    return 0;
	else {
	    if (s.substring(0,1).equals(String.valueOf(c)))
		return 1 + count(s.substring(1), c);
	    else 
		return 0 + count(s.substring(1), c);
	}
    }

    //******************** Codingbat Stuff ********************//

    public int fibonacci(int n) {
	if (n == 0)
	    return 0;
	else if (n < 2)
	    return 1;
	else
	    return fibonacci(n-1) + fibonacci(n-2);
    }

    public int bunnyEars2(int bunnies) {
	if (bunnies == 1)
	    return 2;
	if (bunnies == 0)
	    return 0;
	else {
	    if (bunnies % 2 == 0)
		return 3 + bunnyEars2(bunnies-1);
	    else
		return 2 + bunnyEars2(bunnies-1);
	}
    }

    public int strCount(String str, String sub) {
	if (str.length() < sub.length())
	    return 0;
	else {
	    if (str.substring(0,sub.length()).equals(sub))
		return 1 + strCount(str.substring(sub.length()),sub);
	    else
		return 0 + strCount(str.substring(1),sub);
	}
    }

    public int sumDigits(int n) {
	if (n <10) 
	    return n;
	else
	    return (n % 10) + sumDigits(n / 10);
    }

    public String allStar(String str) {
	if (str.equals(""))
	    return ""; 
	else {
	    if (str.length()==1)
		return str;
	    else
		return str.substring(0,1)  + "*" + allStar(str.substring(1));
	}
    }


    public static void main (String[] args) {
	recursion r = new recursion();

	System.out.println("Class stuff:");

	System.out.println("factorial 0: " + r.factorial(0));
	System.out.println("factorial 13: " + r.factorial(13));
	System.out.println("fib 0: " + r.fib(0));
	System.out.println("fib 13: " + r.fib(13));
	System.out.println("len _: " + r.len(""));
	System.out.println("len hello: " + r.len("hello"));
	System.out.println("count a: " + r.count("", 'a'));
	System.out.println("count b: " + r.count("bananabanana", 'b'));

	System.out.println();
	System.out.println("Coding Bat stuff:");

	System.out.println("fibonacci 124: " + r.fibonacci(124));
	System.out.println("fibonacci 45: " + r.fibonacci(45));
	System.out.println("bunnyEars2 124: " + r.bunnyEars2(124));
	System.out.println("bunnyEars2 45: " + r.bunnyEars2(45));
	System.out.println("strCount cat: " + r.strCount("catwocatwocatwo", "cat"));
	System.out.println("strCount iffy: " + r.strCount("jiffybiffyliffykiffysiffy","iffy"));
	System.out.println("sumDigits 124: " + r.sumDigits(124));
	System.out.println("sumDigits 45: " + r.sumDigits(45));
	System.out.println("allStar allstar: " + r.allStar("allstar"));
	System.out.println("allStar star: " + r.allStar("star"));
    }

}