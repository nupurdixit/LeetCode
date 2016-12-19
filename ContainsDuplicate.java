package LeetCode;
/*Link: https://leetcode.com/problems/contains-duplicate-iii/ */

/*Given an array of integers, find out whether there are two distinct indices i and j in the array such that the difference
 *  between nums[i] and nums[j] is at most t and the difference between i and j is at most k.
 */
/*explanation: // For example, array = [3,4,5,6,7,8], the bucket size t == 3
the bucket 0------------null (no number)
the bucket 1------------{3,4,5}
the bucket 2------------{6,7,8}

See, 5 and 6 located adjacent bucket, but the difference between is 6-5==1, still less than 3, that's why need
 "num - map.get(bucket - 1) <= t", it should compare the adjacent bucket.

Actually, the bucket 1 and 2 only contains one element, like this,

bucket 0-------null
bucket 1------5
bucket 2------8

because map.put(bucket, num); put(1, 3) put (1, 4) put(1,5) all operator is the same key 1, so the last operator will replace the precise value.

and that why when the map.containsKey(bucket), it can return true directly.

Lastly, everything is based on the following logical,
if (map.entrySet().size() >= k) {
long lastBucket = ((long) nums[i - k] - Integer.MIN_VALUE) / ((long) t + 1);
map.remove(lastBucket);
}
For example, array[1,3,1], k = 1, t = 1
the first 1 and third 1 in the array, the difference between them are 1-1==0 < t = 1, 
but the index different is 2-0 = 2 > k = 1, so it remove the first 1. We need check the size of the map (also expressed 
by the number count of the bucket) is less than k, if is great and equal than k, we should remove the relative bucket which 
is the last bucket that i can reach */
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        Map<Long,Long> map=new HashMap<>();
        if(k<1 || t<0){
            return false;
        }
        for(int i=0;i<nums.length;i++){
        	long num=(long)nums[i]-Integer.MIN_VALUE;
            long bucket=num/((long)t+1);
            if((map.containsKey(bucket)) ||
                (map.containsKey(bucket-1) && num-map.get(bucket-1)<=t) ||
                (map.containsKey(bucket+1) && map.get(bucket+1)-num <=t)){
                    return true;
            }
            if(map.entrySet().size()>=k){
                long lastBucket=((long)nums[i-k]-Integer.MIN_VALUE)/((long)t+1);
                map.remove(lastBucket);
            }
            map.put(bucket,num);
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainsDuplicate cd=new ContainsDuplicate();
		int[] arr={1,2,23,34,56};
		System.out.println(cd.containsNearbyAlmostDuplicate(arr,2,2));
	}

}
