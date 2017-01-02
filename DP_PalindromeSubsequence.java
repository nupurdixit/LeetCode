package LeetCode;

import java.util.HashMap;

public class DP_PalindromeSubsequence {
	static int len1=0;
	static int len2=0;
	static int iter=0;
	static HashMap<String,Integer> map=new HashMap<>();
	/* METHOD 1 : In this extra space for reverse string and 2D array has been used. Here we pass given string amd reversed string in the helper function
	 * 
	 */
	public static int palindromeReverse(String str){
		int m=0;
		int n=str.length();
		int[][] len=new int[str.length()+1][str.length()+1] ;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				len[i][j]=-1;
			}
		}
		char[] ch=str.toCharArray();
		String str2=reverse(ch);
		System.out.println("str2 is: "+str2);
		int l= helperReverse(str,0,str2,0,len);
		return l;
		
	}
	
	public static int helperReverse(String str,int i,String str2,int j,int[][] len){
		if(len[i][j]>=0){
			return len[i][j];
		}
		while(i>=0 && j>=0){
			if(str.charAt(i)==str2.charAt(j)){
				len[i][j]=1+helperReverse(str,i+1,str2,j+1,len);
				return len[i][j];
			}
			else{
				len[i][j]=Math.max(helperReverse(str,i+1,str2,j,len), helperReverse(str,i,str2,j+1,len));
				return len[i][j];
			}
		}
		return 0;
	}
	
	public static String reverse(char[] ch){
		
		
		int i=0;
		int j=ch.length-1;
		while(i<j){
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;	
			i++;
			j--;
		}
		return String.valueOf(ch);
	
	}
	/*
	 * METHOD 2
	 */
	public static int palindrome(String str){
		
		iter=0;
		len1=0;
		len2=0;
		map=new HashMap<>();
		return helper(str,0,str.length()-1);
	}
	
	public static int helper(String str,int i,int j){
			String key=i+":"+j;
			if(i>j){
				return 0;
			}
			iter++;
			if(!map.containsKey(key)){
				if(str.charAt(i)==str.charAt(j)){
						if(i!=j){			
								len1=2+helper(str,i+1,j-1);
								
						}
						else{
								len1=1+helper(str,i+1,j-1);		
						}
						map.put(key,len1);				
				}
				else{
		
						len2=Math.max(helper(str,i+1,j), helper(str,i,j-1));
						map.put(key,len2);
				}
								
			}
			return map.get(key);
		

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int len=palindrome("abcba");
			System.out.println("Len is: "+len+"\niter: "+iter);
		}
		{
			int len=palindrome("vbasnarnavvbarna");
			System.out.println("Len is: "+len+"\niter: "+iter);
		}
		{
			int len=palindrome("abc");
			System.out.println("Len is: "+len+"\niter: "+iter);
		}
		{
			int len=palindrome("vbasnarnavvbasnarnav");
			System.out.println("Len is: "+len+"\niter: "+iter);
		}
		{
			int len=palindrome("vbasnarnavvbasnarnavvbasnarnavvbasnarnav");
			System.out.println("Len is: "+len+"\niter: "+iter);
		}
		{
			int len=palindrome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			System.out.println("Len is: "+len+"\niter: "+iter);
		}
	}

}
