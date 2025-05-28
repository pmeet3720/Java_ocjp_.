package basic;

import java.util.Scanner;
public class TestArraySorting {
	
	public static void main(String[] args) {
		System.out.println("----------Array Sorting--------- ");
		Scanner sc = new Scanner(System.in);
		int []a = new int[6];
		int temp = 0;
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter a["+i+"]");
			a[i] = sc.nextInt();
		}
		
		System.out.println("-----Unsorted array----");
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		System.out.println("-----Sorted array-----");
		
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
	}

}
