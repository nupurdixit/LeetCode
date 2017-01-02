package LeetCode;

import java.util.HashMap;

public class DP_IntegerSumContiguous {
	static HashMap<String,Boolean> map=new HashMap<>();
	/* Here the sum of contiguous elements in the array is calculated(starting from first element i.e. arr[0]+arr[1]+...) and matched with the passed key. 
	 * If it matches then return true else start the summation from the second element(arr[1]+arr[2]+....)
	 * 
	 * 
	 public static boolean integerSumContiguous(int[] arr,int key){
		boolean flag=helper(arr,0,key);
		return flag;
	}
	
	public static boolean helper(int[] arr,int index,int key){
			int sum=0;
			int k=index;
			while(k<arr.length){
				sum+=arr[k];
				if(sum==key){
					return true;
				}
				k++;
			}
			index++;
			if(index<arr.length){
				return helper(arr,index,key);
			}
			else{
				return false;
			}
			
	}*/
	
	
	/*
	 * Here in the main function a loop iterates over the array and helper function is called to check if the residual(key - arr[index]) matches 
	 * current element. If yes, then return true
	 */
	public static boolean integerSumContiguous(int[] arr,int res){
		int index=0;
		while(index < arr.length){
			if(helper(arr,index,res)){
				return true;
			}
			index++;
		}
		return false;
	
	}
	
	public static boolean helper(int[] arr,int index,int res){
			if(index>=arr.length){
				return false;
			}
			if(arr[index]==res){
				return true;
			}
			
			return helper(arr,index+1,res-arr[index]);
			
	}
	
	/*
	 * This method would tell if the sum matches with elements not contiguously located in the area e.g . 28 returns true because of 10,8 and 9
	 */
	public static boolean integerSumNONContiguous(int[] arr,int res){
			return helper1(arr,0,res);
	
	}
	
	public static boolean helper1(int[] arr,int index,int res){
			
			String key1=index+":"+res;
			
			if(index>=arr.length){
				return false;
			}
			if(arr[index]==res){
				return true;
			}
			
			
			if(!map.containsKey(key1)){
				boolean result=helper1(arr,index+1,res-arr[index]) || helper1(arr,index+1,res);
				map.put(key1,result);
			}
			
			return (map.get(key1));
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int[] arr={10,3,8,11,9};
			System.out.println("integerContiguous");
			System.out.println(integerSumContiguous(arr,27));
			System.out.println(integerSumContiguous(arr,5));
			System.out.println(integerSumContiguous(arr,20));
			System.out.println(integerSumContiguous(arr,28));
			System.out.println(integerSumContiguous(arr,21));
			System.out.println(integerSumContiguous(arr,23));
			
			
		}
		{
			System.out.println("Negatives");
			int[] arr={-20,10,-3,-8,-11,-9};
			System.out.println(integerSumContiguous(arr,-10));
			
		}
		{
			int[] arr={10,3,8,11,9,10,3,8,11,9,10,3,8,11,9,10,3,8,11,9,10,3,8,11,9,10,3,8,11,9};
			System.out.println("integerSumNONContiguous");
			System.out.println(integerSumNONContiguous(arr,27));
			System.out.println(integerSumNONContiguous(arr,5));
			System.out.println(integerSumNONContiguous(arr,20));
			System.out.println(integerSumNONContiguous(arr,28));
			System.out.println(integerSumNONContiguous(arr,21));
			System.out.println(integerSumNONContiguous(arr,23));
			
		}
	}

}
