package chap10.lecture.throwKeyword;

public class ThrowEx1 {
	public static void main(String[] args) throws Exception {
		method1();
	}
	
	private static void method1() throws Exception {
		int i = 4;
		if (i > 3) {
			throw new IgreaterThanThreeException("아이가 3보다 큽니다.");
		}
		System.out.println("메소드1 종료");
	}
}






