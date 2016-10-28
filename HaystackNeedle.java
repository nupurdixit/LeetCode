package LeetCode;
/*
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class HaystackNeedle {
	public static int strStr(String haystack, String needle) {
		int l1=haystack.length();
		int l2=needle.length();
		if(l1<l2){
			return -1;
		}
		if(l2==0){
			return 0;
		}
		int diff=l1-l2;
		for(int i=0;i<=diff;i++){
			if(haystack.substring(i, i+l2).equals(needle)){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index=strStr("parrot"," ");
		System.out.println("index is: "+index);
	}

}
