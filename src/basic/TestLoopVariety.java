package basic;

public class TestLoopVariety {
	
	public static void main(String[] args) {
		int i=1;
		
//		for(; i<=0 ;);
//		{
//			System.out.println(i++);
//		}
//		System.out.println(i);
		
		do {
			System.out.println("I: "+i);
			i++;
		}while(i<=5);
	}

}
