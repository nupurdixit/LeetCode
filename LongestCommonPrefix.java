package LeetCode;
/*
 * 
 * Longest Common Prefix   QuestionEditorial Solution  My Submissions
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 
 */
import java.util.Arrays;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs){
		Arrays.sort(strs);
		String first=strs[0];
		String last=strs[strs.length-1];
		int len=Math.min(first.length(), last.length());
		for(int i=0;i<len;i++){
			if(first.charAt(i)!=last.charAt(i)){
				return first.substring(0,i);
			}
		}
		return first;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a={"abcdef","abcabc","abcbc","abc"};
		String longestPrefix=longestCommonPrefix(a);
		System.out.println("Longest Common Prefix is: "+longestPrefix);
	}

}
