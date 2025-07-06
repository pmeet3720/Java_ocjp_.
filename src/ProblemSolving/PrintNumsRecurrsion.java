package ProblemSolving;

public class PrintNumsRecurrsion {
	
	public static void printNumbers(int n) {
		System.out.println(n);
		if(n>1) {
			printNumbers(n-1);
		}
//		System.out.println(n);
	}
	
	public static void main(String[] args) {
		PrintNumsRecurrsion.printNumbers(5);
	}

}
