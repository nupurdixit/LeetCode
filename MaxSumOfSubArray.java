package LeetCode;
/*
 * To find the Maximum sum of the subarray within a given array e.g. {{1,1,1},{2,2,2},{3,10,3},{4,4,4}} returns
 * the maximum sum as 16 since max(3,6,16,12)= 16
 */
public class MaxSumOfSubArray {
	public static int maxSum(int[][] a){
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=0;
			for(int j=0;j<a[i].length;j++){
				sum+=a[i][j];
				if(sum>max){
					max=sum;
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a={{1,1,1},{2,2,2},{3,10,3},{4,4,4}};
		int max=maxSum(a);
		System.out.println("max sum is: "+max);
	}

}
