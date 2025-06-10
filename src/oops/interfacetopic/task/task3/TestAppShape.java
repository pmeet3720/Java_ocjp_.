package oops.interfacetopic.task.task3;

import java.util.Scanner;
public class TestAppShape {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1__Circle");
		System.out.println("2__Rectabgle");
		System.out.println("3__Triangle");
		System.out.println("4__Polygon");
		
		System.out.println("Enter choice: ");
		int choice = sc.nextInt();
		
		Shape s = null;
		
		switch (choice) {
		case 1: s = new Circle(4.5);
                s.draw();
		        s.calculateArea();
		        s.resize(3);
			    break;
			   
		case 2: s = new Rectangle(4,5);
                s.draw();
		        s.calculateArea();
		        s.resize(2);
		        break;
		   
		case 3: s = new Triangle(6,9);
                s.draw();
		        s.calculateArea();
		        s.resize(2);
		        break;
		   
		case 4: s = new Polygon(5,4,3.5);
                s.draw();
		        s.calculateArea();
		        s.resize(3);
		        break;

		}
		
	}

}
