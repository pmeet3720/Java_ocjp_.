package ProblemSolving;

import java.util.Scanner;
public class WeirdAlgorithm {
	
	public static void main(String[] args) {
		int n,od,ev;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		
		n = sc.nextInt();
		System.out.print(n+" ");
		
		while(n>0) {
			if(n%2==0) {
				n = n/2;
				System.out.print(n+" ");
			}else {
				n = n*3+1;
				System.out.print(n+" ");
			}
			if(n==1) {
//				System.out.println(n);
				break;
			}
		}
	}
}
