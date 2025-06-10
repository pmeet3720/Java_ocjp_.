package oops.polymorphism.runtime.RBIbankTask;

public class SbiBank extends RbiBank {
	
	@Override
	public int getRoi() {
		return 8;
	}
	
	public void getSbiUniqueService() {
		System.out.println("SBI -- YONO, a platform for digital banking and lifestyle services. ");
	}

}
