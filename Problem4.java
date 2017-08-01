
public class Problem4 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	int max = 0;
	for (int a = 100; a < 1000; a++) {
	    for (int b = 100; b < 1000; b++) {
		int c = a * b;
		if (c > max && palindrome(c)) {
		    max = c;
		}
	    }
	}
	System.out.println(max);
    }
    public static boolean palindrome(int c) {
	String num = Integer.toString(c);
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
