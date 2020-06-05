package chap04.lecture.forStatement;

public class ForStatement {
	public static void main(String[] args) {
		// for (1;2;3) { code block;}
		
		// 실행 순서 
		// 1 -> 2 ->true-> codeblock -> 3 ->2
		//        ->false ->종료
		
		for (int i = 0; i < 3; i++) { 
			System.out.println("실행문");
		}
		
		
	}
}







