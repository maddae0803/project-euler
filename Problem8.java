import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Problem8 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	long begin = System.currentTimeMillis();
	long max = 0;
	try {
	    LinkedList<Integer> list = new LinkedList<Integer>();
	    Scanner in = new Scanner(new File(args[0]));
	    while (in.hasNext()) {
		String line = in.next();
		while (line.length() != 0) {
		    int digit = Integer.parseInt(line.substring(0, 1));
		    list.add(digit);
		    line = line.substring(1);
		}
	    }
	    for (int pos = 0; pos < list.size() - 13; pos++) {
		long prod = 1;
		for (int i = pos; i < pos + 13; i++) {
		    prod *= list.get(i);
		    if (prod == 0)
			break;
		}
		if (prod > max)
		    max = prod;
	    }
	    
	    in.close();
	    System.out.println(max);
	    long end = System.currentTimeMillis();
	    System.out.println(end-begin + "ms");
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	   System.out.println("File Could Not Be Opened :(");
	}
    }

}
