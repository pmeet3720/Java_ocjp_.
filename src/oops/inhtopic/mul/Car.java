package oops.inhtopic.mul;

public class Car extends Vehicle {
	

	String carModel;
	String fuelType;
	
	public Car(int vehicleNum, String ownerName, String carModel, String fuelType) {
		super(vehicleNum,ownerName);
		this.carModel = carModel;
		this.fuelType = fuelType;
	}
	
	public void displayCarInfo() {
		System.out.println("Vehicle Number: "+super.vehicleNum+" Owner Name: "+super.ownerName+" Car Model: "+carModel+" Car Fuel Type: "+fuelType);
	}
}
