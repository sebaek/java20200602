package chap07.lecture.instanceofOp;

public class InstanceOfOp {
	public static void main(String[] args) {
		// instanceof
		// 왼항 참조변수
		// 오항 타입명
		// 결과 boolean
		SuperClass c1 = new SubClass1();
		SuperClass c2 = new SubClass2();
		
		System.out.println(c1 instanceof SuperClass);
		System.out.println(c1 instanceof SubClass1);
		System.out.println(c1 instanceof SubClass2);
		
		if (c1 instanceof SubClass2) {
			SubClass2 s1 = (SubClass2) c1;
		}
		if (c2 instanceof SubClass2) {
			SubClass2 s2 = (SubClass2) c2;
		}
		
		System.out.println("프로그램 정상 종료");
	}
}











