package LeetCode;

public class MoveZeroes {
	public static void moveZeroes(int[] nums) {
		int idx=-1;
        for(int i=0;i<nums.length;i++){
                
                if(nums[i]!=0 && idx!=i){
                	nums[++idx]=nums[i];
                }
        }
        for(int i=idx+1;i<nums.length;i++){
        	nums[i]=0;
        }
        
    }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={0,1,0,3,5,60,8,7,0,9,0,0,12};
		moveZeroes(a);
		for(int i:a){
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
