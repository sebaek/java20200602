package chap05.lecture.refType;

public class RefTypeEquals {
	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = new String("java");
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 == str2);
		
		System.out.println(str1.equals(str2));
		
		
	}
}
