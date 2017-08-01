import java.math.BigInteger;

public class Problem36 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	long sum = 0;
	for (long i = 0; i < 1000000; i++) {
	    BigInteger orig = new BigInteger(Long.toString(i));
	    BigInteger b2 = new BigInteger(Long.toBinaryString(i));
	    //long base2 = b.longValue();
	    if (palindrome(orig) && palindrome(b2)) {
		System.out.println(orig + " " + b2 );
		sum += i;
	    }
	}
	System.out.println(sum);
    }
    public static boolean palindrome(BigInteger c) {
   	String num = c.toString();
   	int start = 0;
   	int end = num.length() - 1;
   	while (start < end) {
   	    if (num.substring(start, start + 1).equals(num.substring(end, end + 1)) == false) {
   		return false;
   	    }
   	    start++;
   	    end--;
   	}

   	return true;
       }
}
