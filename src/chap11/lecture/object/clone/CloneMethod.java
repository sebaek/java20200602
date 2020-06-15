package chap11.lecture.object.clone;

public class CloneMethod {
	public static void main(String[] args) throws Exception {
		MyClass c1 = new MyClass();
		c1.setId(99);
		c1.setName("java");
		c1.setArr(new int[] {3,4});
		
		MyClass c2 = new MyClass();
		c2.setId(c1.getId());
		c2.setName(c1.getName());
		
		MyClass c3 = c1.copy();
		c1.getArr()[0] = 300;
		System.out.println(c3.getId());
		System.out.println(c3.getName());
		System.out.println(c3.getArr()[0]);
		System.out.println(c3.getArr()[1]);
		
		System.out.println(c1 == c3);
	}
}



























