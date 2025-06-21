package stringproblems;

public class SubstringOfLengthK {
	
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // ArrayList<String> list = new ArrayList<String>();
        
        int l=0;
        int n = s.length();
        int count = n-k+1;
        String substr[] = new String[count];
        
        for(int i=0;i<=n-k;i++){
            substr[l++] = s.substring(i,i+k);
        }
        
        smallest = substr[0];
        largest = substr[0];
        
        for(String sub:substr){
            if(sub.compareTo(smallest)<0){
                smallest = sub;
            }else if(sub.compareTo(largest)>0){
                largest = sub;
            }
        }
        
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

}
