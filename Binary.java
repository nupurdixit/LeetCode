package LeetCode;

/*
* Add Binary  
Given two binary strings, return their sum (also a binary string).
For example,
a = "11"
b = "1"
Return "100".
* 
*/

public class Binary {
	public static String addBinary(String a, String b) {
//        BigInteger b1=new BigInteger(a,2);
//        BigInteger b2=new BigInteger(b,2);
//        BigInteger b3=b1.add(b2);
//        System.out.println(b3.toString(2));
		StringBuilder sb=new StringBuilder();
        int first=a.length()-1;
        int second=b.length()-1;
//        if(a==null || b==null){
//            return "";
//        }
        if(a==""){
        	return b;
        }
        
        if(b==""){
        	return a;
        }
        int carry=0;
        while(first>=0 || second>=0){
            int sum=carry;
            if(first>=0){
                sum+=a.charAt(first)-'0';
                first--;
            }
            if(second>=0){
                sum+=b.charAt(second)-'0';
                second--;
            }
            carry=sum>>1;
            sum=sum & 1;
            sb.append(sum==0?'0':'1');
        }
        if(carry>0){
            sb.append('1');
        }
        sb.reverse();
        return String.valueOf(sb);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result=addBinary("11","");
		System.out.println("Result is: "+result);
	}

}
