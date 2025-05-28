package oops.inhtopic.mul;

public class Vehicle {
	
	int vehicleNum;
	String ownerName;
	
	public Vehicle(int vehicleNum, String ownerName) {
		this.vehicleNum = vehicleNum;
		this.ownerName = ownerName;
	}
	
	public void displayVehicleInfo() {
		System.out.println("Vehicle Number: "+vehicleNum+" Owner Name: "+ownerName);
		
	}

}
