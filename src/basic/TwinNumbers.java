package basic; 

public class TwinNumbers {
	
	public static void main(String[] args) {
		int num;
		
		System.out.println("enter digit: ");
		
		num = new java.util.Scanner(System.in).nextInt();
		
		int sum=0,mul=1;
		int n = num;
		while(n>0) {
			int tmp = n%10;
			sum = sum + tmp;
			mul = mul * tmp;
			n /= 10;
		}
		
		if(sum == mul) {
			System.out.println("number is twin");
		}else {
			System.out.println("number is not twin");
		}
	}

}
