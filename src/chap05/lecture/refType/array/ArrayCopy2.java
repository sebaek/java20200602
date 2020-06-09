package chap05.lecture.refType.array;

public class ArrayCopy2 {
	public static void main(String[] args) {
		int[][] origin = { { 3, 4 }, { 100, 200 } };
		int[][] target = new int[origin.length][];
		
//		얕은 복사 (shallow copy)
//		for (int i = 0; i < origin.length; i++) {
//			target[i] = origin[i];
//		}
		
		// 깊은 복사 (deep copy)
		for (int i = 0; i < origin.length; i++) {
			target[i] = new int[origin[i].length];
			for (int j = 0; j < origin[i].length; j++) {
				target[i][j] = origin[i][j];
			}
		}
		
		for (int i = 0; i < target.length; i++) {
			for (int j = 0; j < target[i].length; j++) {
				System.out.println(target[i][j]);
			}
		}
		
		origin[0][0] = 300;
		
		for (int[] n : target) {
			for (int t : n) {
				System.out.println(t);
			}
		}
	}
}















