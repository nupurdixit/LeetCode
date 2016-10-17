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
					System.out.println(set.pollFirst());//pollFirs removes the lowest element ie. from start
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
