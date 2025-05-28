package ProblemSolving;

import java.util.Scanner;
public class MissingNumber {
	
	public static void main(String[] args) {
		int mis=0,c=0;
		long n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextLong();
		long a[] = new long[(int) (n-1)];
		for(int i=0;i<n-1;i++) {
			a[i] = sc.nextLong();
		}
		int i;
		for(int j=1;j<=n;j++) {
			c=0;
			i=0;
			while(i<n-1) {
				if(j==a[i]) {
					c++;
					break;
				}
				i++;
			}
			if(c==0) {
				mis=j;
			}
		}
		System.out.print(mis);
	}

}
