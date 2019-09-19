package _521_Longest_Uncommon_Subsequence_I;

public class Ac_code {
	
	 public int findLUSlength(String a, String b) {
	     if(a.equals(b)){
	    	 return -1;
	     }
	     if(a.length() > b.length()){
	    	 return a.length();
	     }else{
	    	 return b.length();
	     }
	    }
}
