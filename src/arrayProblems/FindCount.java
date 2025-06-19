package arrayProblems;

public class FindCount {
	
	public static int findCount(int[] arr, int length, int num, int diff) {
		int cnt=0;
		
		for(int ele:arr) {
			int absDiff = num - ele;
			absDiff = Math.abs(absDiff);
			if(absDiff <= diff) {
				cnt++;
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {12,3,14,56,77,13};
		int num = 13;
		int diff = 2;
		
		int cnt = findCount(arr,arr.length,num,diff);
		
		System.out.println("Count of nums: "+cnt);
		
	}

}
