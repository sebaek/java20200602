package chap02.lecture.type;

public class LongType {
	public static void main(String[] args) {
		// long
		// 크기가 8byte 
		// 최대값 9223372036854775807
		// 최소값 -9223372036854775808
		long l = 9223372036854775807L;
		l = 2147483648L;
//		l = 9223372036854775808L;
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
	}
}
