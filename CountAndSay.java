package LeetCode;
/*
 * The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class CountAndSay {

	public static List<String> countAndSay(int n) {
		List<String> list=new ArrayList<>(); //Instead of returning a single string , I have returned
											//a list of strings till the desired sequence given by 'n'
	   if(n==0){
		   return list;
	   }
	   String cur="1";
	   if(n==1){
		   list.add(cur);
		   return list;
	   }
	   while(n-- >1){
		   int count=1;
		   StringBuilder sb=new StringBuilder();
		   char curChar=cur.charAt(0);
		   for(int i=1;i<cur.length();i++){
			   if(cur.charAt(i)==curChar){
				   count++;
			   }
			   else{
				   sb.append(count).append(curChar);
				   count=1;
				   curChar=cur.charAt(i);
				   
			   }
			 
		   }
		   sb.append(count).append(curChar);
		   cur=sb.toString();
		   list.add(cur);
	   }
	   return list;
    }   
    public static void main(String[] args){
    	List<String> list=countAndSay(5);
    	for(String s:list){
    		System.out.println(s);
    	}
    }
}