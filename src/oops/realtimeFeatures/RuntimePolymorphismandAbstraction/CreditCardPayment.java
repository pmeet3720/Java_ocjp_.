package oops.realtimeFeatures.RuntimePolymorphismandAbstraction;

public class CreditCardPayment extends Payment {
	
	private String cardNumber;
	private String expiryDate;
	private String cvv;
	
	public CreditCardPayment() {
		
	}
	
	public CreditCardPayment(String payerName, String cardNumber, String expiryDate, String cvv) {
		super(payerName);
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
	}
	
	@Override
	public void makePayment(double amount) {
		System.out.println("-----Verifying credit card details-------");
		System.out.println("Processing amount "+amount+" from "+"Card Number: "+cardNumber);
		System.out.println("Payment successful");
	}
}
