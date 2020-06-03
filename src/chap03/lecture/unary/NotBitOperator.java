package chap03.lecture.unary;

public class NotBitOperator {
	public static void main(String[] args) {
		// ~
		// 피연산자가 정수(byte, short, int, long)
		// 연산결과는 int or long
		int i = 3;
		i = ~i;
		
		// 0000 0000 0000 0000 0000 0000 0000 0011
		// 1111 1111 1111 1111 1111 1111 1111 1100
		System.out.println(i);
		
		long l = 3;
		l = ~l;
		System.out.println(l);
		
		
	}
}









