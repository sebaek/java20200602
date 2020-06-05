package chap11.lecture.string;

public class IndexOfMethod {
	public static void main(String[] args) {
		String str1 = "서울우유협동조합우유";
		int i = str1.indexOf("우유");
		
		System.out.println(i);
		
		i = str1.lastIndexOf("우유");
		System.out.println(i);
		
		i = str1.indexOf("아야");
		System.out.println(i);
		
		
	}
}






