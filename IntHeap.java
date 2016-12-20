package LeetCode;

import java.util.ArrayList;

public class IntHeap {
	private ArrayList<Integer> heap;
	private int[] a;
	static int pos;
	private boolean heapType;
	
	public IntHeap(boolean min){
		heap=new ArrayList();
		heapType=min;
	}
	
	public IntHeap(int [] a,boolean min){
		heap=new ArrayList<>();
		heapType=min;
		buildHeapFromBottomToTop(a,min);
	}
	
	public int size(){
		pos=heap.size();
		return pos;
	}
	public int father(int x){
		int n=x/2;
		return (n>=0)?n:0;
	}
	
	public int left(int x){
		int n=2*x+1;
		return (n<=size()-1)?n:0;
	}
	
	public int right(int x){
		
		int n=2*x + 2;
		return (n<=size()-1)?n:0;
	}
	
	public boolean isFatherGreaterThanChild(int f,int s){
		//int f=father(s);
		return (heap.get(f)>=heap.get(s)?true:false);
	}
	
	public void insert(int x){
		heap.add(size(), x);
		heapifyUp();
		System.out.println("element at top is "+heap.get(0));
	}
	
	public void heapifyUp(){
		int s=size()-1;
		System.out.println("size is: "+s);
		while(true){
			int f=father(s);
			if(s==0){
				break;
			}
			boolean m=isFatherGreaterThanChild(f,s);
			if(heapType==true){
				if(m==false){
					break;
				}
			}
			else{
				if(m==true){
					break;
				}
			}
			System.out.println("f =:"+f);
			System.out.println("s= "+s);
			swap(f,s);
		
			s=f;
			
		}
		
	}
	
//	public void swap(int[] a,int x,int y){
//		int temp=a[x];
//		a[x]=a[y];
//		a[y]=temp;
//	}
	
	public void swap(int x,int y){
		int a=heap.get(x);
		heap.set(x,heap.get(y));
		heap.set(y,a);
	}
	public int top(){
		return heap.get(1);
	}
	
	public int minmax(int f){
		int l=left(f);
		int r=right(f);
		if(l==0){
			assert(r==0);
			return 0;
		}
		if(r==0){
			//System.out.println("r is absent");
			if(heapType==true){
				if(heap.get(f)>heap.get(l)){
					return l;
				}
			}
			else{
				if(heap.get(f)<heap.get(l)){
					return l;
				}
			}
		
		return 0;
		}
		//case for two childs
		if(heapType==true){
			int c=r; //say the right child is greater than the left child
			if(heap.get(l)<heap.get(r)){
				c=l;
			}
			if(heap.get(f)>heap.get(c)){
				return c;
			}
		}else{
			int c=r;
			if(heap.get(l)>heap.get(r)){
				c=l;
			}
			if(heap.get(f)<heap.get(c)){
				return c;
			}
		}
		return 0;
		
	}
	
	public void heapifyDown(int f){
		int s=0;
		while(true){
			s=minmax(f);
			//System.out.println("s= "+s);
			if(s==0){
				break;
			}
			//System.out.println("f = "+f);
			//System.out.println("s = "+s);
			
			swap(f,s);
			f=s;
			//System.out.println("heap.get(0) is "+heap.get(f));
		}
	}
	
	public void heapifyDown(){
		if(pos==1){
			pos=0;
		}
		else{
			swap(0,pos-1);
			--pos;
			heapifyDown(0);
		}
	}
	
	public boolean deleteTop(){
		if(!heap.isEmpty()){
			heapifyDown();
			System.out.println("element at top after deletion is: "+heap.get(0));
			return true;
			
		}
		return false;
	}
	
	public void buildHeapFromBottomToTop(int[] a,boolean min){
		for(int i=0;i<a.length;i++){
			heap.add(i, a[i]);
		}
		int nonLeaftStart=a.length/2;
		for(int i=nonLeaftStart;i>=1;i--){
			heapifyDown(i-1);
			//System.out.println(heap.get(i));
		}
		for(int i:a){
			System.out.println(heap.get(i)+" ");
		}
		//System.out.println(heap.get(0));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a={12,3,7,6,23,45,56,67,45,99,1};
		int[] a={0,1,2,3,4,5,6,7};
		boolean min=false;
		IntHeap intHeap=new IntHeap(a,min);
		//intHeap.deleteTop();
		//intHeap.insert(200);
		
	}
}


 