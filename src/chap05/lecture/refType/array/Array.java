package chap05.lecture.refType.array;

public class Array {
	public static void main(String[] args) {
		// array 배열은 여러값을 저장하는 데이터 구조
		int[] arr1;
		
		int arr2[];
//		int[] arr2;
		
		arr1 = null;
		
		int[] arr3 = {3, 2, 99, -1};
		double[] arr4 = {3.14, 2.0, 3, 2.21};
//		char[] arr5 = {'a', '가', 'e', 2222222};
		
		System.out.println(arr3[0]);
		System.out.println(arr4[3]);
		
		arr3[2] = 100;
		
		System.out.println(arr3[2]);
		
		
		
		// 배열 선언 후에 값을 할당할 때
		int[] arr5;
		arr5 = new int[]{2, 5, 2, 1};
		
		// 배열의 크기만 정하고 싶을 때
		int[] arr6;
		arr6 = new int[5];
		
		boolean[] arr7;
		arr7 = new boolean[3];
		
		String[] arr8;
		arr8 = new String[3];
		
		
		
	}
}















