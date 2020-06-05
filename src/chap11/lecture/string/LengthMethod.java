package chap11.lecture.string;

public class LengthMethod {
	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		int len = str1.length();
		
		System.out.println(len);
		
		char c = str1.charAt(len - 1);
		System.out.println(c);
	}
}










