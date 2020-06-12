package chap07.lecture.polymorphism.sample3;

public class Phone {
	private Lense lense;
	
	public void setLense(Lense lense) {
		this.lense = lense;
	}
	
	public void selfie() {
		System.out.println("카메라 ");
		lense.feature();
	}
}


