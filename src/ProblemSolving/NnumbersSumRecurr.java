package ProblemSolving;

public class NnumbersSumRecurr {
	static int sum = 0;
	
	public static int numbersSum(int n) {
		if(n>=1) {
			sum += n;
			numbersSum(n-1);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int sum = NnumbersSumRecurr.numbersSum(4);
		System.out.println("Sum: "+sum);
	}

}
