import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Date19 {
	protected String month;
	protected int year;
	protected int day;
	protected List<String> months = new ArrayList<>(Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
	
	public Date19(String m, int d, int y) {
	    month = m;
	    year = y;
	    day = d;
	}
	public int getDays() {
	    ArrayList<String> thirty = new ArrayList<String>();
	    thirty.add("April");
	    thirty.add("June");
	    thirty.add("September");
	    thirty.add("November");
	    if (thirty.contains(month)) {
		return 30;
	    }
	    else if (month.equals("February")) {
		if (year % 4 == 0) {
		    if (year % 100 == 0) {
			if (year % 400 == 0)
			    return 29;
			return 28;
		    }
		    return 29;
		}
		return 28;
	    }
	    return 31;
	}
	public void nextWeek() {
	    int sum = day + 7;
	    if (sum % getDays() == 0) {
		day = sum;
	    }
	    else {
		day = sum % getDays();
	    if (sum / getDays() > 0) {
		int index = months.indexOf(month) + 1;
		month = months.get(index % 12);
		if (month.equals("January"))
		    year++;
	      }
	    }
	}
	public boolean equals(Date19 d) {
	    return month.equals(d.month) && year == d.year && day == d.day;
	}
	public String toString() {
	    return month + " " + day + " " + year + "\n";
	}
    }
