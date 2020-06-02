package chap02.lecture.type;

public class FloatType {
	public static void main(String[] args) {
		// 실수 타입: float, double
		// float 크기: 4byte
		// double 크기: 8byte
		// 값을 저장하는 방법 : ieee754
		// double이 float보다 넓은 범위의 수를 더 촘촘히 표현
		
		double d;
		d = 3.14;
		System.out.println(d);
		
		float f;
		f = 3.14F;
		System.out.println(f);
		
		d = 3e6; // 3 * 10^6 => 3000000;
		System.out.println(d);

		d = 2e-3; // 2 * 10^-3 => 0.002
		System.out.println(d);
	}
}





















