package chap06.examples.sec061504;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
//		Method[] declaredMethods = Service.class.getDeclaredMethods();
		Class c1 = Service.class;
		Method[] declaredMethods = c1.getDeclaredMethods();
		
		for (Method method : declaredMethods) {
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				System.out.println("[" + method.getName() + "]");
				
				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					method.invoke(new Service());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				System.out.println();
			}
			
			
			
			
			
			
			
			
		}
	}
}
