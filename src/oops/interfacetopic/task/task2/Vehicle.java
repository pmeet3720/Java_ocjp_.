package oops.interfacetopic.task.task2;

public interface Vehicle {
	
	public abstract String getModel();
	public abstract String getRegistrationNumber();
	public abstract void start();
	public abstract void stop();
	public abstract double calculateRent(int hours);
	
	default void displayInfo() {
		System.out.println("Model: "+getModel());
		System.out.println("Registration Number: "+getRegistrationNumber());
	}

}
