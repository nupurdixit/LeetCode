package LeetCode;
//Link: https://leetcode.com/problems/sort-colors/
/*
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the
 *  colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 */
public class SortColors {
	public void sortColors(int[] nums){
		int start=0;
		int end=nums.length-1;
		for(int i=start;i<=end;){
			if(nums[i]==0){
				swap(nums,i,start);
				i++;
				start++;
			}
			else if(nums[i]==2){
				swap(nums,i,end);
				end--;
			}
			else{
				i++;
			}
		}
	}
	public void swap(int[] nums,int x,int y){
		int temp=nums[x];
		nums[x]=nums[y];
		nums[y]=temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortColors s=new SortColors();
		int[] nums={1,2,0,2,1,0,1,2};
		s.sortColors(nums);
		for(int i:nums){
			System.out.print(i+" ");
		}
	}

}
