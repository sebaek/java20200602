package chap02.lecture;

public class Scope {
	public static void main(String[] args) {
		// 변수의 접근 영역
		// 선언된 중괄호 안에서만 사용 가능
		
		int k = 9;
		if (true) {
			int v = 3;
			System.out.println(v);
			System.out.println(k);
		}
		System.out.println(k);
//		System.out.println(v);
	}
}






