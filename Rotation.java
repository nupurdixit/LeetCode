package LeetCode;
//https://leetcode.com/problems/rotate-function/

public class Rotation{
//	static PriorityQueue<Integer> pq=new PriorityQueue<Integer>(10,new Comparator<Integer>(){
//																public int compare(Integer o1,Integer o2){
//																return o2-o1;
//																}});
	static int sum=Integer.MIN_VALUE;
	static int max=Integer.MIN_VALUE;
	public static int findMax(int[] a){
		max=sum;
		for(int i=0;i<a.length;i++){
			sum=calculateSum(i,a);
			if(sum>max){
				max=sum;
			}
		}
		System.out.println("max is: "+max);	
		return max;
		
	}
	public static int calculateSum(int i,int[] a){
		int sum=0;
		for(int j=0;j<a.length;j++){
			sum+=(i*a[j]);
			i++;
			if(i==a.length){
				i=0;
			}
			
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={-2147483648,-2147483648};
		findMax(a);
	}
}


