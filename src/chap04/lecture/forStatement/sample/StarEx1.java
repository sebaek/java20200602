package chap04.lecture.forStatement.sample;

public class StarEx1 {
	public static void main(String[] args) {
//		*
//		**
//		***
//		****
//		*****
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		*****
//		****
//		***
//		**
//		*
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5-i); j++) {
				System.out.print("*"); // 반복
			}
			System.out.println();
		}
		
//		    *
//		   **
//		  ***
//		 ****
//		*****
		for (int i = 0; i < 5; i++) {
			
			// " "
			for (int j = 0; j < (4-i); j++) {
				System.out.print(" ");
			}
			// "*"
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		

//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		for (int i = 0; i < 5; i++) {
			// " "
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// "*"
			for (int k = 0; k < (5 - i); k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}






































































