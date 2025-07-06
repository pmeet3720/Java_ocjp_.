package ProblemSolving;

public class ReverseArrayRecurr {
	int i=0;
	int revArr[] = {};
	public void reverseArray(int[] arr, int n) {
		if(i != arr.length) {
			revArr[i] = arr[n-i-1];
			reverseArray(arr,n-1);
		}
		
	}

}
