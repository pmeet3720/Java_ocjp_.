package oops.realtimeFeatures.RuntimePolymorphismandAbstraction;

public class NetBanking extends Payment {
	
	
	private String bankName;
	private String accountNumber;
	private String ifscCode;
	
	public NetBanking() {
		
	}
	
	public NetBanking(String payerName, String bankName, String accountNumber, String ifscCode){
	
		super(payerName);
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
	}
		
	
	@Override
	public void makePayment(double amount) {
		System.out.println("------Connecting to bank "+bankName+"---------");
		System.out.println("Verifying account: "+accountNumber);
		System.out.println("Payment of ₹ "+amount+" is successful");
	}

}
