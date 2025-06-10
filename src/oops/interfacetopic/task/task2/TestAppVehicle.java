package oops.interfacetopic.task.task2;

public class TestAppVehicle {
	
	public static void main(String[] args) {
		Vehicle veh = null;
		
		veh = new Car("Nexon ev","8876",350.00,5);
		veh.displayInfo();
	}
}
