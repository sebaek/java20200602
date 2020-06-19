package chap06.lecture.annotation;

@MyAnnotation(name="hi", id=3, numbers= {1, 2}, value="j")
public class AnnotationEx1 {
	
//	@MyAnnotation
	int field;
	
//	@MyAnnotation
	public AnnotationEx1() {
		// TODO Auto-generated constructor stub
	}
	
	@MyAnnotation("k")
	public void method(int k) {
		
	}
}





