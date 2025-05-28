package basic;

import java.util.Scanner;
public class TestMaxNumApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------Maximum of three numbers---------");
		
		int no1,no2,no3,max=9999;
		boolean flag = true;
		System.out.println("Enter no1: ");
		no1 = sc.nextInt();
		System.out.println("Enter no2: ");
		no2 = sc.nextInt();
		System.out.println("Enter no3: ");
		no3 = sc.nextInt();
		
		if(no1>no2) {
			if(no1>no3) {
				max = no1;
			}else if(no1 == no3) {
				System.out.println(no1+" and "+no3+" are equal and greater than "+no2);
			}
			else {
				max = no3;
			}
		}else if(no1 == no2 && no2>no3){
			System.out.println( + no1 + " and " + no2 + " are equal and greater than " + no3);
			
		}else if(no2>no3) {
			max = no2;
		}
		
		else if(no1 == no2 && no2 == no3) {
			System.out.println("Three numbers are equal");
			flag=false;
		}else {
			max = no3;
		}
		
		if(flag) {
			System.out.println("Maximum of three: " + max);
		}
	}

}
