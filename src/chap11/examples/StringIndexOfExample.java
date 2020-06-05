package chap11.examples;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		String p = "프로그래밍";
		int location = subject.indexOf(p);
		System.out.println(location);
		
		if (subject.indexOf("잡아") != -1) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련없는 책이군요.");
		}
		
	}
}
