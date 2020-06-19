package chap11.lecture.wrapper;

import java.util.ArrayList;

public class WrapperClass {
	public static void main(String[] args) {
		// byte, short, int, long, float, double, char, boolean
		// Byte, Short, Integer, Long
		// Float, Double, Character, Boolean
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		Integer i1 = new Integer(10);
		ArrayList<Integer> list = new ArrayList<>();
//		ArrayList<int> list2 = new ArrayList<>();
		
		list.add(new Integer(100));// boxing
		Integer v = list.get(0);
		int n = v.intValue();//unboxing
		
		list.add(200); // auto boxing
		int k = list.get(1); // auto unboxing
		
		Integer i2 = 300;
		int k2 = i2;
		
		method1(new Integer(100));
		method1(100);
		
	}
	
	
	public static int method1(Integer i) {
		return i;
	}
}

































