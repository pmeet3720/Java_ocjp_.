package basic;

import java.util.Scanner;
public class TestCountPrimeInArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter a["+i+"]: ");
			a[i] = sc.nextInt();
		}
		
		boolean flag = true;
		int pcnt = 0,cnt=0;
		
		for(int temp:a) {
			for(int j=2;j<=temp/2;j++) {
				if(temp%j==0) {
					flag = false;
					cnt++;
					break;
				}
			}
			if(flag && temp!=1) {
				System.out.println("Prime: "+temp);
				pcnt++;
			}else if(temp==1) {
				cnt++;
			}
			flag = true;
		}
		System.out.println("Non prime count: "+cnt);
		System.out.println("Prime count: "+pcnt);
	}

}
