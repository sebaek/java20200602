package chap05.lecture.refType.array;

public class NestedArray {
	public static void main(String[] args) {
		int[] arr1 = {3, 4, 5};
		int[] arr2 = {6, 7, 8};
		
		int[] arr3 = arr2;
		
		int[][] arr4;
		arr4 = new int[][] {arr1, arr2};
		
		arr4[1][1] = 200;
		
		System.out.println(arr3[1]);
		
		System.out.println(arr4.length);
		System.out.println(arr4[0].length);
		System.out.println(arr4[1].length);
		
		
		
		
		
		
	}
}
