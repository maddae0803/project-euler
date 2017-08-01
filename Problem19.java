import java.util.*;
public class Problem19 {
    
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	long begin = System.currentTimeMillis();
	Date19 d = new Date19("January", 7, 1900);
	int count = 0;
	while (d.year < 2001) {
	    if (d.year >= 1901 && d.day == 1)
		count++;
	    d.nextWeek();
	}
	System.out.println(count);
	long end = System.currentTimeMillis();
	System.out.println((end-begin) + "ms");
    }

}
