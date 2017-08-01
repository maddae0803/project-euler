import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem22 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	try {
	    Scanner in = new Scanner(new File("Names.txt"));
	    ArrayList<String> names = new ArrayList<String>();
	    BigInteger sum = new BigInteger("0");
	    in.useDelimiter(",");
	    while (in.hasNext()) {
		String next = in.next();
		next = next.substring(1);
		next = next.substring(0, next.length() - 1);
		names.add(next);
	    }
	    Collections.sort(names);
	    int pos = 1;
	    for (String s: names) {
		long val = getNameVal(s);
		long prod = val * pos;
		sum = sum.add(new BigInteger(Long.toString(prod)));
		pos++;
	    }
	    //System.out.println(getNameVal("COLIN"));
	    System.out.println(sum);
	    in.close();
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
    public static long getNameVal(String s) {
	long ret = 0;
	while (s.length() != 0) {
	    char c = s.charAt(0);
	    ret += c - 'A' + 1;
	    s = s.substring(1);
	}
	return ret;
    }
}
