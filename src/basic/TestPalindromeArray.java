package basic;

import java.util.Scanner;
public class TestPalindromeArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter a["+i+"]: ");
			a[i] = sc.nextInt();
		}
		
		int pal = 0,rev=0,orig;
		boolean flag = false;
		
		for(int num:a) {
			flag = false;
			orig = num;
			rev = 0;
			while(num>0) {
				int r = num % 10;
				rev = (rev*10) + r;
				num /= 10;
			}
			if(rev == orig) {
				pal++;
				flag = true;
			}else if(!flag) {
				System.out.println("Non palindrome: "+orig);
			}
		}
		System.out.println("palindrome count: "+pal);
		
	}

}
