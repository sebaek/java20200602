package chap11.lecture.string;

public class SubstringMethod {
	public static void main(String[] args) {
		String str1 = "서울우유협동조합";
		String str2 = str1.substring(2, 4);
		
		System.out.println(str2);
		
		String str3 = str1.substring(4);
		System.out.println(str3);
		
		
	}
}
