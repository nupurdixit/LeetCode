package LeetCode;

/*Third Maximum Number:Given an array of integers, return the 3rd Maximum Number in this array, 
if it doesn't exist, return the Maximum Number. The time complexity must be O(n) or less.

//COMPLEXITY: n*(3*log(3)) ==O(n)
 * 
 */
import java.util.TreeSet;

public class ThirdLargest {
	public static int thirdLargest(int[] nums){
		TreeSet<Integer> set=new TreeSet<>(); //Tree contains by default sorted list , and set contains distinct numbers
		for(int i:nums){
			if(!set.contains(i)){
				set.add(i);
				while(set.size()>3){
					System.out.println(set.pollFirst());//pollFirst removes the lowest element ie. from start
				}
			}
		}
		return set.size()>2?set.pollFirst():set.pollLast();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={5,3,2,1,6,7,7};
		int thirdLargest=thirdLargest(nums);
		System.out.println("thirdLargest number is: "+thirdLargest);
	}

}
/* Another method to find the third largest number in an array however the time complexity is O(nlogn)
 * 
 * public class Solution implements Comparator<Integer>{
    public int thirdMax(int[] nums) {
        Solution sol=new Solution();
        Set<Integer> set=new HashSet<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(1,sol);
        for(int i:nums){
            set.add(i);
        }
        for(Integer i:set){
            pq.add(i);
        }
        System.out.println(pq);
        if(pq.size()>=3){
            pq.poll();
            pq.poll();
            return pq.poll();
        }
        else if(set.isEmpty()){
            return Integer.MIN_VALUE;
        }
        else{
            return pq.poll();
        }
    }
     public int compare(Integer i1,Integer i2){
            return (i2>i1?1:((i1>i2)?-1:0));
        }
}*/
