package basic;
import java.util.Scanner;
public class TestHotelMenuApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------Swagat Restaurant Menu----------");
		int choice,dish,totalAmt=0,qnty=0;
		boolean flag=true;
		while(flag) {
			System.out.println("1__Gujarati");
			System.out.println("2__Chinese");
			System.out.println("3__South Indian");
			System.out.println("4__exit");
			
			System.out.println("Enter cuisine choice: ");
			choice = sc.nextInt();
			flag = true;
			
			totalAmt=0;
			switch(choice) {
			case 1:
				System.out.println("1__Dhokla -- Rs.249");
				System.out.println("2__Khaman -- Rs.199");
				System.out.println("3__Phaphada Jalebi -- Rs.299");
				System.out.println("4__Moong Daal -- Rs.99");
				System.out.println("5__Sev Tomato Sabji -- Rs.199");
				System.out.println("6__Exit");
				
				while(flag) {
					qnty = 0;
					System.out.println("Enter dish choice: ");
					dish = sc.nextInt();
					switch(dish) {
					case 1:
						System.out.println("Enter dhokla quantity: ");
						qnty = sc.nextInt();
						totalAmt += (249*qnty);
						break;
					case 2:
						System.out.println("Enter Khaman quantity: ");
						qnty = sc.nextInt();
						totalAmt += (199*qnty);
						break;  
					case 3:
						System.out.println("Enter pJalebi quantity: ");
						qnty = sc.nextInt();
						totalAmt += (299*qnty);
						break;
					case 4:
						System.out.println("Enter Moong Daal quantity: ");
						qnty = sc.nextInt();
						totalAmt += (99*qnty);
						break;
					case 5:
						System.out.println("Enter Sev Tomato Sabji quantity: ");
						qnty = sc.nextInt();
						totalAmt += (199*qnty);
						break;
					case 6:
						flag=false;
						break;
					}
				}
				
			break;
				
			case 2:
				System.out.println("1__Manchurian -- Rs.259");
				System.out.println("2__Noodles -- Rs.345");
				System.out.println("3__Puff -- Rs.99");
				System.out.println("4__exit");
				flag=true;
				while(flag) {
					qnty = 0;
					System.out.println("Enter dish choice");
					dish = sc.nextInt();
					switch(dish) {
					case 1:
						System.out.println("Enter manchurian quantity: ");
						qnty = sc.nextInt();
						totalAmt += (259*qnty);
						break;
					
					case 2:
						System.out.println("Enter noodles quantity: ");
						qnty = sc.nextInt();
						totalAmt += (345*qnty);
						break;
					case 3:
						System.out.println("Enter puff quantity: ");
						qnty = sc.nextInt();
						totalAmt += (99*qnty);
						break;
					case 4:
						flag = false;
						break;
						
				   }
				
			   }
			break;
			case 3:
				System.out.println("1__Dosa -- Rs.349");
				System.out.println("2__Idli -- Rs.245");
				System.out.println("3__Mendu Vada -- Rs.199");
				System.out.println("4__exit");
				flag=true;
				while(flag) {
					qnty = 0;
					System.out.println("Enter dish choice");
					dish = sc.nextInt();
					switch(dish) {
					case 1:
						System.out.println("Enter Dosa quantity: ");
						qnty = sc.nextInt();
						totalAmt += (349*qnty);
						break;
					
					case 2:
						System.out.println("Enter Idli quantity: ");
						qnty = sc.nextInt();
						totalAmt += (245*qnty);
						break;
					case 3:
						System.out.println("Enter Mendu vada quantity: ");
						qnty = sc.nextInt();
						totalAmt += (199*qnty);
						break;
					case 4:
						flag = false;
						break;
						
				   }
				
			   }
			break;
			case 4:
				flag = false;
				break;
		}
	}
	System.out.println("Total Bill: Rs."+totalAmt);

}
}
