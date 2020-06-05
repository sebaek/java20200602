package chap11.lecture.string;

public class EqualsMethod {
	public static void main(String[] args) {
		String str1 = "JAVA";
		String str2 = new String("JAVA");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.contentEquals(str2));
		
	}
}
