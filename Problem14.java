
public class Problem14 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	long begin = System.currentTimeMillis();
	long maxChain = 0;
	long maxStart = 0;
	for (long i = 1; i < 1000000; i++) {
	    long chain = collatz(i);
	    if (maxChain < chain) {
		maxChain = chain;
		maxStart = i; 
		//System.out.println("Start: " + maxStart + " Chain Size: " + maxChain);
	    }
	}
	System.out.println(maxStart);
	long end = System.currentTimeMillis();
	System.out.println(end-begin + "ms");
    }
    public static long collatz(long i) {
	long count = 1;
	while (i != 1) {
	    if (i % 2 == 0)
		i = i / 2;
	    else 
		i = 3 * i + 1;
	    count++;
	}
	
	return count; 
    }
}
