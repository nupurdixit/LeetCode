package LeetCode;
/*
 * ROMAN TO INTEGER conversion
 * 
 */
import java.util.HashMap;

public class RomanToInteger {
	public static int romanToInt(String s){
		if(s==null){
			return 0;
		}
		HashMap<Character,Integer> map=new HashMap<>();
		map.put('I', 1);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int sum=0;
		int prev=-1;
		for(int i=s.length()-1;i>=0;i--){ //Traverse from right to left
			int value=map.get(s.charAt(i));
			if(value<prev){
				sum=sum-value;
			}
			else{
				sum=sum+value;
			}
			prev=value;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int a=romanToInt("DMM");
			System.out.println("DMM in int form is: "+a);
		}
		{
			int a=romanToInt("MMD");
			System.out.println("MDD in int form is: "+a);
		}
	}

}
