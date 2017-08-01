import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;


public class Problem45 {
    /**
    static ArrayList<BigInteger> trinumbers = new ArrayList<BigInteger>();
    static ArrayList<BigInteger> pentnumbers = new ArrayList<BigInteger>();
    static ArrayList<BigInteger> hexnumbers = new ArrayList<BigInteger>();**/
    
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	/**
	for (long n = 285; n < 10000; n++) {
	    BigInteger newnum = new BigInteger(Long.toString((n * (n+1)) / 2));
	    trinumbers.add(newnum);
	}
	for (long n = 165; n < 100000; n++) {
	    BigInteger newnum = new BigInteger(Long.toString((n * (3 * n - 1)) / 2));
	    pentnumbers.add(newnum);
	}
	for (long n = 143; n < 100000; n++) {
	    BigInteger newnum = new BigInteger(Long.toString((n * (2 * n - 1))));
	    hexnumbers.add(newnum);
	}**/
	long begin = System.currentTimeMillis();
	
	BigInteger num = new BigInteger("40755"); 
	int count = 0;
	while (count != 2) {
	    //BigInteger i = new BigInteger(Long.toString(pos));
	  if (ishex(num) && ispent(num)) {
		System.out.println(num);
		count++;
	    }
	    num = num.add(new BigInteger("1"));
	}
	long end = System.currentTimeMillis();
	System.out.println(end-begin + "ms");
    }
    
    public static boolean ishex(BigInteger b) {
	//double quad = quadraticf(2, -1, b.longValue() * -1);
	BigDecimal quad = quadraticf(new BigDecimal(2), new BigDecimal(-1), new BigDecimal(b.multiply(new BigInteger("-1"))));
	BigDecimal rounded = quad.setScale(0, RoundingMode.DOWN);
	if (quad.subtract(rounded).compareTo(new BigDecimal(.00000000001)) > 0)
	    return false;
	return true;
    }
    
    public static boolean ispent(BigInteger b) {
	BigDecimal quad = quadraticf(new BigDecimal(3), new BigDecimal(-1), new BigDecimal(b.multiply(new BigInteger("-1")).multiply(new BigInteger("2"))));
   	BigDecimal rounded = quad.setScale(0,  RoundingMode.DOWN);
	//BigInteger temp = b.multiply(new BigInteger("2")).multiply(new BigInteger("-1"));
   	//double quad = quadraticf(3, -1, temp.longValue());
   	//if (quad - (int) quad > 0)
   	    //return false;
   	if (quad.subtract(rounded).compareTo(new BigDecimal(.0001)) > 0)
	    return false;
	return true;
       }
    
    public static boolean istri(BigInteger b) {
	BigDecimal quad = quadraticf(new BigDecimal(1), new BigDecimal(1), new BigDecimal(b.multiply(new BigInteger("-1")).multiply(new BigInteger("2"))));
   	BigDecimal rounded = quad.setScale(0,  RoundingMode.DOWN); 
   	if (quad.subtract(rounded).compareTo(new BigDecimal(.0001)) > 0)
	    return false;
	return true;
    }
    public static BigDecimal quadraticf(BigDecimal a, BigDecimal b, BigDecimal c) {
	BigDecimal radicand = b.pow(2).subtract(a.multiply(c).multiply(new BigDecimal(4)));
	BigDecimal positive = b.multiply(new BigDecimal(-1)).add(sqrt(radicand)).divide(a.multiply(new BigDecimal(2)), 2);
	if (positive.compareTo(new BigDecimal("0")) < 0)
	    return b.multiply(new BigDecimal(-1)).subtract(sqrt(radicand)).divide(a.multiply(new BigDecimal(2)), 2);
	return positive;
    }
  
    public static BigDecimal sqrt(BigDecimal n) {
	return BigDecimal.valueOf(StrictMath.sqrt(n.doubleValue()));
    }
	/**
	double d = Math.pow(n.doubleValue(), 0.5);
	BigDecimal ret = new BigDecimal(d);
	return ret;**/
    }
    /**
    public BigInteger sqrt(BigInteger n) {
	  BigInteger a = BigInteger.ONE;
	  BigInteger b = new BigInteger(n.shiftRight(5).add(new BigInteger("8")).toString());
	  while(b.compareTo(a) >= 0) {
	    BigInteger mid = new BigInteger(a.add(b).shiftRight(1).toString());
	    if(mid.multiply(mid).compareTo(n) > 0) b = mid.subtract(BigInteger.ONE);
	    else a = mid.add(BigInteger.ONE);
	  }
	  return a.subtract(BigInteger.ONE);
	}**/
    /**
    public static double quadraticf(long a, long b, long c) {
	double positive = (b * -1 + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
	if (positive < 0)
	    return (b * -1 - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
	return positive; 
    }**/
//}
