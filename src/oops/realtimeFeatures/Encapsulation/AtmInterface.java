package oops.realtimeFeatures.Encapsulation;

public class AtmInterface {
	
	private int pinNumber;
	private double accountBalance;
	private boolean isAuthenticated;
	
	//make attributes private so that they are not accessible from outside class,
	//to prevent unauthorized access or manipulation
	public AtmInterface() {
		
	}
	
	//public methods
	public void setPinNumber(int newPin) {
		this.pinNumber = newPin;
		
	}
	
	public boolean authentication(int enteredPin) {
		return true;
	}

}
