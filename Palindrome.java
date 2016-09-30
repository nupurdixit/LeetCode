package LeetCode;

public class Palindrome {
	public static boolean isPalindrome(int num){
		/*with extra space of string
		
		String str=""+num;
		int i=0;
		int j=str.length()-1;
		while(i<j){
			if(str.charAt(i)==str.charAt(j)){
				i++;
				j--;
			}
			else{
				return false;
			}
		}
		return true;
		*/
		
		/*without extra space */
		if(num<0){
			return false;
		}
		 int q=0;
		 int p=num;
		 while(p>=10){
			 q*=10;
			 q+=p%10;
			 p/=10;
		 }
		 //q finds the number from the back (except the end digit)and num/10 gets the number from the front(except the last digit)
		 //which is then matched for the palindrome criteria.e.g.n 1221 , q gets 122 from back and num/10 gets 122 frm front which matches.
		 //p gets the last digit which is matched with num%10
		 return (q == num/10 && p == num%10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12451;
		System.out.println(isPalindrome(num));
	}

}
