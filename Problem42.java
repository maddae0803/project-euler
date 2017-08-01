import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Problem42 {
    static ArrayList<Integer> trinumbers = new ArrayList<Integer>();
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	int count = 0;
	for (int n = 0; n < 100; n++) {
	    int newtri = (n * (n + 1)) / 2;
	    trinumbers.add(newtri);
	}
	try {
	    Scanner in = new Scanner (new File("Words.txt"));
	    in.useDelimiter(",");
	    while (in.hasNext()) {
		String next = in.next();
		next = next.substring(1);
		next = next.substring(0, next.length() - 1);
		if (trinumbers.contains(getWordVal(next))) {
		    //System.out.println(next);
		    count++;
		}		
	    }
	    System.out.println(count);
	    in.close();
	} catch (FileNotFoundException e) {
	   System.out.println("Could Not Open File");
	}
    }
    public static int getWordVal(String s) {
   	int ret = 0;
   	while (s.length() != 0) {
   	    char c = s.charAt(0);
   	    ret += c - 'A' + 1;
   	    s = s.substring(1);
   	}
   	return ret;
       }
}
