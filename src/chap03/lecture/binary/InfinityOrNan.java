package chap03.lecture.binary;

public class InfinityOrNan {
	public static void main(String[] args) {
		// % /
		int i = 5;
		int j = 0;
//		int k = i / j;
//		System.out.println(k);
//		int k = i % j;
		
		double d = 5.0;
		double e = 0.0;
		double f = d / e;
		System.out.println(f);
		
		e = -0.0;
		f = d / e;
		System.out.println(f); // -Infinity
		f = f + 100000000000L;
		System.out.println(f);
		System.out.println(Double.isInfinite(f));
		
		f = d % e;
		System.out.println(f);
		f = f + 10000000000L;
		System.out.println(f);
		
		System.out.println(Double.isNaN(f));
		
		
		
	}
}









