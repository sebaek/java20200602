package chap11.examples.sec110601;

import chap09.exercises.ex04.Car;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		try {
			Class clazz2 = Class.forName("chap09.exercises.ex04.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}







