package oops.polymorphism.runtime.RBIbankTask;

import java.util.Scanner;
public class TestAppBank {
	
	public static int getExecutedByProfile(RbiBank rbi) {
		int roi;
	    roi = rbi.getRoi();
		
		if(rbi instanceof AxisBank) {
			AxisBank axis = (AxisBank)rbi;
			axis.getAxisUniqueServices();
		}else if(rbi instanceof SbiBank) {
			SbiBank sbi = (SbiBank)rbi;
			sbi.getSbiUniqueService();
		}else if(rbi instanceof HdfcBank) {
			HdfcBank hdfc = (HdfcBank)rbi;
			hdfc.getHdfcUniqueService();
		}else if(rbi instanceof KotakBank) {
			KotakBank kotak = (KotakBank)rbi;
			kotak.getKotakUniqueService();
		}
		return roi;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1__Axis");
		System.out.println("2__SbiBank");
		System.out.println("3__KotakBank");
		System.out.println("4__HdfcBank");
		
		System.out.println("Enter which bank to invest: ");
		int choice = sc.nextInt();
		
		RbiBank rbi = null;
		int roi=0;
		long amount = 250000L;
		
		switch (choice) {
		case 1:rbi = new AxisBank();
//		       roi = rbi.getRoi();
		       roi = getExecutedByProfile(rbi);
			   break;
			   
		case 2:rbi = new SbiBank();
//	           roi = rbi.getRoi();
		       roi = getExecutedByProfile(rbi);
			   break;
 
		case 3:rbi = new KotakBank();
//	       	   roi = rbi.getRoi();
		       roi = getExecutedByProfile(rbi);
			   break;
		
		case 4:rbi = new HdfcBank();
//	           roi = rbi.getRoi();
		       roi = getExecutedByProfile(rbi);
			   break;
			   
		}
		
		System.out.println("Interest rate: "+(roi)+"%");
		
	}
		
		

}
