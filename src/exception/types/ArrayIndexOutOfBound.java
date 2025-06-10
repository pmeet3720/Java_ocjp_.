package exception.types;

public class ArrayIndexOutOfBound {
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		//since value are accessible at index (0,1,2,3,4), at 5 it will throw arrayIndexOutOfBound
		try 
		{
			System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e.getMessage());
		}
		
	}

}
