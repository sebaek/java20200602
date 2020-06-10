package chap06.lecture;

public class FinalKeywordEx1 {
	// final : 변수와 같이 쓰면 값을 한 번만 할당할 기회를 갖는다.
	final static int m = 99;
	final static double PI = 3.141592;
	static final int MAX = Integer.MAX_VALUE;
	
	final int k = 0;
	final int l;
	
	FinalKeywordEx1() {
		this.l = 3;
	}
	
	public static void main(final String[] args) {
		final int i = 0;
//		i = 1;
		final int j;
		j = 3;
//		j = 4;
	}
	
	static void method1(final int i) {
//		i = 3;
	}
}





















