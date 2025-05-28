package oops.inhtopic.mul;

public class ElectricCar extends Car {
	
	String batteryCapacity;
	String rangePerCharge;
	
	public ElectricCar(int vehicleNum, String ownerName, String carModel, String fuelType, String batteryCap, String rangePerCharge) {
		super(vehicleNum, ownerName, carModel, fuelType);
		this.batteryCapacity = batteryCap;
		this.rangePerCharge = rangePerCharge;
	}
	
	public void displayElectricCarInfo() {
		System.out.println("Vehicle Number: "+vehicleNum+"\n"+"Owner Name: "+ownerName+"\n"+"Car Model: "+carModel+"\n"+"Car Fuel Type: "+fuelType+"\n"+"Battery Capacity: "+batteryCapacity+"\n"+"Range per charge: "+rangePerCharge);
	}

}
