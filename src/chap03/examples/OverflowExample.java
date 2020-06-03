package chap03.examples;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		
		long lx = 1000000;
		long ly = 1000000;
		long lz = lx * ly;
		System.out.println(lz);
	}
}







