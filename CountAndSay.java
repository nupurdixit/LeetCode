package LeetCode;

public class CountAndSay {

	public static String countAndSay(int n) {
	     
        int int1=1;
        if(n==1){
            return "1";
        }
        String str1=""+int1;
        
        String str=generateSeq(n-1,str1);
       
        return str;
    }
    public static String generateSeq(int n,String str){
    	
        int count=1;
        int len=str.length();
    		if(n==0){
    			
    			return str;
    		}
           
           while(n>0){
        	   str="";
               for(int i=0;i<len;i++){
                   if(i<len-1){
                	   if(str.charAt(i)==str.charAt(i+1)){
                		   count++;
                	   }
                	   else{
	                       str=str+count+str.charAt(i);
	                       count=1;
                	   }
                   }
               }
               
               //str=str+count+str.charAt(len-1);
              
               n--;
               System.out.println("str is: "+str);
               generateSeq(n,str);
           }
           return str;
    }   
    public static void main(String[] args){
    	String result=countAndSay(5);
    	System.out.println(result);
    }
}
