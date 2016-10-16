package LeetCode;

/* VALID PALINDROME
 * 
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.
 * 
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.xml.internal.ws.util.StringUtils;

public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        if(s==null || s.length()==0){
            return true;
        }
      String pattern="[a-zA-Z0-9_]$"; //regex pattern for alphanumeric characters
      // String pattern="^(?:\\W|\\s)$";  ///regex pattern which contains no 
        String[] str=s.split("");
        Pattern p=Pattern.compile(pattern);
        
        int i=0;
        int j=s.length()-1;
        while(i<j){
        	while(i<j && (!p.matcher(str[i]).find())){
        		i++;
        		continue;
        	}
        	while(i<j && (!p.matcher(str[j]).find())){
        		j--;
        		continue;
        	}
            if(!str[i].equalsIgnoreCase(str[j])){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
    	{
    	boolean result=isPalindrome("A man, a plan, a canal: Panama");
    	System.out.println("result= "+result);
    	}
    	{
    		boolean result=isPalindrome("race a car");
    		System.out.println("result= "+result);
    		
    	}
    	
    }
    	
}