package oops.realtimeFeatures.RuntimePolymorphismandAbstraction;

public abstract class Payment {
	
	protected double amount;
	protected String payerName;
	
	public Payment() {
		
	}
	
	public Payment(String payerName) {
		this.payerName = payerName;
	}
	
	public abstract void makePayment(double amount);

}
