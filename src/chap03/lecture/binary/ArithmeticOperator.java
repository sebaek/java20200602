package chap03.lecture.binary;

public class ArithmeticOperator {
	public static void main(String[] args) {
		// + - * / %
		// 피연산자 byte, short, int, long, float, double, char
		// 연산결과는 int, long, float, double
		
		int a = 5;
		int b = 7;
		
		int c = 5 + 7;
		c = 5 - 7;
		c = 5 * 7;
		c = 5 / 7;
		
		double d = 3.14;
		double e = 2.12;
		double f = d + e;
		f = d - e;
		f = d * e;
		f = d / e;
		
		
		c = b % a;
		
		f = c * d;
		
		
		char g = 'A';
//		char k = g + 1;
		int l = g + 1;
		
		
		// overflow 주의
		
		int i1 = 2000000000;
		int i2 = 1000000000;
		int i3 = i1 + i2;
		System.out.println(i3);
		
		long l1 = 2000000000;
		long l2 = 2000000000;
		long l3 = l1 + l2;
		System.out.println(l3);
		
	}
}




































