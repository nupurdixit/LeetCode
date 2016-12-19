package LeetCode;
/*
 * Link: https://leetcode.com/problems/largest-number/
 * 
 * Description: Given a list of non negative integers, arrange them such that they form the largest number.

For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of an integer.
 */
import java.util.*;
public class LargestNumber {
	 public String largestNumber(int[] nums) {
	        if((nums.length ==0) || nums==null){
	            return "";
	        }
	        String[] str_arr=new String[nums.length];
	        for(int i=0;i<nums.length;i++){
	            str_arr[i]=String.valueOf(nums[i]);
	        }
	        Comparator<String> comp=new Comparator<String>(){
	            public int compare(String str1,String str2){
	                String s1=str1+str2;
	                String s2=str2+str1;
	                return s2.compareTo(s1);
	            }
	        };
	        Arrays.sort(str_arr,comp);
	        StringBuilder sb=new StringBuilder();
	        if(str_arr[0].charAt(0)=='0'){
	            return "0";
	        }
	        for(String s:str_arr){
	            sb.append(s);
	        }
	        return sb.toString();
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestNumber l=new LargestNumber();
		int[] arr={3,34,30,5,9};
		System.out.println(l.largestNumber(arr));
	}

}
