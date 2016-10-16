package LeetCode;

public class Capitalize {
	public static String capitalize(String str){
		String[] strArray=str.split("\\.");
		System.out.println("string array length is: "+strArray.length);
		for(int i=0;i<strArray.length;i++){
			strArray[i]=strArray[i].substring(0, 1).toUpperCase()+strArray[i].substring(1);
			
		}
		
		return String.join(".", strArray);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=capitalize("hi how are you.i am fine.");
		//String str=capitalize("a.b.c.d");
		System.out.println(str);
	}

}
