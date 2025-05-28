package basic;
import java.util.Scanner;

public class TestScanArrayAndSum {
	
	public static void main(String[] args) {
		int []a = new int[5];
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lenght of array: "+a.length);
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter a["+i+"]");
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("a["+i+"]: "+a[i]);
			sum += a[i];
		}
		
		System.out.println("Sum of array: "+sum);
		
		
	}

}
