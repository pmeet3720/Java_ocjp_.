package basic;

import java.util.Scanner;
public class TestSearchArrayElement {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []a = new int[5];
		int key;
		boolean flag = false;
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter a["+i+"]");
			a[i] = sc.nextInt();
		}
		System.out.println("Enter search value: ");
		key = sc.nextInt();		
		for(int i=0;i<a.length;i++) {
			if(a[i] == key) {
				flag = true;
				System.out.println("a["+i+"]: "+a[i]);
			}
		}
		if(!flag) {
			System.out.println(key+"Element not found in array");
		}
	}

}
