package LeetCode;
/*
 * Find All Duplicates in an Array
 * 
 * Given an array of integers, 1 <= a[i] <= n (n = size of array), some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?

Example:
Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]
 */
import java.util.ArrayList;
import java.util.List;

public class DuplicatesInArray {
	
	public static List<Integer> findDuplicates(int[] nums){
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<nums.length;i++){
			int index=Math.abs(nums[i])-1;
			if(nums[index]<0){
				list.add(Math.abs(index+1));
			}
			nums[index]=-nums[index];
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		int[] a={2,3,4,5,4,5};
		list=findDuplicates(a);
		System.out.print("[");
		for(int i:list){
			System.out.print(i+" ");
		}
		System.out.println("]");
	}

}
