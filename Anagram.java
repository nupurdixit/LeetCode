package LeetCode;

import java.util.HashMap;

public class Anagram {
	public static boolean isAnagram(String s, String t) {
		if(s.length()!=t.length()){
	        return false;
	    }
	    
    HashMap<Character,Integer> hashMapS=new HashMap<>();
    //HashMap<Character,Integer> hashMapT=new HashMap<>();
    
    char[] chs=s.toCharArray();
    //char[] cht=t.toCharArray();
    
    for(char c:chs){
        hashMapS.put(c,hashMapS.get(c)==null?1:hashMapS.get(c)+1);
    }
    for(int i=0;i<t.length();i++){
        if(!hashMapS.containsKey(t.charAt(i))){
            return false;
        }
        else{
        	int num=hashMapS.get(t.charAt(i));
            hashMapS.put(t.charAt(i),num-1) ;
        }
    }
    
    for(Character c:hashMapS.keySet()){
        if(hashMapS.get(c)!=0){
            return false;
        }
    }
    
    return true;
    //for(char c:cht){
    //    hashMapT.put(c,hashMapT.get(c)==null?1:hashMapT.get(c)+1);
    //}
    
    
    // for(Character c:hashMapS.keySet() ){
    //     if(!hashMapT.containsKey(c) || (hashMapS.get(c)!=hashMapT.get(c))){
    //         return false;
    //     }
    // }
    // return true;
}
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.out.println(isAnagram("rat","tra"));
		}
		{
			System.out.println(isAnagram("rattt","traa"));
		}
		
	}

}
