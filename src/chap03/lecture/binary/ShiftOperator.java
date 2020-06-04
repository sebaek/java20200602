package chap03.lecture.binary;

public class ShiftOperator {
	public static void main(String[] args) {
		// << >> >>>
		
		// 10  :  0000 0000 0000 0000 0000 0000 0000 1010
		// <<1 :  000 0000 0000 0000 0000 0000 0000 10100
		// >>1 :  00000 0000 0000 0000 0000 0000 0000 101
		int i = 10;
		System.out.println(i << 1);
		System.out.println(i << 2);
		
		System.out.println(i >> 1);
		System.out.println(i >> 2);
		
		i = -10;
		System.out.println(i << 1);
		System.out.println(i >> 1);
		
		// -10:    1111 1111 1111 1111 1111 1111 1111 0110
		// >>> 1 : 01111 1111 1111 1111 1111 1111 1111 011
		System.out.println(i >>> 1);
	}
}



















