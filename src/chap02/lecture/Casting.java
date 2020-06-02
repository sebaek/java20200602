package chap02.lecture;

public class Casting {
	public static void main(String[] args) {
		// 타입 변화 (type casting)
		// 1. 자동 형변환
		// byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)
		//             char(2) ↗
		
		byte b = 3;
		short s = b;
		char c = '가';
		int i = c;
		
		long l = 999;
		float f = l;
		
		// 자동 형변환은 연산할 때도 이루어짐
		double d1 = 3.14;
		int i1 = 3;
		double d2 = d1 + i1;
		System.out.println(d2);
		
		// byte, short, int 끼리 연산하면 연산결과 int
		byte b1 = 22;
		byte b2 = 33;
//		byte b3 = b1 + b2;
		
		
		// 2. 강제 형변환
		long lo = 30000;
		int in = (int) lo;
		
		short sh = 128;
		byte by = (byte) sh;
		System.out.println(by);
	
		
		// 
	}
}






















