package chap10.lecture.tryCatch;

public class TryCatchEx6MultiCatch {
	public static void main(String[] args) {
		try {
			;;;;
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("예외발생");
		}
	}
}
