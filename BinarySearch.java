package LeetCode;

import java.util.Stack;

public class BinarySearch {
	public static int binarySearch(int[] a,int num){
		int start=0;
		int end=a.length-1;
		
		while(start<=end){
			int mid=(end-start)/2+start;
			if(num==a[mid]){
				return mid;
			}
			if(num<a[mid]){
				end=mid-1;
			}
			else{
				start=mid+1;
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,20,34,47,68};
		int index=binarySearch(a,1);
		System.out.println(index);
	}

}
