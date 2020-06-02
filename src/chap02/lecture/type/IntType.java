package chap02.lecture.type;

public class IntType {
	public static void main(String[] args) {
		// int
		// 크기가 4byte
		// 최대값 2147483647
		// 최소값 -2147483648
		int i = 2147483647;
//		i = 2147483648;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// 정수 리터럴 (literal)
		i = 30000;
		i = 2_147_483_600;
		System.out.println(i);
		
		i = 027; // 8진법
		System.out.println(i);
		
		i = 0XA; // 16진법
		System.out.println(i);
		
		i = 0xbb;
		System.out.println(i);
	}
}














