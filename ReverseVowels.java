package LeetCode;

/*
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * Example 1:
 * Given s = "hello", return "holle".

 * Example 2:
 *Given s = "leetcode", return "leotcede".
 */


import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;

public class ReverseVowels {
	public static String reverseVowels(String str){
		//String[] strArray=str.split("");
		char[] strArray=str.toCharArray();
		String vowels="aeiouAEIOU";
		char[] charArray=vowels.toCharArray();
		HashMap<Character,Integer> map=new HashMap<>();
		for(char ch:charArray){
			map.put(ch,(map.get(ch)==null?1:map.get(ch)+1));
		}
		int i=0;
		int j=strArray.length-1;
		if(str==null || str.length()==0){
			return str;
		}
		
		//Process w/o usinh HashMap
		
		/*while(i<j){
			while(i<j && !vowels.contains(strArray[i])){ //use [StringName].contains(element) to find whether an array contains an element
				i++;
			}
			while(i<j && !vowels.contains(strArray[j])){
				j--;
			}
			
			swap(strArray,i,j);
			i++;
			j--;
			
		}*/
		
		//Process with HashMap
		
		while(i<j){
			while(i<j && !map.containsKey(strArray[i])){
				i++;
			}
			while(i<j && !map.containsKey(strArray[j])){
				j--;
			}
			swap(strArray,i,j);
			i++;
			j--;
		}
		
		return String.valueOf(strArray);  //to convert the charArray back to string
		//return String.join("",strArray) //to convert elements of String array back to string
		
	}
	
	public static void swap(char[] a,int x,int y){
		char temp=a[x];
		a[x]=a[y];
		a[y]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stu{
		{
		String str=reverseVowels("hello");
		System.out.println(str);
		}
		
		{
			String str1=reverseVowels("aA");
			System.out.println(str1);
		}
		
		{
			String str2=reverseVowels("leetcOde");
			System.out.println(str2);
		}
		{
			String str3=reverseVowels("");
			System.out.println("str3="+str3);
		}
	}

}
