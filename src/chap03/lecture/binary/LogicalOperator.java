package chap03.lecture.binary;

public class LogicalOperator {
	public static void main(String[] args) {
		// &&(and) ||(or)
		// 피연산자 boolean
		// 결과 boolean
		System.out.println("==and==");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		System.out.println("==or==");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println("==xor==");// 양변이 다를때만 true
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);

		System.out.println("==and== &");
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);

		System.out.println("==or== |");
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | true);
		System.out.println(false | false);

		System.out.println();

		// &&와 &의 차이
		int i = 5;
		int j = 7;
		System.out.println((i > 0) && (j > 5));
		System.out.println(i < 0 && j++ > 5);//short circuit
		System.out.println(j);
		
		System.out.println(i < 0 & j++ > 5);
		System.out.println(j);
	}
}














