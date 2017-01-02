package LeetCode;

import java.util.HashMap;

public class PatternMatcher {
	static HashMap<String,Boolean> map=new HashMap<>(); //Part of DP method
	static int iter1=0;
	static int iter2=0;
	public static boolean patternMatcher(String s1,String s2){
		iter1=0;
		return helper(s1,0,s2,0);
	}
	
	public static boolean helper(String s1,int i,String s2,int j){
		
		if(i>=s1.length() && j>=s2.length()){
			return true;
		}
		if(i>=s1.length() || j>=s2.length()){
			return false;
		}
		iter1++;
		if(s1.charAt(i)==s2.charAt(j)){
				return helper(s1,i+1,s2,j+1);
		}
		else{
			if(s2.charAt(j)=='?'){
				return helper(s1,i+1,s2,j+1);
			}
		
			if(s2.charAt(j)=='*'){
				return helper(s1,i+1,s2,j)|| helper(s1,i,s2,j+1);
			}
		}
		return false;
	}
	
	/*
	 * Optimized method
	 */
	
	public static boolean DPpatternMatcher(String s1,String s2){
		iter2=0;
		map=new HashMap<>();
		return DPhelper(s1,0,s2,0);
	}
	
	public static boolean DPhelper(String s1,int i,String s2,int j){
		String key=i+":"+j;
		Boolean flag=false;
		if(i>=s1.length() && j>=s2.length()){
			return true;
		}
		if(i>=s1.length() || j>=s2.length()){
			return false;
		}
		iter2++;
		if(!map.containsKey(key)){
			if(s1.charAt(i)==s2.charAt(j)){
					flag= DPhelper(s1,i+1,s2,j+1);
					
			}
			else{
				if(s2.charAt(j)=='?'){
					flag= DPhelper(s1,i+1,s2,j+1);
					
				}
			
				if(s2.charAt(j)=='*'){
					flag= DPhelper(s1,i+1,s2,j)|| DPhelper(s1,i,s2,j+1);
				}
			}
			map.put(key, flag);
			return map.get(key);
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.out.println(patternMatcher("abc", "a?c"));
			System.out.println("iter1: "+iter1);
			System.out.println();
		}
		{
			System.out.println(patternMatcher("abcc", "a?c"));
			System.out.println("iter1: "+iter1);
			System.out.println();
		}
		{
			System.out.println(patternMatcher("abcc", "a*c"));
			System.out.println("iter1: "+iter1);
			System.out.println();
		}
		{
			System.out.println(patternMatcher("ac", "a*c"));
			System.out.println("iter1: "+iter1);
			System.out.println();
		}
		{
			System.out.println(patternMatcher("acd", "a*c"));
			System.out.println("iter1: "+iter1);
			System.out.println();
		}
		{
			System.out.println(patternMatcher("accdedd", "a?c*edd"));
			System.out.println("iter1: "+iter1);
			System.out.println();
		}
		{
			System.out.println(patternMatcher("accdedd", "a?c*d"));
			System.out.println("iter1: "+iter1);
			System.out.println();
		}
		{
			System.out.println(patternMatcher("accdeddaccded", "a*c*d*e*d*d*a*c*d"));
			System.out.println("iter1: "+iter1);
			System.out.println();
		}
		System.out.println("DP");
		{
			System.out.println(DPpatternMatcher("abc", "a?c"));
			System.out.println("iter2: "+iter2);
			System.out.println();
		}
		{
			System.out.println(DPpatternMatcher("abcc", "a?c"));
			System.out.println("iter2: "+iter2);
			System.out.println();
		}
		{
			System.out.println(DPpatternMatcher("abcc", "a*c"));
			System.out.println("iter2: "+iter2);
			System.out.println();
		}
		{
			System.out.println(DPpatternMatcher("ac", "a*c"));
			System.out.println("iter2: "+iter2);
			System.out.println();
		}
		{
			System.out.println(DPpatternMatcher("acd", "a*c"));
			System.out.println("iter2: "+iter2);
			System.out.println();
		}
		{
			System.out.println(DPpatternMatcher("accdedd", "a?c*edd"));
			System.out.println("iter2: "+iter2);
			System.out.println();
		}
		{
			System.out.println(DPpatternMatcher("accdedd", "a?c*d"));
			System.out.println("iter2: "+iter2);
			System.out.println();
		}
		{
			System.out.println(DPpatternMatcher("accdeddaccded", "a*c*d*e*d*d*a*c*d"));
			System.out.println("iter2: "+iter2);
			System.out.println();
		}
		
	}

}
