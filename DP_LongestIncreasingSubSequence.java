package LeetCode;

import java.util.Arrays;

public class DP_LongestIncreasingSubSequence {
	public static int lengthOfLIS(int[] nums) {
        int[] arr=new int[nums.length];
        int len=0;
        for(int num:nums){
            int i=Arrays.binarySearch(arr,0,len,num);
            System.out.println("i is: "+i);
            if(i<0){
                i=-(i+1);
            }
            arr[i]=num;
            if(i==len){
                len++;
                System.out.println("length in this iteration is: "+len);
            }
        }
        System.out.println("elements in dp are: ");
        for(int i=0;i<len;i++){
        	System.out.print(arr[i]+" ");
        }
        System.out.println();
        return len;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2, 4, 6, 1, 9, 4, 10, 100, 11, 2, 6, 18, 13, 15, 12};
		//int [] arr={4,6,5,8};
		System.out.println(lengthOfLIS(arr));
	}

}
