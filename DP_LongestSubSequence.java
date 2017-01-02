package LeetCode;

public class DP_LongestSubSequence {
	static int iter1=0;
	static int iter=0;
	
	public static double timeInSec(long endTime, long startTime) {
		long duration = (endTime - startTime);
		if (duration > 0) {
			double dm = (duration / 1000000.0); // Milliseconds
			double d = dm / 1000.0; // seconds

			return d;
		}
		return 0.0;
	}
	public static int LCS(String s1,String s2){
		int m=s1.length();
		int n=s2.length();
		int LCS[][] = new int[m+1][n+1];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				LCS[i][j]=-1;
			}
		}
		for(int i=0;i<=m;i++){
			LCS[i][n]=0;
		}
		for(int j=0;j<=n;j++){
			LCS[m][j]=0;
		}
		int len=helper(s1,0,s2,0,LCS);
		System.out.println("Iterations in recursion are: "+iter1);
		return len;
	}
	public static int helper(String s1,int i,String s2,int j,int [][] LCS){
		if(LCS[i][j]>=0){
			return LCS[i][j];
		}
		while(i>=0 && j>=0){
			iter1++;
			if(s1.charAt(i)==s2.charAt(j)){
				LCS[i][j]=1+helper(s1,i+1,s2,j+1,LCS);
				return LCS[i][j];
			}
			else{
				LCS[i][j]= Math.max(helper(s1,i+1,s2,j,LCS), helper(s1,i,s2,j+1,LCS));
				return LCS[i][j];
			}
		}
		
		return 0;
	}
	
	
	public static int DP_LCS(String s1,String s2){
		int m=s1.length();
		int n=s2.length();
		int [][] LCS=new int[m+1][n+1];
		
		/*for(int i=0;i<=m;i++){
			LCS[i][n]=0;
		}
		for(int j=0;j<=n;j++){
			LCS[m][j]=0;
		}*/
		System.out.println(LCS[m][n]);
		
		for(int i=m-1;i>=0;i--){
			for(int j=n-1;j>=0;j--){
				iter++;
				LCS[i][j]=LCS[i+1][j+1];
				
				if(s1.charAt(i)==s2.charAt(j)){
					LCS[i][j]++;
				}
				
				if(LCS[i][j]<LCS[i+1][j]){
					LCS[i][j]=LCS[i+1][j];
				}
				if(LCS[i][j]<LCS[i][j+1]){
					LCS[i][j]=LCS[i][j+1];
				}
			}
		}
		System.out.println("Iterations in DP are : "+iter);
		return LCS[0][0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.nanoTime();
		System.out.println(LCS("vbasnarnav","vanransabv"));
		long endTime=System.nanoTime();
		double duration=timeInSec(endTime,startTime);
		System.out.println("Timr taken is: "+duration);
		long startTime1=System.nanoTime();
		System.out.println(DP_LCS("vbasnarnav","vanransabv"));
		long endTime1=System.nanoTime();
		double duration1=timeInSec(endTime1,startTime1);
		System.out.println("Timr taken is: "+duration1);
	}

}
