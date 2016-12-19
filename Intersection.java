package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
	public int[] intersection(int[] nums1,int[] nums2){
		Set<Integer> set=new HashSet<>();
		Set<Integer> intersect=new HashSet<>();
		for(int i:nums1){
			set.add(i);
		}
		for(int j:nums2){
			if(set.contains(j)){
				intersect.add(j);
			}
		}
		int[] result=new int[intersect.size()];
		int i=0;
		for(Integer k:intersect){
			result[i++]=k;
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intersection inter=new Intersection();
		int[] nums1={1,3,1,2,2};
		int[] nums2={2,3,2};
		int[] result=inter.intersection(nums1,nums2);
		for(int i:result){
			System.out.println(i+" ");
		}
		
	}

}
