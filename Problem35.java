import java.util.ArrayList;
public class Problem35 {
    
    static ArrayList<Integer> cprimes = new ArrayList<Integer>();
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	for (int i = 2; i < 1000000; i++) {
    	    if (prime(i) && cprimes.contains(i) == false)
    		testforCirc(i);
    	}
    	System.out.println(cprimes.size());
      
    
    }
    public static void testforCirc(int i) {
	int length = Integer.valueOf(i).toString().length();
	boolean add = true; 
	ArrayList<Integer> newcircs = new ArrayList<Integer>();
	newcircs.add(i);
	for (int pos = 0; pos < length - 1; pos++) {
	    i = rotate(i);
	    if (prime(i) == false || Integer.toString(i).length() != length) {
		add = false; 
		break;
	    }
	    //if (newcircs.contains(i) == false && cprimes.contains(i) == false)
		newcircs.add(i);
	}
	if (add && newcircs.size() == length) {
	    for (Integer integer: newcircs) {
		if (cprimes.contains(integer) == false)
		    cprimes.add(integer);
	    }
	}
    }
    
    public static int rotate(int i) {
	String num = Integer.toString(i);
	String ret = "";
	String c = num.substring(0, 1);
	num = num.substring(1);
	ret += num;
	ret += c;
	return Integer.parseInt(ret);
    }
    public static boolean prime(int a) {
       	for (int x = 2; x <= Math.sqrt(a); x++) {
       	    if (a % x == 0)
       		return false;
       	}
       	return true;
           }
    }
