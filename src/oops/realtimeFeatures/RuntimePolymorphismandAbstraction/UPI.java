package oops.realtimeFeatures.RuntimePolymorphismandAbstraction;

public class UPI extends Payment {
	
	private String upiID;
	private String mobileNumber;
	
	public UPI() {
		
	}
	
	public UPI(String payerName, String upiID, String mobileNumber) {
		super(payerName);
		this.upiID = upiID;
		this.mobileNumber = mobileNumber;
	}
	
	@Override
	public void makePayment(double amount) {
		System.out.println("------Verifying UPI Id-------");
		System.out.println("Sending payment amount " +amount+" to mobile number "+mobileNumber);
        System.out.println("Payment successful");		
	}

}
