package chap11.lecture.string;

public class ReplaceMethod {
	public static void main(String[] args) {
		String str1 = "서울우유협동조합서울";
		String str2 = str1.replace("서울", "매일");
		
		System.out.println(str1);
		System.out.println(str2);
	}
}
