package chap06.lecture.constructor;

public class City {
	String name;
	String location;
	
	City() {
//		this.name = "seoul";
//		this.location = "korea";
		this("seoul", "korea");
	}
	
	City(String name, String location) {
		this.name = name;
		this.location = location;
	}
}










