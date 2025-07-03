package stringproblems;

public class SubSequenceOfSameChar {
	
	public static void main(String[] args) {
		String str = "wwwbbbw";
		//output -- 3w3b1w
		StringBuilder result = new StringBuilder();
		int cnt = 1, n = str.length();
		
		for(int i=1;i<n;i++) {
			if(str.charAt(i) == str.charAt(i-1)) {
				cnt++;
			}else {
				result.append(cnt).append(str.charAt(i-1));
				cnt = 1;
			}
		}
		
		result.append(cnt).append(str.charAt(n-1));
		
		System.out.println(result);
	}

}
