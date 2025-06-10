package oops.polymorphism.runtime.RBIbankTask;

public class HdfcBank extends RbiBank{
	
	@Override
	public int getRoi() {
		return 11;
	}
	
	public void getHdfcUniqueService() {
		System.out.println("HDFC -- unique services include digital banking platforms like Mobile Banking, Net Banking, and PayZapp.");
	}

}
