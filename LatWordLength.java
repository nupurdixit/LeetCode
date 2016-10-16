package LeetCode;
/*
 * Length of Last Word
 * 
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.
 * 
 */
public class LatWordLength {
	public static int lastWordLength(String str){
		int len=0;
		int strlen=str.length();
		for(int i=strlen-1;i>=0;i--){
			if(str.charAt(i)==' '){
				if(len==0){
					continue;
				}
				else{
					break;
				}
			}
			else{
				len++;
			}
		}
		return len;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len=lastWordLength("hello baby");
		System.out.println("last word length is:"+len);
	}

}
