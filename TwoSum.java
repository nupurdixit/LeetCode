package LeetCode;
/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 *  
 */
import java.util.HashMap;
import java.util.TreeMap;

public class TwoSum {
	public static int[] twoSum(int[] nums,int target){
		int[] indices=new int[2];
		TreeMap<Integer,Integer> map=new TreeMap<>();
		for(int i=0;i<nums.length;i++){
			if(map.get(target-nums[i])!=null){
				indices[0]=map.get(target-nums[i]);
				indices[1]=i;
			}
			else{
				map.put(nums[i],i);
			}
		}
		return indices;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={7,7,2,4};
		int target=9;
		int[] result=twoSum(a,target);
		System.out.println("Indices with sum "+target+" are: "+result[0]+","+result[1]);
	}

}
