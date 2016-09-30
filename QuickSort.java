package LeetCode;

public class QuickSort {
	public static void quickSort(int start,int end,int[] a){
		if(start<end){
			int j=partition(start,end,a);
			quickSort(start,j-1,a);
			quickSort(j+1,end,a);
		}
	}
	
	public static int partition(int start,int end,int[] a){
		int pivot=start;
		int j=pivot;
		for(int i=start+1;i<=end;i++){
			if(a[i]<a[pivot]){
				j++;
				swap(a,j,i);
			}
		}
		swap(a,pivot,j);
		pivot=j;
		return pivot;
	}
	
	public static void swap(int[] a,int x,int y){
		int temp=a[x];
			a[x]=a[y];
			a[y]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={6,4,1,2,9,8,45,32,11};
		quickSort(0,a.length-1,a);
		for(int num:a){
			System.out.print(num+" ");
		}
	}

}
