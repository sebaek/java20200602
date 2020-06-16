package chap08.examples.sec080505;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare();
		
		Bus bus = null;
		
		if (vehicle instanceof Bus) {
			bus = (Bus) vehicle;
			bus.run();
			bus.checkFare();
		}
		
	}
}







