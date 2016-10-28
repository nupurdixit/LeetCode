package LeetCode;
/*
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class Zigzag {
	public static String zigzag(String s,int numOfRows){
		List<List<Character>> list=new ArrayList<>();
		//List<Character> innerList=new ArrayList<>();
		String res="";
		if(s.length()==0){
			return "";
		}
		if(numOfRows<2){
			return s;
		}
		int i=0;
		int k=0;
		while(k<s.length()){
			while(i<numOfRows && k<s.length()){
				if(list.size()==i){
					list.add(new ArrayList<Character>());
				}
				list.get(i).add(s.charAt(k));
				i++;
				k++;
			}
			i=i-2;
			while(i>=0 && k<s.length()){
				if(list.size()==i){
					list.add(new ArrayList<Character>());
				}
				list.get(i).add(s.charAt(k));
				i--;
				k++;
			}
			i=i+2;
		}
		
		for(List<Character> l:list){
			for(Character ch:l){
				res+=ch;
			}
		}
		
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=zigzag("howareyou",3);
		System.out.println("zigzag string is :"+str);
	}

}
