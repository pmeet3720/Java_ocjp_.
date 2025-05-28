package basic;

import java.util.Scanner;
public class TestSumOfDigitOfPrime {
	
	public static void main(String[] args) {
		int num,psum=0;
		boolean flag=true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		
		num = sc.nextInt();
		
//		while(num>0) {
//			flag=true;
//			int temp = num % 10;
//			for(int k=2;k<temp;k++) {
//				if(temp%k==0) {
//					flag=false;
//					break;
//				}
//			}
//			if(flag && temp!=1) {
//				psum += temp;
//			}
//			num /= 10;
//		}
		
//		method-2
		
		while(num>0) {
			int fc = 0;
			int temp = num % 10;
			
			for(int k=1;k<=temp;k++) {
				if(temp%k==0) {
					fc++;
				}
			}
			
			if(fc==2) {
				psum += temp;
			}
			
			num /= 10;
		}
		
		System.out.println("Sum of prime digits: "+psum);
		
	}

}
