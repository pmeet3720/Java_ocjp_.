package oops.interfacetopic.task.task2;

public class Car implements Vehicle {
	
	
	public String Model;
	public String registrationNumber;
	public double baseRate;
	public int numberOfSeats;
	
	public Car() {
	}
	
	public Car(String Model, String registrationNumber, double baseRate, int numberOfSeats) {
		this.Model = Model;
		this.registrationNumber = registrationNumber;
		this.baseRate = baseRate;
		this.numberOfSeats = numberOfSeats;
	}
	
	@Override
	public String getModel() {
		return Model;
	}
	
	@Override
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	
	@Override
	public void start() {
		System.out.println(getModel()+" car started");
	}
	
	@Override
	public void stop() {
        System.out.println(getModel()+" car stopped");
	}
	
	@Override
	public double calculateRent(int hrs) {
		return hrs*baseRate;
	}

}
