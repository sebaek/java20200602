package chap05.lecture.refType.array;

public class ArrayRefType {
	public static void main(String[] args) {
		int[] arr1 = {3, 4, 5};
		int[] arr2 = new int[] {6, 7, 8};
		int[] arr3 = new int[3];
		
		arr3 = arr1;
		
		arr1[0] = 200;
		System.out.println(arr3[0]);
	}
}









