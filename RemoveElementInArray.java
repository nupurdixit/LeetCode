package LeetCode;

public class RemoveElementInArray {
	public static int removeElement(int[] a,int val){
		int index=0;
		for(int i=0;i<a.length;i++){
			if(a[i]!=val){
				a[index++]=a[i];
			}
			
		}
		for(int i:a){
			System.out.print(i+" ");
		}
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={4,5,6,7,2,3,1,2,2};
		int len=removeElement(a,2);
		System.out.println("length of the new array is: "+len);
	}

}
