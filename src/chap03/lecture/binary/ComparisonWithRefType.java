package chap03.lecture.binary;

public class ComparisonWithRefType {
	public static void main(String[] args) {
		// == !=
		// 피연산자가 참조타입 가능
		// 결과는 boolean 타입
		
		String s1 = "자바";
		String s2 = "자바";
		String s3 = new String("자바");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1 == s3);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s3));
		
	}
}









