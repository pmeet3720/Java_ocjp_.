package basic;

import java.util.Scanner;
public class TestForEachLoop {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []a = new int[5];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter a["+i+"]");
			a[i] = sc.nextInt();
		}
		
//		forEach__loop   EnchancedFor___loop    AdvancedFor___loop
		
		for(int temp:a) {
			System.out.println(temp);
		}
	}

}
