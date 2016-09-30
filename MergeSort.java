package LeetCode;

public class MergeSort {
	public static void mergeSort(int start,int end,int[] a,int[] t){
		int mid=(end-start)/2+start;
		if(end-start>1){
			mergeSort(start,mid,a,t);
			mergeSort(mid,end,a,t);
			merge(start,mid,end,a,t);
		}
	}
	
	public static void merge(int start,int mid,int end,int[] a,int[] t){
		int i=start;
		int j=mid;
		int k=0;
		while(i<mid && j<end){
			if(a[i]<a[j]){  //for ascending order, in case of descending order just do a[i]>a[j]
				t[k++]=a[i++];
			}
			else{
				t[k++]=a[j++];
			}
		}
		
		while(i<mid){
			t[k++]=a[i++];
		}
		
		while(j<end){
			t[k++]=a[j++];
		}
		
		for(int f=0;f<k;f++){
			int p=start+f;
			a[p]=t[f];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a={5,4,1,22,45,2,9,8};
		int[] a={1}; 
		int[] temp=new int[a.length];
		mergeSort(0,a.length,a,temp);
		for(int num:a){
			System.out.println(num);
		}
	}

}
