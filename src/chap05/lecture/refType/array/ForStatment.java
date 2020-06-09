package chap05.lecture.refType.array;

public class ForStatment {
	public static void main(String[] args) {
		int[] array = {5, 6, 7, 8, 9};
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println();
		
		for (int a : array) {
			System.out.println(a);
		}
	}
}













