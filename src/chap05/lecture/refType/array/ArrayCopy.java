package chap05.lecture.refType.array;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] origin = {3, 4, 5, 6, 7, 8};
		int[] target = new int[origin.length];
		int[] target2 = new int[origin.length];
		
		for (int i = 0; i < origin.length; i++) {
			target[i] = origin[i];
		}
		
		for (int i = 0; i < target.length; i++) {
			System.out.println(target[i]);
		}
		
		System.out.println();
		System.arraycopy(origin, 0, target2, 0, origin.length);
		
		for (int i = 0; i < target2.length; i++) {
			System.out.println(target2[i]);
		}
	}
}

















