package basic;

public class SumOfMiddleDigits {
	
	public static void main(String[] args) {
		int digit;
		System.out.println("enter digit: ");
		
		digit = new java.util.Scanner(System.in).nextInt();
		
		int i=0,cnt=0,temp=0,sum=0;
		int n = digit;
		String d = String.valueOf(n);
		while(n>0) {
			cnt++;
			if(cnt==1 && cnt == d.length()) {
				temp = n % 10;
			}else if(cnt > 1 && cnt < d.length()) {
				temp = n % 10;
				sum = sum + temp;
			}
			n /= 10;
		}
		
		System.out.println("sum of middle digits: "+sum);
		
		
	}

}
