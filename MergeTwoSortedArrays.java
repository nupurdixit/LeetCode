package LeetCode;

public class MergeTwoSortedArrays {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){
            return;
        }
        
        int[] t=new int[m+n];
       
        int i=0;
        int j=0;
        int k=0;
        
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                t[k++]=nums1[i++];
            }
            else{
                t[k++]=nums2[j++];
            }
        }
        
        while(i<m){
            t[k++]=nums1[i++];
        }
        
        while(j<n){
            t[k++]=nums2[j++];
        }
        
        for(int f=0;f<k;f++){
            nums1[f]=t[f];
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={5,6,7,8,99,0,0,0,0,0};
		int[] b={1,2,3,4,10};
		merge(a,5,b,5); //m is the count of values which are filled in the array , rest 0's are the empty spaces initialized to 0
		for(int i:a){
			System.out.println(i);
		}
	}

}
