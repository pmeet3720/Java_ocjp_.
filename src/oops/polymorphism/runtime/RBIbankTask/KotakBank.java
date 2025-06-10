package oops.polymorphism.runtime.RBIbankTask;

public class KotakBank extends RbiBank {
	
	@Override
	public int getRoi() {
		return 10;
	}
	
	public void getKotakUniqueService() {
		System.out.println("Kotak -- unique services beyond standard banking, including Doorstep Banking, a wide range of digital banking options, and innovative solutions for government and business customers.");
	}

}
