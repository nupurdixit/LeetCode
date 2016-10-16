package LeetCode;
/*
 * Compare Version Numbers
 * 
 * Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
 */
public class CompareVersions {
	public static int compareVersion(String version1, String version2) {
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");
        //System.out.println("v1.length is: "+v1.length);
        int length=Math.max(v1.length, v2.length);
        for(int i=0;i<length;i++){
        	Integer i1=(i<v1.length?Integer.parseInt(v1[i]):0);
        	Integer i2=(i<v2.length?Integer.parseInt(v2[i]):0);
        	int compare=i1.compareTo(i2);
        	if(compare!=0){
        		return compare;
        	}
        }
        return 0;
       
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=compareVersion("0.9999999999","1");
		System.out.println(result);
	}

}
