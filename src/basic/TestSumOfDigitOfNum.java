package basic;

import java.util.Scanner;
public class TestSumOfDigitOfNum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num,sum=0;
		System.out.println("Enter number: ");
		num = sc.nextInt();
		
		while(num>0) {
			int temp = num % 10;
			sum += temp;
			num /= 10;
		}
		System.out.println("The sum of digit: "+sum);
	}

}
