package chap11.lecture.classClass;

import java.lang.reflect.Method;

public class ClassEx1 {
	public static void main(String[] args) throws Exception {
		Class c1 = Class.forName("java.lang.String");
		String s = "";
		Class c2 = s.getClass();
		Class c3 = String.class;
		
//		c1.getFields();
		Method[] methods = c1.getMethods();
//		c1.getConstructors();
		
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		
		
		
		
	}
}







