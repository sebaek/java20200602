package chap02.lecture.type;

public class CharType {
	public static void main(String[] args) {
		// char (Character) 문자형
		// 크기 2byte
		// 65536개 값을
		// 0000 0000 0000 0000 ~ 1111 1111 1111 1111
		// 0000 ~ FFFF
		char c;
		c = '\u0000';
		c = '\uFFFF';
		c = '가';
		System.out.println(c);
		
		c = 'K';
		System.out.println(c);
		
//		c = 'AB';
//		c = '';
		
		c = 65;
		System.out.println(c);
	}
}






























