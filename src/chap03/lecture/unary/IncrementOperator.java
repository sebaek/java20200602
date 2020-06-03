package chap03.lecture.unary;

public class IncrementOperator {
	public static void main(String[] args) {
		// ++ --

		// 증가연산자: 변수가 가진 값에 1을 더해서 변수에 넣는다.
		int a = 5;
		a++;
		a = a + 1;
		System.out.println(a);

		// 감소연산자: 변수가 가진 값에 1을 빼서 변수에 넣는다.
		a--;
		a = a - 1;
		System.out.println(a);

		// 피연산의 위치에 따라 사용에 주의 해야함.
		++a;
		--a;
		
		System.out.println(a);
		int c = ++a + 1; // 더한 a를 사용함.
		System.out.println(c);
		
		c = a++ + 1; // a를 사용하고 더함.
		System.out.println(c);
		System.out.println(a);
		
		
	}
}































